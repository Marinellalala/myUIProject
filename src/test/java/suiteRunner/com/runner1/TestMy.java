package suiteRunner.com.runner1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMy {
    private int a;
    private int b;
    private int c;

    public TestMy(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /*@Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Ignored
    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://github.com/");
        Assert.assertEquals("https://github.com/", driver.getCurrentUrl());
        driver.quit();
        System.out.println("test");
    }

    /*@BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("AfterClass");*/

    @Test
    public void test3 (){
        Assert.assertEquals(c, a+b);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{2,2,4},{3,3,6},{4,4,8}});
    }
}
