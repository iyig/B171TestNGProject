package techproed.tests.day21_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_NegatifTest {
    @Test(groups="smoke")
    public void negatifTest() {
        /*
            Negatif test senaryolarında sayfaya giriş yapılamaması ile ilgi senaryoları oluşturmamız gerekir.
        Bunun için önce örnekte ki gibi girmemiz gereken email deki mesala bir @ işareti yada bir noktalama işareti
        email'de olmadan şifre doğru bile olsa giriş yapmamamız gerekir. Aynı şekilde email doğru olsa şifre
        yanlış olsa yine giriş yapamamamız gerekir. Dolayısıyla negatif testlerde bu senaryoları göz önünde
        bulundurup buna göre test case lerimizi yazmamız gerekir.
         */


        //Name:
        //US100208_Negative_Login
        //Description:
        //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        //Acceptance Criteria
        //Customer email: fake@bluerentalcars.com
        //Customer password: fakepass
        //Error:
        //User with email fake@bluerentalcars.com not found

        //BlueRentalCar sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //Login buttonuna tıklayalım
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.loginButton.click();

        //Properties dosyasındaki kullanımda olmayan email ve password bilgileri ile login olamadığını test edelim
        String fakeEmail = ConfigReader.getProperty("fakeEmail");
        String fakePassword = ConfigReader.getProperty("fakePassword");
        rentalPage.email.sendKeys(fakeEmail, Keys.TAB, fakePassword, Keys.ENTER);
        Assert.assertTrue(rentalPage.verifyNegatif.isDisplayed());

        //sayfayı kapatınız
        Driver.closeDriver();
    }

        @Test
        public void test01() {

            /*
        Driver driver = new Driver();
        driver.getDriver().get("https://amazon.com");
            SINGLETON PATTER (tekli kullanım)
                Driver class'ındaki gizli const.'ı private yaparak Driver
            class'ından obje oluşturmanın önüne geçeriz.
         */
    }
}