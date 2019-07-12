package base;

import org.openqa.selenium.By;
import seleniumtest.ProUtil;

public class getByLocator {
    public static By getByLocator(String key){
        ProUtil pro = new ProUtil("D:\\JavaProject\\myleetcode\\TestLjxjava\\src\\main\\resources\\element.properties");
        String locator = pro.getPro(key);
        String localType = locator.split(">")[0];
        String localValue = locator.split(">")[1];

        if(localType.equalsIgnoreCase("id")){
            return By.id(localValue);
        }
        else if(localType.equalsIgnoreCase("xpath")){
            return By.xpath(localValue);
        }
        else if(localType.equalsIgnoreCase("name")){
            return By.name(localValue);
        }
        else if(localType.equalsIgnoreCase("className")){
            return By.className(localValue);
        }else{
            return By.cssSelector(localValue);
        }
    }
}
