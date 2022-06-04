package suiteRunner.com.runner1;

import org.junit.*;

public class TestMy1 {
    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println("test1");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("AfterClass");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("BeforeClass");
    }
}
