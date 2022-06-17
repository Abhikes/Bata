package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.DADA.Generic.DataTest;
import com.google.common.io.Files;

public class Listner implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started"+ result.getName(),true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Sucess"+ result.getName(),true);	
	}

	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh= (TakesScreenshot)DataTest.driver;
		File src = sh.getScreenshotAs(OutputType.FILE);
		File dist = new File("D:\\GCCA22\\Sceenshot\\"+result.getName()+".png");
		try {
			Files.copy(src, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

}
