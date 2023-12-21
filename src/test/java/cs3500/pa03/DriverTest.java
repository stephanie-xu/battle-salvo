package cs3500.pa03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import cs3500.pa04.Driver;
import org.junit.jupiter.api.Test;

class DriverTest {

  @Test
  public void testDriverErr() {
    String[] args = {"1"};
    String[] argsEmpty = new String[0];
    try {
      Driver.main(args);
    } catch (Exception e) {
      fail();
    }
  }

}