package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in ";
    static String browser = "Chrome";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        // maximise the browser window
        driver.manage().window().maximize();
        driver.get(baseUrl);

        //we give Iplicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        //Get the current URL
        System.out.println("Current Url:" + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page source:" + driver.getPageSource());
        //Find the email Field Element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        // Type the username to usernameField element
        emailField.sendKeys("prime123@gmail.com");
        // Type the Password to Password field element
        driver.findElement(By.name("user[password]")).sendKeys("Prime123");
        // close the browser
           driver.close();
           driver.quit();
    }
}