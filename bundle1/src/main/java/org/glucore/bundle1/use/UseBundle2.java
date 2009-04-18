package org.glucore.bundle1.use;

import org.glucore.bundle2.offer.*;
import org.glucore.bundle1.offer.*;

public class UseBundle2 {
  public void use() {
    OfferBundle1.test("Call from same bundle1");
    System.out.println("Bundle 1: " + OfferBundle2.test("Msg from bundle1"));
  }
}