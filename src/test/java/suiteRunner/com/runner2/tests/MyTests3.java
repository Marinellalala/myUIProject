package suiteRunner.com.runner2.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests3 {
    @Test
    public void test1() {
        Assert.assertEquals(2+2,4);
    }
}
