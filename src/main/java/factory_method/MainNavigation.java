package factory_method;

import factory_method.factory.BaseNavigationFactory;
import factory_method.factory.CarFactory;
import factory_method.factory.FootFactory;
import factory_method.factory.PublicTransportFactory;
import java.util.Scanner;

public class MainNavigation {

  public static void main(String[] args) {
    var inputs = new Scanner(System.in);
    System.out.println("Insert current location:");
    String currentLocation = inputs.nextLine();
    System.out.println("Insert destination:");
    String destination = inputs.nextLine();
    System.out.println("Insert routing type:");
    String routingType = inputs.nextLine();
    var navigation = getFactory(routingType);
    if (navigation != null) {
      var routing = navigation.createRouting();
      routing.setCurrentLocation(currentLocation);
      routing.setDestination(destination);
      routing.startRouting();
    }
  }

  private static BaseNavigationFactory getFactory(String type) {
    if (type.equals("Car")) {
      return new CarFactory();
    }
    if (type.equals("Foot")) {
      return new FootFactory();
    }
    if (type.equals("Public")) {
      return new PublicTransportFactory();
    }
    return null;
  }
}
