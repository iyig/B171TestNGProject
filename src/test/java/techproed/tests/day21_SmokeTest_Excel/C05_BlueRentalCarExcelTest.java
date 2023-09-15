package techproed.tests.day21_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C05_BlueRentalCarExcelTest {

    @Test
    public void excelTest() {

        //BlueRentalCr sayfasına gidelim

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage rentalPage=new BlueRentalPage();


        //Excel dosyamızdaki tüm email ve passwordler ile login olalım ve login oldugumuzu doğrulayalım


        String dosyaYolu= "src/test/java/techproed/resources/mysmoketestdata (1).xlsx";
        String sayfaIsmi="customer_info";
        ExcelReader reader=new ExcelReader(dosyaYolu,sayfaIsmi);
        for (int i=1; i<=reader.rowCount();i++){
            String email=reader.getCellData(i,0);
            String password=reader.getCellData(i,1);
            rentalPage.loginButton.click();
            ReusableMethods.bekle(2);
            rentalPage.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(3);
            Assert.assertTrue(rentalPage.verify.isDisplayed());
            rentalPage.profileButton.click();
            ReusableMethods.bekle(1);
            rentalPage.logout.click();
            ReusableMethods.bekle(1);
            rentalPage.okButton.click();
        }
   ReusableMethods.bekle(1);
        Driver.closeDriver();
/*

Name:
US100402_Negative_Login
Description:
Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
Acceptance Criteria:
Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
Hata Mesaji:
Bad credentials
Test Data:
Customer email: jack@gmail.com
Customer password: fakepass
9:08


Name:
US101122_Negative_Login
Description:
Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
Acceptance Criteria:
Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
Error Message: email must be a valid email
Dogru email uzantisi girildiğinde hata mesajı alınmamalı
https://email-verify.my-addr.com/list-of-most-popularemail-
domains.php
email-verify.my-addr.comemail-verify.my-addr.com
Online Email Verify,Bulk Email checker,Validator,Verifier,$0.1 per 1000 emails
Online Email Verify service (industrial solution) with API, list, bulk, file verification tools. Verification speed up to 5 millions per day.


Murat YAMAN
  9:08 PM
 */
    }
}
