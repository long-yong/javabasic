package assign;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PythagoreanTests {
    @BeforeAll  static void beforeAll(TestInfo testInfo) { System.out.println("\nStart  " + testInfo.getDisplayName()); }
    @AfterAll   static void afterAll(TestInfo testInfo)  { System.out.println("End    " + testInfo.getDisplayName()+"\n"); }
    @AfterEach  void tearDown(TestInfo testInfo) { System.out.println("Finished..." + testInfo.getDisplayName()); }

    static Pythagorean obj = new Pythagorean();

    @Test
    void test1()  { assertEquals(5.0, obj.calculateHypotenuse(3, 4), "3 & 4 should return 5"); }

    @Test
    void test2()  { assertEquals(5.0, obj.calculateHypotenuse(-3,-4), "-3 & -4 should return 5"); }

    @Test
    void test3()  { assertEquals(5.0, obj.calculateHypotenuse(0, 5), "0 & 5 should return 5"); }

}
