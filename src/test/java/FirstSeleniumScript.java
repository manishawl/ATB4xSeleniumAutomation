import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstSeleniumScript {
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suhas\\ATB4xSeleniumAutomation\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://thetestingacademy.com/");

    }
}
