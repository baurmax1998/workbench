package de.cherry.workbench.sapui.model;

import java.io.File;

public class Fragment {

  public static boolean isFragement(File file) {
    String name = file.getName();
    String[] split = name.split("\\.");
    return split[1]!= null && split[1].equals("fragment") && split[2] != null && split[2].equals("xml");
  }
}
