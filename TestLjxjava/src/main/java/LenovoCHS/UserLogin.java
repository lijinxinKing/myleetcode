package LenovoCHS;

import base.CaseBase;
import base.DriverBase;
import base.getByLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class UserLogin extends CaseBase {
    private DriverBase driverBase ;
    @Test
    public UserLogin(){
        driverBase = new DriverBase("firefox");
        driverBase.Get("https://homesecurity.coro.net/");
        WebElement element = driverBase.element(getByLocator.getByLocator("ContinueWithLenovoID"));
        element.click();
        element = driverBase.element(getByLocator.getByLocator("lenovoIdLogin"));
        element.click();
        element.sendKeys("lijx20@lenovo.com");
        element = driverBase.element(getByLocator.getByLocator("userNameNextButton"));
        element.click();

        element = driverBase.element(getByLocator.getByLocator("inputPassword"));
        element.click();
        element.sendKeys("521125lijinXIN");
        element = driverBase.element(getByLocator.getByLocator("passwordNextButton"));
        element.click();

        element = driverBase.element(getByLocator.getByLocator("addeviceButton"));
        element.click();

        element = driverBase.element(getByLocator.getByLocator("getdevicecode"));
        String value = element.getAttribute("textContent");
        System.out.println(value);

        element = driverBase.element(getByLocator.getByLocator("closeDialog"));
        element.click();

        element = driverBase.element(getByLocator.getByLocator("movethispig"));
        Actions actions = new Actions(driverBase.driver);

        actions.clickAndHold(element).perform();

        element = driverBase.element(getByLocator.getByLocator("removeDevices"));
        element.click();

        element = driverBase.element(getByLocator.getByLocator("remvoeDevicesBtn"));
        element.click();


//.add-device-invitation-code
    }
    @AfterTest
    public void stop(){
        //driverBase.Stop();
    }
}
