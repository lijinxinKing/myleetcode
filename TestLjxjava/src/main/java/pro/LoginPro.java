package pro;

import handler.LoginPageHandler;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.Listeners;
import seleniumtest.TestNgListenerScreenshot;

@Listeners({TestNgListenerScreenshot.class})
public class LoginPro {
    public LoginPageHandler loginPageHandler;
    public LoginPro(String browser){
        loginPageHandler = new LoginPageHandler(browser);
    }
    @Before
    public void init(String browser){
        loginPageHandler = new LoginPageHandler(browser);
    }
    @Test
    public void login(String user,String password){
        loginPageHandler.OpenLoginWindow();
        loginPageHandler.sendKeyUsername(user);
        loginPageHandler.sendKeyPassword(password);
        loginPageHandler.ClickAutoLogin();
        loginPageHandler.ClickLogin();
    }
    public void Stop(){
        loginPageHandler.Stop();
    }
}
