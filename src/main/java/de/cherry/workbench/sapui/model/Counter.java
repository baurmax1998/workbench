package de.cherry.workbench.sapui.model;

public class Counter {
  private static Counter ourInstance = new Counter();

  public static Counter getInstance() {
    return ourInstance;
  }

  private Counter() {
  }

  private int test = 0;

  public int count(){
    return test++;
  }
}
