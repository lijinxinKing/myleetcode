package seleniumtest;

import base.DriverBase;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNgListenerScreenshot extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult tr){
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult var1) {
        super.onTestFailure(var1);
        DriverBase baseDriver = (DriverBase) var1.getInstance();
        baseDriver.takeScreenShot();
    }

    @Override
    public void onStart(ITestContext var1) {
        super.onStart(var1);
    }
    @Override
    public void onFinish(ITestContext var1) {
        super.onFinish(var1);
    }
    @Override
    public void onTestStart(ITestResult var1) {
        super.onTestStart(var1);
    }
}
