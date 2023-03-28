package abstract_factory.widget.dark;

import abstract_factory.widget.TextField;

public class DarkTextField extends TextField {

  public DarkTextField() {
    this.color = "PaleGray";
    this.value = "Dark";
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
    return this.value;
  }
}
