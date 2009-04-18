package org.glucore.bundle2.use;

import org.glucore.bundle1.offer.*;
import org.glucore.bundle2.offer.*;

public class UseBundle1 {
  public void use() {
    OfferBundle2.test("Call from bundle2");
    System.out.println("Bundle2:" + OfferBundle1.test("Msg from bundle2"));
  }
}