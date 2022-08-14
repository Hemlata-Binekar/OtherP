package TestNG2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dpGmail {
   @DataProvider
  public Object[][] Gmaildata() {
    return new Object[][] {
      new Object[] { "hbinekar45@gmail.com", "12345" },
      new Object[] { "hbinekar04@gmail.com", "123455" },
      new Object[] { "hbinekar45@gmail.com", "jiyu$2321" },
    };
  }
}
