package suiteRunner.com.runner2.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import suiteRunner.com.runner2.common.Ipay;
import suiteRunner.com.runner2.common.Ipay1;
import suiteRunner.com.runner2.common.Ipay2;
import suiteRunner.com.runner2.common.Ipay3;

public class MyTests2 {
    @DataProvider(name = "Name2")
    public static Object[][] Name(){
        return new Object[][]{{new Ipay1()},{new Ipay2()},{new Ipay3()}/*{{1, 1, 2},{2, 2, 4},{3, 3, 6}*/};
    }

    @Test(dataProvider = "Name2")
    public void test1(Ipay pay/*int a, int b, int c*/) {
        System.out.println("get goods");
        pay.pay();
        System.out.println("pay");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
    }

    @Test
    public void test3() {
    }
}
