package techproed.tests.day18_Annotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C06_SoftAssert {
/*

SoftAssertion kullanmak için önce SoftAssert class'ından bir obje oluştururuz. Ve bu obje daha önce
assertion da kullandigimiz aynı methodlar ile dogurlma yaparız. Ve yaptıgımız assertionlar en son nerde assertAll
 methodu kullanırsak orda assertionların sonucunu bize verir
 */
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
        @Test
        public void test01(){

          SoftAssert softAssert=new SoftAssert();
            //amazon sayfasına gidiniz
            driver.get("https://amazon.com");
        //başlıgın alışveriş icerdigini test edelim

            softAssert.assertTrue(driver.getTitle().contains("alısveris"));

            //arama kutusunda iphone aratalım
            WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("iphone", Keys.ENTER);
          softAssert.assertEquals(2,2);


            //sonuç yazısının iphone içerdiğini test edelim
            String sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")).getText();
            Assert.assertTrue(sonucYazisi.contains("iphone"));
            softAssert.assertTrue(false);
            softAssert.assertAll();
    }
}