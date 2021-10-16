package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/Dropdown.html");

		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select dropDown1 = new Select(dd1);
		dropDown1.selectByIndex(2);

		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select dropDown2 = new Select(dd2);
		dropDown2.selectByVisibleText("Selenium");

		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select dropDown3 = new Select(dd3);
		dropDown3.selectByValue("4");

		WebElement dd4 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]"));
		dd4.sendKeys("UFT/QTP");

		WebElement dd5 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]"));
		Select dropDown5 = new Select(dd5);
		dropDown5.selectByVisibleText("Appium");
	}
}
