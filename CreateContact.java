package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Tarun");
		driver.findElement(By.id("lastNameField")).sendKeys("Sb");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("TARUN");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("SB");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("MCA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Entering data using Selenium");

		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("tarun@gmail.com");

		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown1 = new Select(state);
		dropDown1.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated the data");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String str=driver.getTitle();
		System.out.println(str);
	}
}
