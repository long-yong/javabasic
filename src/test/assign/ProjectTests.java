package assign;

import org.junit.jupiter.api.*;

class ProjectTests {

    @BeforeAll  static void beforeAll(TestInfo testInfo) { System.out.println("\nStart  " + testInfo.getDisplayName()); }
    @AfterAll   static void afterAll(TestInfo testInfo)  { System.out.println("End    " + testInfo.getDisplayName()+"\n"); }
    @AfterEach  void tearDown(TestInfo testInfo) { System.out.println("Finished..." + testInfo.getDisplayName()); }

    public static Project person = new Project();

    @Test
    void Test1() {
        Project John = new Project("John");
        Project Mary = new Project("Mary");
        Project Sharp = new Project("Sharp");
        John.setElevatorPitch(Mary);
        John.setElevatorPitch(Sharp);
        John.displayAttrs();
    }

}
