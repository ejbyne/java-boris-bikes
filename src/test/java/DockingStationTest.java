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
  public void canAcceptABike() {
    assertSame(0, dockingStation.bikeCount());
    dockingStation.dock(bike);
    assertSame(1, dockingStation.bikeCount());
  }

}
