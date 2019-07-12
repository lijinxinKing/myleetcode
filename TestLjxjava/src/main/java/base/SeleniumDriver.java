package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriver {
    private WebDriver driver;
    public WebDriver DriverName(String browser){
        try{
            if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
                driver = new FirefoxDriver();
            }else {
                System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }


        return driver;
    }
}
