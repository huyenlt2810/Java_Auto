package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
    WebDriver webDriver;
    @Before
    public void setUp () {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUpTest () {
        webDriver = new ChromeDriver();
        webDriver.get("facebook.com");
    }
}
