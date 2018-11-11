package de.cherry.workbench.sapui.konfiguration;

import java.util.ArrayList;

public class Routing
{
  private Config config;

  public Config getConfig() { return this.config; }

  public void setConfig(Config config) { this.config = config; }

  private ArrayList<Route> routes;

  public ArrayList<Route> getRoutes() { return this.routes; }

  public void setRoutes(ArrayList<Route> routes) { this.routes = routes; }

  private Targets targets;

  public Targets getTargets() { return this.targets; }

  public void setTargets(Targets targets) { this.targets = targets; }
}
