package runners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;


public class TestRule {

    private static WebDriver driver;
    String url = "https://secure.kanui.com.br/customer/account/login/";

    @Before
    public void beforeScenario() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://secure.kanui.com.br/customer/account/login/");

    }

    public static WebDriver getDriver() {
        return driver;

    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
