package com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Tab extends AbstractUiComponent {

  private final String title;

  @Override
  public void render() {
    System.out.println("Tab renders title: " + title);

    if (child != null) {
      child.render();
    }
  }
}
