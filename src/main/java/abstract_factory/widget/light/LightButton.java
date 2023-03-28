package abstract_factory.widget.light;

import abstract_factory.widget.Button;

public class LightButton extends Button {

  public LightButton() {
    this.title = "LightButton";
    this.color = "White";
    this.border = "BoxBorder.none";
    this.borderRadius = 0;
  }

  @Override
  public void paint() {
    System.out.println("Painting light theme Button");
    System.out.println(
        title + "{" + "color:" + color + ",border:" + border + ",borderRadius:" + borderRadius
            + "}");
  }
}
