package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Tarun");
		driver.findElement(By.name("lastname")).sendKeys("Sb");
		driver.findElement(By.name("reg_email__")).sendKeys("tarun@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tarun@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcdefg");

		// dropdowns for DOB
		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select dropdown1 = new Select(bday);
		dropdown1.selectByIndex(4);

		WebElement bmonth = driver.findElement(By.name("birthday_month"));
		Select dropdown2 = new Select(bmonth);
		dropdown2.selectByVisibleText("May");

		WebElement byear = driver.findElement(By.name("birthday_year"));
		Select dropdown3 = new Select(byear);
		dropdown3.selectByVisibleText("1997");

		driver.findElement(By.name("sex")).click();
		
	}
}
