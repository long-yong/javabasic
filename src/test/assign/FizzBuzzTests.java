package assign;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTests {
    @BeforeAll  static void beforeAll(TestInfo testInfo) { System.out.println("\nStart  " + testInfo.getDisplayName()); }
    @AfterAll   static void afterAll(TestInfo testInfo)  { System.out.println("End    " + testInfo.getDisplayName()+"\n"); }
    @AfterEach  void tearDown(TestInfo testInfo) { System.out.println("Finished..." + testInfo.getDisplayName()); }

    static FizzBuzz obj = new FizzBuzz();

    @Test
    void test1()  { assertEquals("Fizz", obj.fizzBuzz(3), "3 should return Fizz"); }

    @Test
    void test2()  { assertEquals("Buzz", obj.fizzBuzz(5), "5 should return Buzz"); }

    @Test
    void test3()  { assertEquals("FizzBuzz", obj.fizzBuzz(15), "15 should return FizzBuzz"); }

    @Test
    void test4()  { assertEquals("7", obj.fizzBuzz(7), "4 should return 7"); }

}
