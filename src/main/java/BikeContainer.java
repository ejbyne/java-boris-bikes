import java.util.ArrayList;

public class BikeContainer {

  private Bike[] bikes;
  private int bikesSize = 0;

  public BikeContainer() {
    bikes = new Bike[20];
  }

  public BikeContainer(int capacity) {
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
    remove(bikesIndex);
  }

  public ArrayList<Bike> availableBikes() {
    boolean isBroken = false;
    return selectedBikes(isBroken);
  }

  public ArrayList<Bike> unavailableBikes() {
    boolean isBroken = true;
    return selectedBikes(isBroken);
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
    throw new IndexOutOfBoundsException("Requested bike is not in docking station");
  }

  private void remove(int position) {
    for (int bikesIndex = position + 1; bikesIndex < bikesSize; bikesIndex ++) {
      bikes[bikesIndex - 1] = bikes[bikesIndex];
    }
    bikesSize --;
  }

  private ArrayList<Bike> selectedBikes(boolean isBroken) {
    ArrayList<Bike> selectedBikes = new ArrayList<Bike>();
    for (int bikesIndex = 0; bikesIndex < bikesSize; bikesIndex ++) {
      if (bikes[bikesIndex].isBroken() == isBroken) {
        selectedBikes.add(bikes[bikesIndex]);
      }
    }
    return selectedBikes;
  }

}
