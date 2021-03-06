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
  public void canBeBroken() {
    bike.breakBike();
    assertTrue(bike.isBroken());
  }

  @Test
  public void canBeFixed() {
    bike.breakBike();
    bike.fixBike();
    assertFalse(bike.isBroken());
  }

}
