package de.cherry.workbench.sapui.konfiguration;

public class RootView
{
  private String viewName;

  public String getViewName() { return this.viewName; }

  public void setViewName(String viewName) { this.viewName = viewName; }

  private String type;

  public String getType() { return this.type; }

  public void setType(String type) { this.type = type; }

  private boolean async;

  public boolean getAsync() { return this.async; }

  public void setAsync(boolean async) { this.async = async; }

  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }
}
