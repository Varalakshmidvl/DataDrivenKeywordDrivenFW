package Utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void capturedScreesShot(WebDriver driver){
	try{ 
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		/*
		 * //FileUtils.copyFile(src, new File("./ScreenShots/EasyCal/imag1.png"));
		 */		
		FileUtils.copyFile(src, new File("./Screeshots/EasyCalculation_"+ getCurrentDateTime()+".png"));    
        System.out.println("Captured Screenshot-On Failure ");		
	}catch(Exception e) {	
	System.out.println("Exception while taking Screenshots"+e.getMessage());
	}
	
	}
	  private static String getCurrentDateTime() { DateFormat customFormat =new
	  SimpleDateFormat("MM_dd_yyyy_HH_mm_ss"); Date currentdate =new Date(); return
	  customFormat.format(currentdate); }
		
}
