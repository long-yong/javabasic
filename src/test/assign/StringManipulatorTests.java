package assign;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTests {
    @BeforeAll  static void beforeAll(TestInfo testInfo) { System.out.println("\nStart  " + testInfo.getDisplayName()); }
    @AfterAll   static void afterAll(TestInfo testInfo)  { System.out.println("End    " + testInfo.getDisplayName()+"\n"); }
    @AfterEach  void tearDown(TestInfo testInfo) { System.out.println("Finished..." + testInfo.getDisplayName()); }

    @Test
    void getIndexOrNullTest1()
    {
        Integer I; String str, substr; char c = 'o';

        I = 1; str = "Coding";
        assertEquals(I, StringManipulator.getIndexOrNull(str,c), "Coding should return 2");

        I = 4; str = "Hello World";
        assertEquals(I, StringManipulator.getIndexOrNull(str,c), "Hello World should return 4");

        I = null; str = "Hi";
        assertEquals(I, StringManipulator.getIndexOrNull(str,c), "Hi should return null");

    }

    @Test
    void getIndexOrNullTest2()
    {
        Integer I; String str, substr= "llo";

        I = 2; str = "Hello";
        assertEquals(I, StringManipulator.getIndexOrNull(str,substr), "Hello/llo should return 2");

        I = null; str = "world";
        assertEquals(I, StringManipulator.getIndexOrNull(str,substr), "world/llo should return null");

    }

    @Test
    void concatSubstringTest(){
        String str = "eworld", str1 = "Hello", str2 = "world";
        assertEquals(str, StringManipulator.concatSubstring(str1,1,2, str2), "Hello,1,2,world should return eworld");
    }

}
