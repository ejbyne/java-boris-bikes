public class DockingStation {

  private Bike[] bikes;
  private int bikesSize = 0;

  public DockingStation() {
    bikes = new Bike[20];
  }

  public DockingStation(int capacity) {
    bikes = new Bike[capacity];
  }

  public int bikeCount() {
    return bikesSize;
  }

  public int capacity() {
    return bikes.length;
  }

  public void dock(Bike bike) {
    bikes[bikesSize] = bike;
    bikesSize ++;
  }

  // public void release() {

  // }

}
