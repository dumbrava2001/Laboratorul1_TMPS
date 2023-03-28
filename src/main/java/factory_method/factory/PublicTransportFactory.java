package factory_method.factory;

import factory_method.routing.PublicRouting;
import factory_method.routing.Routing;

public class PublicTransportFactory implements BaseNavigationFactory{

  @Override
  public Routing createRouting() {
    return new PublicRouting();
  }
}
