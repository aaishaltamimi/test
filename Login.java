package auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Login {

	public static void main(String[] args) throws InterruptedException {
		String email = "altamimiaisha141@gmail.com";
		String pass = "12345";

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//div[@class='_9ay7']//a[contains(text(),'Forgotten password?')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();*/
		driver.findElement(By.id("ss")).sendKeys("amman");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
