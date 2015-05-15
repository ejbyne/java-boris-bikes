import java.util.ArrayList;

public class Garage {

  private BikeContainer bikeContainer;

  public Garage() {
    bikeContainer = new BikeContainer();
  }

  public Garage(int capacity) {
    bikeContainer = new BikeContainer(capacity);
  }

  public void fixBikes() {
    ArrayList<Bike> unavailableBikes = bikeContainer.unavailableBikes();
    for (int bikesIndex = 0; bikesIndex < unavailableBikes.size(); bikesIndex ++) {
      unavailableBikes.get(bikesIndex).fixBike();
    }
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
