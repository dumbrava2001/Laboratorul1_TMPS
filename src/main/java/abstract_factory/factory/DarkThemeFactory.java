package abstract_factory.factory;

import abstract_factory.widget.Button;
import abstract_factory.widget.TextField;
import abstract_factory.widget.dark.DarkButton;
import abstract_factory.widget.dark.DarkTextField;

public class DarkThemeFactory implements ThemeFactory{

  @Override
  public Button createButton() {
    return new DarkButton();
  }

  @Override
  public TextField createTextField() {
    return new DarkTextField();
  }
}
