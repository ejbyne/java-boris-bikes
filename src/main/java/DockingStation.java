import java.util.ArrayList;

public class DockingStation {

  private BikeContainer bikeContainer;

  public DockingStation() {
    bikeContainer = new BikeContainer();
  }

  public DockingStation(int capacity) {
    bikeContainer = new BikeContainer(capacity);
  }

  public int bikeCount() {
    return bikeContainer.bikeCount();
  }

  public int capacity() {
    return bikeContainer.capacity();
  }

  public boolean isFull() {
    return bikeContainer.isFull();
  }

  public void dock(Bike bike) {
    bikeContainer.dock(bike);
  }

  public void release(Bike bike) {
    bikeContainer.release(bike);
  }

  public ArrayList<Bike> availableBikes() {
    return bikeContainer.availableBikes();
  }

  public ArrayList<Bike> unavailableBikes() {
    return bikeContainer.unavailableBikes();
  }

}
