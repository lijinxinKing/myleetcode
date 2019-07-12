package testCase;

import base.CaseBase;
import base.DriverBase;
import base.getByLocator;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;


public class TestComputerList extends CaseBase {
    public DriverBase driverBase;

    @Test
    public void ComputerList(){
        driverBase =  super.InitDriver("firefox");
        driverBase.Get("https://www.lenovo.com.cn/");
        WebElement webElement = driverBase.element(getByLocator.getByLocator("computerList"));
        List<WebElement> computersList =  webElement.findElements(getByLocator.getByLocator("computerChild"));
        for (WebElement element: computersList){
            System.out.println(element.getTagName()+","+element.getText());
            element.click();
        }
        //driverBase.Stop();
    }
    public List<String> listElemnet(){
        List<String> listString = new ArrayList<String>();
        return listString;
    }

    public String getComputerName(WebElement element){
        return element.getText();
    }
    public void BuyCourse(){
        // 订单流程

    }
}
