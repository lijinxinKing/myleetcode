package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.util.List;

public class DriverBase
{
    public WebDriver driver;
    public String url;
    public DriverBase(String browser){
        SeleniumDriver seleniumDriver = new SeleniumDriver();
        driver = seleniumDriver.DriverName(browser);
        if (url == ""){
            driver.get("https://www.lenovo.com.cn/");
        }
        driver.manage().window().maximize();
    }
    public void Get(String url){
        this.url = url;
        driver.get(url);
    }
    public void Stop(){
        System.out.println("Driver Stop");
        driver.quit();
    }

    // 封装Element
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    public List<WebElement> ListElements(By by){
        List<WebElement> element = driver.findElements(by);
        return element;
    }

    public void takeScreenShot(){
        try {
            long date = System.currentTimeMillis();
            String path = String.valueOf(date);
            path = path + ".png";
            File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("d://" + path));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
