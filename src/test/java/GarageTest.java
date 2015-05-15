import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.Before;

public class GarageTest {

  private Garage garage;
  private Bike bike;

  @Before
  public void beforeGarageTest() {
    garage = new Garage();
    bike = mock(Bike.class);
    when(bike.isBroken()).thenReturn(true);
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
    verify(bike).fixBike();
  }

}
