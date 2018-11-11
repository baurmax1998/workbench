package de.cherry.workbench.sapui.model;

import java.io.File;
import java.io.Serializable;
import java.util.List;


public class View implements Serializable {
  private String name;

  private String filePath;

  public View(String name, File file) {
    this.name = name;
    this.filePath = file.getAbsolutePath();
  }

  public String getName() {
    return name;
  }

  public String getFilePath() {
    return filePath;
  }

  public static boolean isView(File file) {
    String name = file.getName();
    String[] split = name.split("\\.");
    return split[1]!= null && split[1].equals("view") && split[2] != null && split[2].equals("xml");
  }
}
