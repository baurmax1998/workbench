package de.cherry.workbench.sapui.konfiguration;

import java.util.HashMap;

public class Dependencies
{
  private String minUI5Version;

  public String getMinUI5Version() { return this.minUI5Version; }

  public void setMinUI5Version(String minUI5Version) { this.minUI5Version = minUI5Version; }

  private HashMap<String, Object> libs;

  public HashMap<String, Object> getLibs() { return this.libs; }

  public void setLibs(HashMap<String, Object> libs) { this.libs = libs; }
}
