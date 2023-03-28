package abstract_factory;

import abstract_factory.factory.DarkThemeFactory;
import abstract_factory.factory.LightThemeFactory;
import abstract_factory.factory.ThemeFactory;

public class AppUI {

  public static void main(String[] args) {
    System.out.println("Using dark theme");
    var themeFactory = getThemeFactory(InstalledTheme.DARK);

    var darkButton = themeFactory.createButton();
    darkButton.paint();
    var darkTextField = themeFactory.createTextField();
    darkTextField.paint();
    System.out.println("TextField value:" + darkTextField.getValue());

    System.out.println("\nUsing light theme");
    themeFactory = getThemeFactory(InstalledTheme.LIGHT);

    var lightButton = themeFactory.createButton();
    lightButton.paint();
    var lightTextField = themeFactory.createTextField();
    lightTextField.paint();
    System.out.println("TextField value:" + lightTextField.getValue());
  }
  private static ThemeFactory getThemeFactory(InstalledTheme themeType) {
    if (themeType == InstalledTheme.DARK) {
      return new DarkThemeFactory();
    } else {
      return new LightThemeFactory();
    }
  }
}
