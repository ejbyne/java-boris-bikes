import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class DockingStationTest {

  private DockingStation dockingStation;

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

}
