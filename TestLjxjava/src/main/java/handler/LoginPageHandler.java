package handler;

import base.DriverBase;
import org.openqa.selenium.WebElement;
import seleniumtest.LoginPage;

public class LoginPageHandler {
    public DriverBase driverBase;
    public LoginPage lp;
    public LoginPageHandler(String browser){
        lp = new LoginPage(browser);
    }
    public void OpenLoginWindow(){
        lp.getLoginWindowElement().click();
    }
    public void sendKeyUsername(String userName){
        try {
            WebElement  webElement = lp.getUserElement();
            webElement.click();
            Thread.sleep(600);
            webElement.sendKeys(userName);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void sendKeyPassword(String password){
        WebElement webElement = lp.getPasswordElement();
        webElement.click();
        webElement.sendKeys(password);
    }
    public void ClickAutoLogin(){
        lp.getAutoLoginBtnElement().click();
    }
    public void ClickLogin(){
        if (lp.assertElementIs(lp.getLoginBtnElement())){
            lp.getLoginBtnElement().click();
        }else{
            System.out.println("元素没有定位到");
        }
    }

    public static void main(String[] args) {
        LoginPageHandler lph = new LoginPageHandler("firefox");
        lph.OpenLoginWindow();
        lph.sendKeyUsername("18911777318");
        lph.sendKeyPassword("521125lijin");
        lph.ClickLogin();
        lph.Stop();
    }

    public void Stop() {
        lp.Stop();
    }
}
