package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Tarun");
		driver.findElement(By.name("UserLastName")).sendKeys("Sb");
		driver.findElement(By.name("UserEmail")).sendKeys("tarun@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Kyndryl");
		driver.findElement(By.name("UserPhone")).sendKeys("9597401063");

		WebElement jtitle = driver.findElement(By.name("UserTitle"));
		Select dropdown1 = new Select(jtitle);
		dropdown1.selectByVisibleText("Sales Manager");

		WebElement emps = driver.findElement(By.name("CompanyEmployees"));
		Select dropdown2 = new Select(emps);
		dropdown2.selectByIndex(3);

		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select dropdown3 = new Select(country);
		dropdown3.selectByVisibleText("Australia");

		WebElement state = driver.findElement(By.name("CompanyState"));
		Select dropdown4 = new Select(state);
		dropdown4.selectByVisibleText("Western Australia");

		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

	}
}
