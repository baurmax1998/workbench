package de.cherry.workbench.sapui.konfiguration;

public class HomeSlide
{
  private String viewName;

  public String getViewName() { return this.viewName; }

  public void setViewName(String viewName) { this.viewName = viewName; }

  private int viewLevel;

  public int getViewLevel() { return this.viewLevel; }

  public void setViewLevel(int viewLevel) { this.viewLevel = viewLevel; }

  private String parent;

  public String getParent() { return this.parent; }

  public void setParent(String parent) { this.parent = parent; }

  private String controlId;

  public String getControlId() { return this.controlId; }

  public void setControlId(String controlId) { this.controlId = controlId; }

  private String controlAggregation;

  public String getControlAggregation() { return this.controlAggregation; }

  public void setControlAggregation(String controlAggregation) { this.controlAggregation = controlAggregation; }
}
