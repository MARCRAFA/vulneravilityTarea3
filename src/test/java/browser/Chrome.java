package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome implements  IBrowser{

    @Override
    public WebDriver create() {
        String driverPath="C:\\Users\\Marcos\\Desktop\\DIPLOMADO TESTING\\modulo 4\\vulnerability\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
