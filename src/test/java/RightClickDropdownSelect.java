import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RightClickDropdownSelect {

    @Test
    public void rightClick()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Suhas\\ATB4xSeleniumAutomation\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<String,Object>();

       // options.setExperimentalOption();
    }
}
