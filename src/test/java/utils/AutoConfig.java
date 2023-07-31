package utils;

import constants.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class AutoConfig {



    private static final Properties properties = new Properties();

    private static void loadProperties() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(Config.PROPERTIES_ROOT);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static WebDriver startDriver(){
      return new ChromeDriver();
    }

    public static void configureDriver(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static String getUrl() {
        loadProperties();
        System.out.println(properties.getProperty("url"));
        return properties.getProperty("url");
    }
}
