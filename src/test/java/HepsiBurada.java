import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HepsiBurada {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel5");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\javaprojeleri\\AppiumDemoProje\\Apps\\Hepsiburada.apk");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.hepsiburada.ui.startup.SplashActivity");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.pozitron.hepsiburada");
        AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(3000);
        MobileElement search=driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        search.sendKeys("karaca");
        search.click();
        MobileElement searchtext=driver.findElement(By.className("android.widget.EditText"));
        searchtext.sendKeys("karaca fincan takımı");
        //version1
        //version2
        //version3
        //version4
        //version5
        //version6
        //version7
        //version8
        //version9


    }

}
