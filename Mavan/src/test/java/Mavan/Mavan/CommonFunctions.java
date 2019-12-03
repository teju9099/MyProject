package Mavan.Mavan;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonFunctions extends Reporting {
	
	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent.html");
	ExtentReports extent = new ExtentReports();
	
		//ExtentTest test = extent.createTest("verifyHomePageTitle", "Checking the Title");
	
	        Reporting Repo = new Reporting();		
	        WebDriver driver;
	        

		public void Enterdataintowebedit(WebDriver driver,By locatorName,String value, String OperationDescription, String Details) throws Throwable{
		  driver.findElement(locatorName).sendKeys(value);
		 // extent.attachReporter(htmlreporter);
		  Repo.samplereport(OperationDescription, Details);
		  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png")); //"C://Users//E004274//Desktop//eclipse//Mavan//ScreenShots"
	  }
	 
		public void ClickonCheckBox(WebDriver driver,By locatorName, String OperationDescription, String Details) throws Throwable{
			  driver.findElement(locatorName).click();
			//  extent.attachReporter(htmlreporter);
			  Repo.samplereport(OperationDescription, Details);
			  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
	  }
	   
	    public void SelectRadioButton(WebDriver driver,By locatorName, String OperationDescription, String Details) throws Throwable{
			  driver.findElement(locatorName).click();
			 // extent.attachReporter(htmlreporter);
			  Repo.samplereport(OperationDescription, Details);
			  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
	  }
	   
	    public void ClickLink(WebDriver driver,By locatorName, String OperationDescription, String Details) throws Throwable{
			  driver.findElement(locatorName).click();
			 // extent.attachReporter(htmlreporter);
			  Repo.samplereport(OperationDescription, Details);
			  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
	  } 
	  
	    public void GetAttributes(WebDriver driver,By locatorName, String Attribute, String OperationDescription, String Details) throws Throwable{
	    	String Attributes =  driver.findElement(locatorName).getAttribute(Attribute);
	    	//System.out.println(Attributes);
	    	//extent.attachReporter(htmlreporter);
	    	Repo.samplereport(OperationDescription, Details);
	    	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
	  } 
	   
	    public void SelectFromWebListByValue(WebDriver driver,By locatorName, String value, String OperationDescription, String Details) throws Throwable{
	    	
	    	 WebElement SelectFromWebList = driver.findElement(locatorName);  
			 Select Continents = new Select(SelectFromWebList); 
			 Continents.selectByValue(value);
			 //extent.attachReporter(htmlreporter);
			 Repo.samplereport(OperationDescription, Details);
			 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
	  }	  	      
	   
	    public void SelectFromWebListByIndex(WebDriver driver,By locatorName, int value, String OperationDescription,String Details) throws Throwable{
	    	
	    	 WebElement SelectFromWebList = driver.findElement(locatorName);  
			 Select Continents = new Select(SelectFromWebList); 
			 Continents.selectByIndex(value);
			// extent.attachReporter(htmlreporter);
			 Repo.samplereport(OperationDescription, Details);
			 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
      }
	   
	    public void ClickObject(WebDriver driver,By locatorName, String OperationDescription, String Details) throws Throwable{
			  driver.findElement(locatorName).click();
			  //extent.attachReporter(htmlreporter);
			  Repo.samplereport(OperationDescription, Details);
			  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/E004274/Desktop/eclipse/Mavan/ScreenShots/OperationDescription.png"));
	  } 
	    
	    public  String ExcelUtils(String DataFileLocation, String SheetName, int row, int column) throws Throwable{
			
			File file = new File(DataFileLocation);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh1= wb.getSheet(SheetName);
			String Value= sh1.getRow(row).getCell(column).getStringCellValue();
			return Value;
		} 
}

