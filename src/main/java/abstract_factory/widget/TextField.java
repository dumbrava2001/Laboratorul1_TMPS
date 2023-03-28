package abstract_factory.widget;

import java.util.UUID;

public abstract class TextField {

  protected UUID id = UUID.randomUUID();

  protected String value = "Dark";

  protected String color = "PaleGray";

  public abstract void paint();

  public abstract String getValue();
}
