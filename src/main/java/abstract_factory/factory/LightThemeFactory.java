package abstract_factory.factory;

import abstract_factory.widget.Button;
import abstract_factory.widget.TextField;
import abstract_factory.widget.light.LightButton;
import abstract_factory.widget.light.LightTextField;

public class LightThemeFactory implements ThemeFactory{

  @Override
  public Button createButton() {
    return new LightButton();
  }

  @Override
  public TextField createTextField() {
    return new LightTextField();
  }
}
