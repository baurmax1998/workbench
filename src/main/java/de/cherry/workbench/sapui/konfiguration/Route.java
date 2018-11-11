package de.cherry.workbench.sapui.konfiguration;

import java.util.List;

public class Route {
  private String pattern;

  public String getPattern() {
    return this.pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private List<String> target;

  public List<String> getTarget() {
    return this.target;
  }

  public void setTarget(List<String> target) {
    this.target = target;
  }

  private String titleTarget;

  public String getTitleTarget() {
    return this.titleTarget;
  }

  public void setTitleTarget(String titleTarget) {
    this.titleTarget = titleTarget;
  }
}
