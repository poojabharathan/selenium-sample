package org.pooja;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class GoogleTest {
    public static final String PATH_CHROME_DRIVER = "Resources/drivers/chromedriver_87.exe";
    private static ChromeDriver driver;

    @BeforeClass
    public void init() {
        createDriver();
    }

    @Test
    public void goToGoogle() {
        driver.get("https://www.google.com");
    }

    public void createDriver() {
        File file = new File(PATH_CHROME_DRIVER);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
    }
}
