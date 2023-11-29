

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginPageAutomationChromeOptions extends BaseClass
{

   /* @BeforeSuite
    public void setUp() {
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas\\ATB4xSeleniumAutomation\\driver\\chromedriver.exe");
        options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
    }
*/
    @Test
   // @Description("Verify that with Valid username and Valid password, Login is successfull !!")
    public void testValidLogin() throws InterruptedException {

        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("seema.waghmode@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Seemasat25");
        driver.findElement(By.id("js-login-btn")).click();
        //Thread.sleep(5000);

        WebElement element =
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".page-heading")));
        Assert.assertTrue(driver.findElement(By.cssSelector(".page-heading")).isDisplayed());
/*
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.)*/

    }



}

