package abstract_factory.widget.light;

import abstract_factory.widget.TextField;

public class LightTextField extends TextField {

  public LightTextField() {
    this.color = "White";
    this.value = "Light";
  }

  @Override
  public void paint() {
    System.out.println("Painting dark theme TextField");
    System.out.println(
        id + "{" + "color:" + color + "value: " + value
            + "}");
  }

  @Override
  public String getValue() {
    return value;
  }
}
