package techproed.tests.day20_Properties;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_PropertiesTest {

    @Test
    public void test02() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        String url = ConfigReader.getProperty("OpenSourceUrl");
        Driver.getDriver().get(url);

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım
        OpenSourcePage sourcePage = new OpenSourcePage();
        String username = ConfigReader.getProperty("OSourceUserName");
        String password = ConfigReader.getProperty("OSourcePassword");
        sourcePage.userName.sendKeys(username, Keys.TAB, password, Keys.ENTER);

        //Login Testinin basarili oldugunu test et
        ReusableMethods.visibleWait(sourcePage.verify,15);
        Assert.assertTrue(sourcePage.verify.isDisplayed());

        //sayfayi kapatınız
        ReusableMethods.bekle(2);
        Driver.closeDriver();

    }
}
