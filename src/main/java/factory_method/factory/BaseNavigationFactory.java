package factory_method.factory;

import factory_method.routing.Routing;

public interface BaseNavigationFactory {

  Routing createRouting();
}
