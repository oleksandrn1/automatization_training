package ua.sport;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        driver = new ChromeDriver();

        System.out.println("START");
    }

    @After
    public void close() {
        System.out.println("FINISH");

        driver.quit();
    }
}
