package util;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;

public class DriverFactory {
    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initialize_Driver(String browser){
        properties = ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();
        if (browser.equals("Android")){
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("udid","emulator-5554");
            capabilities.setCapability("appPackage","com.dmall.mfandroid");
            capabilities.setCapability("appActivity","com.dmall.mfandroid.activity.base.NewSplash");
        }else if (browser.equals("IOS")){
            capabilities.setCapability("platformName","IOS");
            capabilities.setCapability("udid","");
            capabilities.setCapability("appPackage","");
            capabilities.setCapability("appActivity","");
        }

        try {
            driver = new AppiumDriver(new URL("https://0.0.0.0:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int imWait = Integer.parseInt(properties.getProperty("implicityWait"));
        driver.manage().timeouts().implicitlyWait(imWait, TimeUnit.SECONDS);
       return getDriver();

    }

    public  static AppiumDriver getDriver(){
    return driver;
    }
}
