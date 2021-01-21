package io.github.peteplako;



import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.parallel.Execution;

@Execution(CONCURRENT)
public class SeleniumJUnitTestDifferentSessionsParraler2 {

    private WebDriver driver;
    @BeforeAll
    static void setupClass() {
         System.setProperty("webdriver.chrome.driver",
                 "src/test/resources/chromedriver.exe");
     }

     @BeforeEach
     void setupTest() {
         driver = new ChromeDriver();
     }

   
     @Test
    void test() {
         driver.get("https://github.com/pete2121");
         assertTrue(driver.getTitle().startsWith("pete2121"));
                
     }
     
     @Test
     void test2() {
         driver.get("https://www.wikipedia.org/");
         assertTrue(driver.getTitle().startsWith("Wikipedia"));
                 
     }
     
     @AfterEach
     void teardown() {
             driver.quit();
         }
     
}
