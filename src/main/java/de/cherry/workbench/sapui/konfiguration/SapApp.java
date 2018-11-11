package de.cherry.workbench.sapui.konfiguration;

public class SapApp
{
  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String type;

  public String getType() { return this.type; }

  public void setType(String type) { this.type = type; }

  private String i18n;

  public String getI18n() { return this.i18n; }

  public void setI18n(String i18n) { this.i18n = i18n; }

  private String title;

  public String getTitle() { return this.title; }

  public void setTitle(String title) { this.title = title; }

  private String description;

  public String getDescription() { return this.description; }

  public void setDescription(String description) { this.description = description; }

  private ApplicationVersion applicationVersion;

  public ApplicationVersion getApplicationVersion() { return this.applicationVersion; }

  public void setApplicationVersion(ApplicationVersion applicationVersion) { this.applicationVersion = applicationVersion; }

  private DataSources dataSources;

  public DataSources getDataSources() { return this.dataSources; }

  public void setDataSources(DataSources dataSources) { this.dataSources = dataSources; }
}
