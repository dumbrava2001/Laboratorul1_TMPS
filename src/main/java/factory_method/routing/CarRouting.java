package factory_method.routing;

public class CarRouting extends Routing {

  @Override
  public double getTime() {
    int speed = 45;

    return getDistance() / speed;
  }

  @Override
  public double getDistance() {
    return (currentLocation + destination).length();
  }

  @Override
  public void startRouting() {
    System.out.println("<-------Rout on car starts------->");
    System.out.println("From " + currentLocation + " -> " + destination);
    System.out.println("Approximate Time: " + getTime());
    System.out.println("Approximate Distance: " + getDistance());
  }
}
