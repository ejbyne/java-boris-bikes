public class Bike {

  private boolean broken = false;

  public boolean isBroken() {
    return broken;
  }

  public void breakBike() {
    broken = true;
  }

  public void fixBike() {
    broken = false;
  }

}
