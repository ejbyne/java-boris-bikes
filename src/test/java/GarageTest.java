import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class GarageTest {

  private Garage garage;
  private Bike bike;

  @Before
  public void beforeGarageTest() {
    garage = new Garage();
    bike = new Bike();
    bike.breakBike();
  }

  @Test
  public void hasDefaultCapacity() {
    assertSame(20, garage.capacity());
  }

  @Test
  public void canSetCapacity() {
    garage = new Garage(30);
    assertSame(30, garage.capacity());
  }

  @Test
  public void canRepairBikes() {
    assertTrue(bike.isBroken());
    garage.dock(bike);
    garage.fixBikes();
    assertFalse(bike.isBroken());
  }

}
