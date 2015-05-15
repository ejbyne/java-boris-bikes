import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class VanTest {

  private Van van;

  @Test
  public void hasDefaultCapacity() {
    van = new Van();
    assertSame(20, van.capacity());
  }

  @Test
  public void canSetCapacity() {
    van = new Van(30);
    assertSame(30, van.capacity());
  }

}
