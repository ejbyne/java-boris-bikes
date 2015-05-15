import java.util.ArrayList;

public class DockingStation implements Dockable {

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

  public void transferTo(Dockable otherBikeDocker, ArrayList<Bike> selectedBikes) {
    bikeContainer.transferTo(otherBikeDocker, selectedBikes);
  }

  public ArrayList<Bike> availableBikes() {
    return bikeContainer.availableBikes();
  }

  public ArrayList<Bike> unavailableBikes() {
    return bikeContainer.unavailableBikes();
  }

}
