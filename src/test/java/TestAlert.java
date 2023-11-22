import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAlert {

    WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

    }

    @Test
    public void testValidLogin()
    {


        //login

        //Enter username
        driver.findElement(By.name("username")).sendKeys("seema.waghmode@gmail.com");
        //Enter Password
        driver.findElement(By.name("password")).sendKeys("Seemasat25");
        //Click Login
        driver.findElement(By.id("js-login-btn")).click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.page-heading")));

        //Assertion
        //Expected Result == Actual Result

        Assert.assertEquals(driver.getTitle(),"Dashboard");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");

    }

    @AfterSuite
    @Test
    public void teardown()
    {
        driver.quit();
    }

}
