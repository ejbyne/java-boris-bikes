public class DockingStation {

  private Bike[] bikes = new Bike[1];
  private int currentSize = 0;

  public int bikeCount() {
    return currentSize;
  }

  public void dock(Bike bike) {
    bikes[currentSize++] = bike;
  }

}
