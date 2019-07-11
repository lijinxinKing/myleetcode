package seleniumtest;

import org.junit.Before;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
    private String filePath;
    Properties prop = new Properties();
    public ProUtil(String filePath){
        this.filePath = filePath;
    }
    private Properties readProperties(){
        Properties pro = new Properties();
        try{
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));
            pro.load(in);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return pro;
    }

    public String getPro(String key) {
        prop = readProperties();
        String value = "";
        if(prop.containsKey(key)){
            value = (String) prop.get(key);
        }
        return value;
    }

    public static void main(String[] args) {
        try {
            ProUtil proUtil = new ProUtil("D:\\JavaProject\\myleetcode\\TestLjxjava\\src\\main\\resources\\element.properties");
            System.out.println(proUtil.getPro("username"));
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
