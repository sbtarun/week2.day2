package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");

		//driver.findElement(By.id("home")).click();

		// Finding Position
		System.out.println(driver.findElement(By.id("position")).getLocation());

		// Finding Color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));

		// Finding Size
		System.out.println(driver.findElement(By.id("size")).getSize());
	}
}
