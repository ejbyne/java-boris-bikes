public class Garage {

  private BikeContainer bikeContainer;

  public Garage() {
    bikeContainer = new BikeContainer();
  }

  public Garage(int capacity) {
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

}
