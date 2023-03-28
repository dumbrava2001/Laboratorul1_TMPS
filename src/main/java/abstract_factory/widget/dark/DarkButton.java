package abstract_factory.widget.dark;

import abstract_factory.widget.Button;

public class DarkButton extends Button {

  public DarkButton() {
    this.title = "DarkButton";
    this.color = "PaleBlack";
    this.border = "BoxBorder.all()";
    this.borderRadius = 10;
  }

  @Override
  public void paint() {
    System.out.println("Painting dark theme Button");
    System.out.println(
        title + "{" + "color:" + color + ",border:" + border + ",borderRadius:" + borderRadius
            + "}");
  }
}
