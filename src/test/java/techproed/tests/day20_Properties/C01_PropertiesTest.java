package techproed.tests.day20_Properties;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;

public class C01_PropertiesTest {
    @Test
    public void testtest01() {
   String url= ConfigReader.getProperty("amazonUrl");


    }
}
