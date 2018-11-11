package de.cherry.workbench.sapui;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.cherry.workbench.general.FileCollector;
import de.cherry.workbench.sapui.konfiguration.SapUiManifest;
import de.cherry.workbench.sapui.model.Fragment;
import de.cherry.workbench.sapui.model.Model;
import de.cherry.workbench.sapui.model.View;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

public class SapUiBench {

  private static SapUiBench ourInstance;

  public static SapUiBench getInstance() {
    if (ourInstance == null){
      ourInstance = new SapUiBench();
      ourInstance.init();
    }
    return ourInstance;
  }

  private SapUiBench() {
  }

  private File manifestFile;
  private SapUiManifest manifest;
  private String appId;

  public SapUiBench(File manifestFile) {
    this.manifestFile = manifestFile;
  }


  public void init() {
    setManifest(manifestFile);
    appId = manifest.getSapApp().getId();

    String viewPathString = manifest.getSapUi5().getRouting().getConfig().getViewPath();
    viewPathString = viewPathString.substring(appId.length()).replace('.', File.separatorChar);
    File root = getRoot();
    File viewRoot = new File(root.getAbsolutePath() + viewPathString);
    File modelRoot = new File(root.getAbsolutePath() + "/model");
    File controllerRoot = new File(root.getAbsolutePath() + "/controller");
    File fragmentRoot = new File(root.getAbsolutePath() + "/view");


    HashMap<String, File> views = getAllViews(viewRoot);
    HashMap<String, File> models = getAllModels(modelRoot);
    HashMap<String, File> fragments = getAllFragments(fragmentRoot);

    System.out.println(views);


    System.out.println("ende");


  }

  private File getRoot() {
    return manifestFile.getParentFile();
  }

  private HashMap<String, File> getAllFragments(File fragmentRoot) {
    HashMap<String, File> fragments = new HashMap<>();
    List<File> allFragments = FileCollector.in(fragmentRoot, Fragment::isFragement);
    for (int i = 0; i < allFragments.size(); i++) {
      File file = allFragments.get(i);
      String pathFromRoot = getRelativPath(file);
      String fragmentName = (appId + pathFromRoot.substring(0, pathFromRoot.length() - ".fragment.xml".length()))
          .replace(File.separatorChar, '.');
      fragments.put(fragmentName, file);
    }
    return fragments;
  }

  private HashMap<String, File> getAllModels(File modelRoot) {
    HashMap<String, File> models = new HashMap<>();
    List<File> allModels = FileCollector.in(modelRoot, Model::isModel);
    for (int i = 0; i < allModels.size(); i++) {
      File file = allModels.get(i);
      String pathFromRoot = getRelativPath(file);
      String modelName = (appId + pathFromRoot.substring(0, pathFromRoot.length() - ".model.js".length()))
          .replace(File.separatorChar, '.');
      models.put(modelName, file);
    }
    return models;
  }

  private HashMap<String, File> getAllViews(File viewRoot) {
    HashMap<String, File> views = new HashMap<>();
    List<File> allViews = FileCollector.in(viewRoot, View::isView);
    for (int i = 0; i < allViews.size(); i++) {
      File file = allViews.get(i);
      String pathFromRoot = getRelativPath(file);
      String viewName = (appId + pathFromRoot.substring(0, pathFromRoot.length() - ".view.xml".length()))
          .replace(File.separatorChar, '.');
      views.put(viewName, file);
    }
    return views;
  }

  private void setManifest(File manifestFile)  {
    try {
      ObjectMapper objectMapper = new ObjectMapper();
      String sapuiManifestJson = new String(Files.readAllBytes(manifestFile.toPath()));
      manifest = objectMapper.readValue(sapuiManifestJson, SapUiManifest.class);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private String getRelativPath(File file) {
    String absolutePath = file.getAbsolutePath();
    return absolutePath.substring(getRoot().getAbsolutePath().length());
  }


}
