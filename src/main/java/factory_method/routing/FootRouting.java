package factory_method.routing;

public class FootRouting extends Routing{

  @Override
  public double getTime() {
    int speed = 5;

    return getDistance() / speed;
  }

  @Override
  public double getDistance() {
    return (currentLocation + destination).length();
  }

  @Override
  public void startRouting() {
    System.out.println("<-------Rout on foot starts------->");
    System.out.println("From " + currentLocation + " -> " + destination);
    System.out.println("Approximate Time: " + getTime());
    System.out.println("Approximate Distance: " + getDistance());
  }
}
