package techproed.tests.day18_Annotion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_Priotity {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }

    @Test(priority = 2)
    public void amazonTest() {
        driver.get("https://amazon.com");
    }

    @Test(priority = 1)
    public void facebookTest() {
        driver.get("https://facebook.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
    /*
        TestNG de test methodlarımızı istediğimiz bir sıralamada çalıştırmak istersek @Test notasyonundan sonra
    parametre olarak priority yazarak sıralayabiliriz. @Test notasyonuna sahip bir method'da priority defauld
    olarak 0(sıfır) dır.
*/

