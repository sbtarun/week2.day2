package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/radio.html");
		Thread.sleep(2000);
		driver.findElement(By.id("yes")).click();
		Boolean b1 = driver.findElement(By.xpath("(//input[@name='news'])[2]")).isSelected();
		if (b1 == true) {
			System.out.println("Checked is selected");

		} else {
			System.out.println("Unchecked is selected");
		}
		Boolean b2 = driver.findElement(By.xpath("//input[@name='age']")).isEnabled();
		if (b2 == true) {
			System.out.println("Age is already selected");
		} else {
			System.out.println("Age is not selected");
		}
	}
}
