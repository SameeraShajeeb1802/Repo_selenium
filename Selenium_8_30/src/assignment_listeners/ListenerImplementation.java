package assignment_listeners;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {
@Override
public void onTestFailure(ITestResult result) {
      String methodName = result.getName();
      Reporter.log("Test Script is failed",true);
    String timestamp = LocalDateTime.now().toString().replace(":", "-");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File temp=ts.getScreenshotAs(OutputType.FILE);
    File perm=new File("./errorsshots/"+timestamp+"demo.png");
    try {
		FileUtils.copyFile(temp, perm);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}