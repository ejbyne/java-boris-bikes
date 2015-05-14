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

  public boolean isFull() {
    return bikesSize == bikes.length;
  }

  public void dock(Bike bike) {
    checkCapacity();
    bikes[bikesSize] = bike;
    bikesSize ++;
  }

  public void release(Bike bike) {
    int bikesIndex = find(bike);
    if (bikesIndex != -1) {
      remove(bikesIndex);
    }
  }

  private void checkCapacity() {
    if (isFull()) {
      throw new IndexOutOfBoundsException("Docking station is full");
    }
  }

  private int find(Bike bike) {
    for (int bikesIndex = 0; bikesIndex < bikesSize; bikesIndex ++) {
      if (bikes[bikesIndex] == bike) {
        return bikesIndex;
      }
    }
    return -1;
  }

  private void remove(int position) {
    for (int bikesIndex = position + 1; bikesIndex < bikesSize; bikesIndex ++) {
      bikes[bikesIndex - 1] = bikes[bikesIndex];
    }
    bikesSize --;
  }

}
