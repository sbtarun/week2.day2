package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");

		driver.findElement(By.id("email")).sendKeys("tarun@gmail.com");
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys("Adding to existing text");
		Thread.sleep(2000);
		append.sendKeys(Keys.TAB);

		System.out.println(driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
	}
}
