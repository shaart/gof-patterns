package com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components;

public class Button extends AbstractUiComponent {

  @Override
  public void handleClick() {
    System.out.println("Clicked button");
  }
}
