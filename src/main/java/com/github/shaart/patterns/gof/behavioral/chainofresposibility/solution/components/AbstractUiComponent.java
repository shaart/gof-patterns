package com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components;

import lombok.Setter;

public abstract class AbstractUiComponent implements UiElement {

  @Setter
  protected UiElement parent;
  protected UiElement child;

  public void setChild(UiElement child) {
    this.child = child;
    child.setParent(this);
  }

  @Override
  public void handleClick() {
    System.out.printf("'%s': nothing to do with click, delegating to parent%n",
        this.getClass().getSimpleName());
    if (parent != null) {
      parent.handleClick();
    }
  }

  @Override
  public void render() {
    System.out.printf("Rendering element '%s'%n", this.getClass().getSimpleName());
    if (child != null) {
      child.render();
    }
  }
}
