import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class BikeContainerTest {

  private BikeContainer bikeContainer;
  private Bike bike;

  @Before
  public void beforebikeContainerTest() {
    bikeContainer = new BikeContainer();
    bike = new Bike();
  }

  private void fillbikeContainer() {
    for (int i = 0; i < bikeContainer.capacity(); i++) {
      bikeContainer.dock(bike);
    }
  }

  @Test
  public void hasDefaultCapacity() {
    assertSame(20, bikeContainer.capacity());
  }

  @Test
  public void canSetCapacity() {
    bikeContainer = new BikeContainer(30);
    assertSame(30, bikeContainer.capacity());
  }

  @Test
  public void canAcceptABike() {
    assertSame(0, bikeContainer.bikeCount());
    bikeContainer.dock(bike);
    assertSame(1, bikeContainer.bikeCount());
  }

  @Test
  public void canReleaseABike() {
    bikeContainer.dock(bike);
    bikeContainer.release(bike);
    assertSame(0, bikeContainer.bikeCount());
  }

  @Test
  public void knowsWhenItIsFull() {
    fillbikeContainer();
    assertTrue(bikeContainer.isFull());
  }

  @Test
  public void doesNotAcceptABikeIfItIsFull() {
    fillbikeContainer();
    try {
      bikeContainer.dock(bike);
      fail("Expected an IndexOutOfBoundsException to be thrown");
    } catch(IndexOutOfBoundsException anIndexOutOfBoundsException) {
      assertSame("Docking station is full", anIndexOutOfBoundsException.getMessage());
    }
  }

  @Test
  public void doesNotReleaseABikeWhichIsNotThere() {
    Bike missingBike = new Bike();
    bikeContainer.dock(bike);
    try {
      bikeContainer.release(missingBike);
      fail("Expected an IndexOutOfBoundsException to be thrown");
    } catch(IndexOutOfBoundsException anIndexOutOfBoundsException) {
      assertSame("Requested bike is not in docking station", anIndexOutOfBoundsException.getMessage());
    }
  }

}
