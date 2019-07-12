package seleniumtest;

import base.DriverBase;
import base.getByLocator;
import org.openqa.selenium.WebElement;

public class LoginPage extends DriverBase {
    public LoginPage(String browser) {
        super(browser);
    }

    /*获取用户输入框 */
    public WebElement getLoginWindowElement(){
        return  element(getByLocator.getByLocator("loginDialogBtn"));
    }

    /*获取用户输入框 */
    public WebElement getUserElement(){
        return  element(getByLocator.getByLocator("loginUserName"));
    }

    /*获取密码输入框*/
    public WebElement getPasswordElement(){
        return  element(getByLocator.getByLocator("passwordBtn"));
    }

    /*获取登录按钮*/
    public WebElement getLoginBtnElement(){
        return  element(getByLocator.getByLocator("loginBtn"));
    }

    /*获取自动登录按钮*/
    public WebElement getAutoLoginBtnElement(){
        return  element(getByLocator.getByLocator("autoLoginBtn"));
    }
    public boolean assertElementIs(WebElement webElement){
        return webElement.isDisplayed();
    }
}
