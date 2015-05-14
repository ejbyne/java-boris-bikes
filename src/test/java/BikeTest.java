import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class BikeTest {

  private Bike bike;

  @Before
  public void beforeBikeTest() {
    bike = new Bike();
  }

  @Test
  public void newInstanceShouldNotBeBroken() {
    assertFalse(bike.isBroken());
  }

  @Test
  public void instanceCanBeBroken() {
    bike.breakBike();
    assertTrue(bike.isBroken());
  }

  @Test
  public void instanceCanBeFixed() {
    bike.breakBike();
    bike.fixBike();
    assertFalse(bike.isBroken());
  }

}
