package seleniumtest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class login {
    public  WebDriver webDriver;
    @Before
    public  void initDriver(){
        System.setProperty("webDriver.firefox.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.get("https://www.lenovo.com.cn/");
    }
    @After
    public void tearDown(){
        webDriver.quit();
    }
    @Test
    public void LoginScript(String userName,String password){
        try {

            ProUtil proUtil = new ProUtil("D:\\JavaProject\\myleetcode\\TestLjxjava\\src\\main\\resources\\element.properties");
            String value ="";
            String localType ="";
            String localValue ="";

            value = proUtil.getPro("loginDialogBtn");
            localType = value.split(">")[0];
            localValue = value.split(">")[1];
            element(this.byStr(localType,localValue)).click();

            value = proUtil.getPro("loginUserName");
            localType = value.split(">")[0];
            localValue = value.split(">")[1];
            WebElement webElement = element(this.byStr(localType,localValue));
            webElement.click();
            webElement.sendKeys(userName);

            value = proUtil.getPro("passwordBtn");
            localType = value.split(">")[0];
            localValue = value.split(">")[1];
            webElement = element(this.byStr(localType,localValue));
            webElement.click();
            webElement.sendKeys(password);

            value = proUtil.getPro("loginBtn");
            localType = value.split(">")[0];
            localValue = value.split(">")[1];
            webElement = element(this.byStr(localType,localValue));
            webElement.click();
            Thread.sleep(1000);

            webElement = element(By.className("top_login_ing"));
            if(webElement.isDisplayed()){
                Actions actions = new Actions(webDriver);
                actions.moveToElement(webElement).perform();
                System.out.println(webElement.getText());
                System.out.println("登录成功");
            }else{
                Assert.assertNotNull(webElement);
                System.out.println("登录失败");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public By byStr(String by,String local){
        if(by.equals("id")){
            return By.id(local);
        }
        else if(by.equals("xpath")){
            return By.xpath(local);
        }
        else if(by.equals("name")){
            return By.name(local);
        }
        else if(by.equals("className")){
            return By.className(local);
        }else{
            return By.cssSelector(local);
        }
    }
    // 封装Element
    public WebElement element(By by){
        WebElement element = webDriver.findElement(by);
        return element;
    }

    public static void main(String[] args) {
         login login = new login();
         login.initDriver();
         login.LoginScript("18911777318","521125lijin");

    }
}
