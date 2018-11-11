package de.cherry.workbench.sapui.konfiguration;

public class Config
{
  private String routerClass;

  public String getRouterClass() { return this.routerClass; }

  public void setRouterClass(String routerClass) { this.routerClass = routerClass; }

  private String viewType;

  public String getViewType() { return this.viewType; }

  public void setViewType(String viewType) { this.viewType = viewType; }

  private String viewPath;

  public String getViewPath() { return this.viewPath; }

  public void setViewPath(String viewPath) { this.viewPath = viewPath; }

  private String controlId;

  public String getControlId() { return this.controlId; }

  public void setControlId(String controlId) { this.controlId = controlId; }

  private String controlAggregation;

  public String getControlAggregation() { return this.controlAggregation; }

  public void setControlAggregation(String controlAggregation) { this.controlAggregation = controlAggregation; }

  private String transition;

  public String getTransition() { return this.transition; }

  public void setTransition(String transition) { this.transition = transition; }

  private Bypassed bypassed;

  public Bypassed getBypassed() { return this.bypassed; }

  public void setBypassed(Bypassed bypassed) { this.bypassed = bypassed; }

  private boolean async;

  public boolean getAsync() { return this.async; }

  public void setAsync(boolean async) { this.async = async; }
}
