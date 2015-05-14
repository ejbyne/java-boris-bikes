import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class DockingStationTest {

  private DockingStation dockingStation;
  private Bike bike;

  @Before
  public void beforeDockingStationTest() {
    dockingStation = new DockingStation();
    bike = new Bike();
  }

  @Test
  public void hasDefaultCapacity() {
    dockingStation = new DockingStation();
    assertSame(20, dockingStation.capacity());
  }

  @Test
  public void canSetCapacity() {
    dockingStation = new DockingStation(30);
    assertSame(30, dockingStation.capacity());
  }

  @Test
  public void canAcceptABike() {
    assertSame(0, dockingStation.bikeCount());
    dockingStation.dock(bike);
    assertSame(1, dockingStation.bikeCount());
  }

  // @Test
  // public void canReleaseABike() {
  //   dockingStation.dock(bike);
  //   assertSame(1, dockingStation.bikeCount());
  //   dockingStation.release(bike);
  //   assertSame(0, dockingStation.bikeCount());
  // }

}
