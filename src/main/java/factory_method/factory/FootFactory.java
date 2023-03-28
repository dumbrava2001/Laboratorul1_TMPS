package factory_method.factory;

import factory_method.routing.FootRouting;
import factory_method.routing.Routing;

public class FootFactory implements BaseNavigationFactory {
  @Override
  public Routing createRouting() {
    return new FootRouting();
  }
}
