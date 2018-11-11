package de.cherry.workbench.sapui.konfiguration;

import java.util.HashMap;

public class SapUi
{
  private String technology;

  public String getTechnology() { return this.technology; }

  public void setTechnology(String technology) { this.technology = technology; }

  private HashMap<String, String> icons;

  public HashMap<String, String> getIcons() { return this.icons; }

  public void setIcons(HashMap<String, String> icons) { this.icons = icons; }

  private DeviceTypes deviceTypes;

  public DeviceTypes getDeviceTypes() { return this.deviceTypes; }

  public void setDeviceTypes(DeviceTypes deviceTypes) { this.deviceTypes = deviceTypes; }
}
