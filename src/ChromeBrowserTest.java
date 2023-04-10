import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // base url
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in ";
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        //Open  the  url into Browser
        driver.get(baseUrl);
        //Maximise the Browser window
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        //get the current URL
        System.out.println("Current Url:" + driver.getCurrentUrl());
        // get the pge source
        System.out.println("page source:" + driver.getPageSource());
        //find the email Field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        // Type the email to emailField element
        emailField.sendKeys("Prime123@gmail.com");
        // find the Password Field element
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        // Type the Password to Password field element
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");
        // Close the Browser
          driver.close();
          driver.quit();
    }
}
