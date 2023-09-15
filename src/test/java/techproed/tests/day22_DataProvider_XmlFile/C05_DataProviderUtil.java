package techproed.tests.day22_DataProvider_XmlFile;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtil;

public class C05_DataProviderUtil {

/*

TestNG frameWorkunda test classlarımızda genllikle sadece test methodlarımız olur Dolaysıyla dataprovider kullanacakska
@DataProvider notasyonuna sahip methodu da başka bir classta oluşturabiliriz
Bunun icin @Test notasyonundan sonra dataProvider parametresi ile bilrikte dataProviderClass parametresini kulla
narak

 */

    @Test(dataProvider ="veriler",dataProviderClass= DataProviderUtil.class)
    public void test01(String data) {

        System.out.println(data);

    }
}
