import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class GarageTest {

  private Garage garage;

  @Test
  public void hasDefaultCapacity() {
    garage = new Garage();
    assertSame(20, garage.capacity());
  }

  @Test
  public void canSetCapacity() {
    garage = new Garage(30);
    assertSame(30, garage.capacity());
  }

}
