package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DemoQAMain {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit wait (NO Thread.sleep)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/");

        // Click on Elements card
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();

        // Click on Text Box
        driver.findElement(By.xpath("//span[text()='Text Box']")).click();

        // Fill the form
        driver.findElement(By.id("userName"))
                .sendKeys("Tudarshan Tishan Tglave");

        driver.findElement(By.id("userEmail"))
                .sendKeys("test@gmail.com");

        driver.findElement(By.id("currentAddress"))
                .sendKeys("mp post test document");

        driver.findElement(By.id("permanentAddress"))
                .sendKeys("mp post test document");

        // Click submit (normal Selenium click)
        driver.findElement(By.id("submit")).click();

        driver.quit();
    }
}
