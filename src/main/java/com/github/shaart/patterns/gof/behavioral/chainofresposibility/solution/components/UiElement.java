package com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components;

public interface UiElement {

  void setParent(UiElement parent);
  void setChild(UiElement child);

  void handleClick();
  void render();
}
