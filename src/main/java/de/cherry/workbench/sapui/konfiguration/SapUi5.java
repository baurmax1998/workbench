package de.cherry.workbench.sapui.konfiguration;

public class SapUi5
{
  private RootView rootView;

  public RootView getRootView() { return this.rootView; }

  public void setRootView(RootView rootView) { this.rootView = rootView; }

  private Dependencies dependencies;

  public Dependencies getDependencies() { return this.dependencies; }

  public void setDependencies(Dependencies dependencies) { this.dependencies = dependencies; }

  private ContentDensities contentDensities;

  public ContentDensities getContentDensities() { return this.contentDensities; }

  public void setContentDensities(ContentDensities contentDensities) { this.contentDensities = contentDensities; }

  private Models models;

  public Models getModels() { return this.models; }

  public void setModels(Models models) { this.models = models; }

  private boolean handleValidation;

  public boolean getHandleValidation() { return this.handleValidation; }

  public void setHandleValidation(boolean handleValidation) { this.handleValidation = handleValidation; }

  private Resources resources;

  public Resources getResources() { return this.resources; }

  public void setResources(Resources resources) { this.resources = resources; }

  private Routing routing;

  public Routing getRouting() { return this.routing; }

  public void setRouting(Routing routing) { this.routing = routing; }
}
