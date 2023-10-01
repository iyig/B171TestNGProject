package techproed.tests.day23_Listeners;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(techproed.utilities.Listeners.class)
public class C01_ListenersTest {

/*
 TestNG de Lİsteners kullanbabilmek icin utilities package'ı altında Listeners isminde bir class oluşturup
 bu class'ı  ITestlİstener,IRetryAnalyzer, IANnotation.transformer arayüzlerine implement ederiz
Test class'ımızda Listeners kullanabilmek için class'dan önce @Listeners notasyonu eklememiz gerekir
ve bu notasyona oluşturmuş oldugunuz Listeners class'ını argüman olarak tanımlamız gerekir.


 */

    @Test
    public void test01() {

        System.out.println("Test Passed");
        Assert.assertTrue(true);
        Assert.assertEquals(1,1);
    }

    @Test
    public void test02() {
        System.out.println("Test Failes");
    Assert.assertEquals(1,2);

    }
}
