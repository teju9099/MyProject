package Mavan.Mavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ToolsQA extends CommonFunctions {
	
	CommonFunctions cm=new CommonFunctions();

	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent.html");
	ExtentReports extent = new ExtentReports();
	
	@Test
	public  void Sampledemo() throws Throwable {
		
	 //cm.InvokeDriver("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe", "https://www.toolsqa.com/automation-practice-form/");
	 System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
	 driver.get("https://www.toolsqa.com/automation-practice-form/");
	 Thread.sleep(200);
	 cm.ClickObject(driver, (By.xpath("//*[@id='cookie_action_close_header']")), "Click On Cookie OK", "Click On Cookie OK");
	 String FirstName = cm.ExcelUtils("C://Users//E004274//Desktop//eclipse//Selenium.xlsx", "TestData", 0, 0);
	 cm.Enterdataintowebedit(driver,By.name("firstname"), FirstName, "Enter First Name", "Enter First Name");
	 String SecondName = cm.ExcelUtils("C://Users//E004274//Desktop//eclipse//Selenium.xlsx", "TestData", 0, 1);
	 cm.Enterdataintowebedit(driver, (By.id("lastname")), SecondName, "Enter Second Name","Enter Second Name");
	 cm.ClickonCheckBox(driver, (By.id("sex-0")), "Select Gender", "Select Gender");
	 cm.SelectRadioButton(driver, (By.id("exp-4")), "Select Expirence", "Select Expirence");
	 String StartDate = cm.ExcelUtils("C://Users//E004274//Desktop//eclipse//Selenium.xlsx", "TestData", 0, 2);
	 cm.Enterdataintowebedit(driver, (By.id("datepicker")), StartDate, "Select Date", "Select Date");
	 cm.ClickonCheckBox(driver, (By.id("profession-1")), "Select Profession", "Select Profession");
	 cm.ClickonCheckBox(driver, (By.id("tool-2")), "Select Tool", "Select Tool");
	 String Continent = cm.ExcelUtils("C://Users//E004274//Desktop//eclipse//Selenium.xlsx", "TestData", 0, 3);
	 cm.SelectFromWebListByValue(driver, (By.id("continents")), Continent, "Select continents as AF", "Select continents as AF");
 	 cm.SelectFromWebListByIndex(driver, (By.id("selenium_commands")), 4, "Select selenium commands", "Select selenium commands");
	 cm.ClickObject(driver, (By.id("submit")), "Click on submit", "Click on submit");
   	 cm.GetAttributes(driver, (By.id("selenium_commands")), "name", "Selenium Commands", "Selenium Commands");
   	 driver.quit();
   	 		
	}
	
}
