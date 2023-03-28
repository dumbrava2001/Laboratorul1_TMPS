package factory_method.factory;

import factory_method.routing.CarRouting;
import factory_method.routing.Routing;

public class CarFactory implements BaseNavigationFactory {

  @Override
  public Routing createRouting() {
    return new CarRouting();
  }
}
