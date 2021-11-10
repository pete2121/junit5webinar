package io.github.peteplako;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.seljup.SeleniumJupiter;

@ExtendWith(SeleniumJupiter.class)
class SeleniumLocalWebDriverTest2 {

    @Test
    void testWithChromeAndFirefox(ChromeDriver driver1, EdgeDriver driver2) {
        driver1.get("http://www.seleniumhq.org/");
        driver2.get("http://junit.org/junit5/");
        assertTrue(driver1.getTitle().startsWith("Selenium"));
        assertTrue(driver2.getTitle().startsWith("JUnit 5"));
    }

}
