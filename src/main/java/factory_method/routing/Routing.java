package factory_method.routing;

public abstract class Routing {

  protected String currentLocation;
  protected String destination;

  public void setCurrentLocation(String currentLocation){
    this.currentLocation = currentLocation;
  }

  public void setDestination(String destination){
    this.destination = destination;
  }

  public abstract double getTime();

  public abstract double getDistance();

  public abstract void startRouting();
}
