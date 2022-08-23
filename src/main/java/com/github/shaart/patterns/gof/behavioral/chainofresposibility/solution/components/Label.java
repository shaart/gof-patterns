package com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Label extends AbstractUiComponent {

  private final String text;

  @Override
  public void render() {
    System.out.printf("Label renders text: %s%n", text);

    if (child != null) {
      child.render();
    }
  }
}
