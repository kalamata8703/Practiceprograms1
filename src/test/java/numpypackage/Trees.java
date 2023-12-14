package numpypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trees {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("username")).sendKeys("swathi18");
		driver.findElement(By.name("password")).sendKeys("Welcome$123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[@href=\"tree\"]")).click();
		driver.findElement(By.xpath("//*[@class='Overview of Trees']")).click();

	}

}
