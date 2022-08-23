package com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution;

import com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components.Button;
import com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components.Label;
import com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components.Section;
import com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components.Tab;
import com.github.shaart.patterns.gof.behavioral.chainofresposibility.solution.components.WebPage;

public class Main {

  public static void main(String[] args) {
    var page = new WebPage();
    var tab = new Tab("Main");
    var section = new Section();
    var button = new Button();
    var label = new Label("Sample");

    page.setChild(tab);
    tab.setChild(section);
    section.setChild(button);
    button.setChild(label);

    System.out.println(">> Rendering page at main");
    page.render();
    System.out.println(">> Clicking on label at main");
    label.handleClick();
  }
}
