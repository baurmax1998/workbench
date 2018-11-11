package de.cherry.workbench.sapui.model;

import java.io.File;

public class Model {
  public static Boolean isModel(File file) {
    String name = file.getName();
    String[] split = name.split("\\.");
    return split[1]!= null && split[1].equals("model") && split[2] != null && split[2].equals("js");
  }
}
