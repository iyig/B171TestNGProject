package techproed.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {



    /*

  .properrties dosyasındaki datalara ulşaşabilmek icin retunr type'i String olan parametreli static bir method oluşturu
  ruz.Bu method içinde properties class'ından bir obje oluştururuz. Ve FileInputStream ile  .properties uzantıli
  dosyamızı akışa alır,, Properties class'ından oluşturdugumuz obje'ye akışa aldıgımız dosyayı load() methodu ile
  yükleriz. Ve son olarak Properties class'ından oluşturduğumuz obje ile getProperty() methodunu kullanır ve
  girelen key'in degerini bize return eder.

     */

public static String getProperty(String key){
    Properties properties =new Properties();

    try {
        FileInputStream fis=new FileInputStream("configuration.properties");

        properties.load(fis);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
return properties.getProperty(key);
}
}