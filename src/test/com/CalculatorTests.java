package com;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTests {
    @BeforeAll  static void beforeAll(TestInfo testInfo) { System.out.println("\nStart  " + testInfo.getDisplayName()); }
    @AfterAll   static void afterAll(TestInfo testInfo)  { System.out.println("End    " + testInfo.getDisplayName()+"\n"); }
    @AfterEach  void tearDown(TestInfo testInfo) { System.out.println("Finished..." + testInfo.getDisplayName()); }

    @Test
    void addTest() {
        assertEquals(3, Calculator.add(2, 1), "2 + 1 should equal 3");
    }

    @Test
    void delTest() {
        assertEquals(1, Calculator.del(2, 1), "2 - 1 should equal 1");
    }

    @Test
    void mulTest() {
        assertEquals(2, Calculator.mul(2, 1), "2 * 1 should equal 2");
    }

}
