package techproed.tests.day23_Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_ListenersTest {
    @Test
    public void test01() {

        System.out.println("Test Passed");
        Assert.assertTrue(true);
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test02() {
        System.out.println("Test Failes");
        Assert.assertEquals(1, 2);

    }
}