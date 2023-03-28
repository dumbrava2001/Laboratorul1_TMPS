package abstract_factory.factory;

import abstract_factory.widget.Button;
import abstract_factory.widget.TextField;

public interface ThemeFactory {
  Button createButton();

  TextField createTextField();
}
