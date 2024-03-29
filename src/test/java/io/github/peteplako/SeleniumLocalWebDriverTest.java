package io.github.peteplako;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.seljup.SeleniumJupiter;

@ExtendWith(SeleniumJupiter.class)
public class SeleniumLocalWebDriverTest {

    @Test
    public void testWithChrome(ChromeDriver chrome) {
        chrome.get("https://junit.org/junit5");
        assertTrue(chrome.getTitle().startsWith("JUnit 5"));
    }

    @Test
    public void testWithEdge(EdgeDriver  edge) {
    	edge.get("http://www.seleniumhq.org/");

        assertTrue(edge.getTitle().startsWith("Selenium"));
    }

}
