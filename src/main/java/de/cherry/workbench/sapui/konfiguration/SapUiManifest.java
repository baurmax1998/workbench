package de.cherry.workbench.sapui.konfiguration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SapUiManifest {
  @JsonProperty("_version")
  private String _version;

  public String getVersion() {
    return this._version;
  }

  public void setVersion(String _version) {
    this._version = _version;
  }

  @JsonProperty(value = "sap.app")
  private SapApp sapApp;

  public SapApp getSapApp() {
    return this.sapApp;
  }

  public void setSapApp(SapApp sapApp) {
    this.sapApp = sapApp;
  }

  @JsonProperty(value = "sap.ui")
  private SapUi sapUi;

  public SapUi getSapUi() {
    return this.sapUi;
  }

  public void setSapUi(SapUi sapUi) {
    this.sapUi = sapUi;
  }

  @JsonProperty(value = "sap.ui5")
  private SapUi5 sapUi5;

  public SapUi5 getSapUi5() {
    return this.sapUi5;
  }

  public void setSapUi5(SapUi5 sapUi5) {
    this.sapUi5 = sapUi5;
  }
}


