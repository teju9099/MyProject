package Mavan.Mavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class RainbowHospitalHomePage {

	
	@Test
	public void Appointment() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rainbowhospitals.in/");
	Thread.sleep(200);
	driver.findElement(By.linkText("/all/doctors")).click();
	WebElement SelectSpecialty = driver.findElement(By.name("specilityMaster"));
	Select SpecialtyDropdown = new Select(SelectSpecialty);
	SpecialtyDropdown.selectByValue("child-care");
	
	WebElement SelectLocation = driver.findElement(By.name("location"));
	Select LocationDropdown = new Select(SelectLocation);
	LocationDropdown.selectByValue("1");
	
	WebElement SelectSubSepcialty = driver.findElement(By.name("specialty"));
	Select SubSpecialty = new Select(SelectSubSepcialty);
	SubSpecialty.selectByValue("80");
	
	driver.findElement(By.name("txtSearch")).click();
	
	driver.findElement(By.linkText("./all/book-an-appointment/Mr-Somasekhar"));
	
	
	
	
	
	
		
		
	
	}
		
	

}
