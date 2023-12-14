package numpypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



public class DataStructures {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("username")).sendKeys("swathi18");
		driver.findElement(By.name("password")).sendKeys("Welcome$123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//List<WebElement> totalgetstarted = driver.findElements(By.className("//*[@class=\"align-self-end btn btn-lg btn-block btn-primary\"])"));
		//for( WebElement getstrt:totalgetstarted)
			
		//{
			//System.out.println(getstrt.getText());
		//}
		driver.findElement(By.xpath("//a[@href=\"data-structures-introduction\"]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a.list-group-item")).click();
	//	driver.findElement(By.linkText("Practice Questions")).click();
	//Thread.sleep(2000);
		//driver.navigate().back();
		
		//driver.findElement(By.cssSelector("a.btn")).click();
List<WebElement> totallnks=	driver.findElements(By.tagName("a"));
 System.out.println("Number of lnks " + totallnks.size());
 for(WebElement links:totallnks)
 {
	System.out.println( links.getText());
 }
//List<WebElement> totalgetstarted = driver.findElements(By.className("//*[@class=\"align-self-end btn btn-lg btn-block btn-primary\"])"));
 //driver.findElement(By.linkText("Practice Questions")).click();
	//	Thread.sleep(2000);
		//driver.navigate().back();
		
		//driver.findElement(By.cssSelector("a.btn")).click();
 
 //driver.findElement(By.id("answer_form")).sendKeys("hello");
 //driver.findElement(By.xpath("//div[@class=\"input\"]")).sendKeys("Hello");
// WebElement content=driver.findElement(By.tagName("body"));
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].value='hello'",content);
 //WebElement content=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
 //JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].value='print hello'",content);
 //driver.findElement(By.xpath(("//*[@type='button']"))).click();
// driver.findElement(By.xpath("//*[@id='output']")).click();
// WebElement editorInput=driver.findElement(By.xpath("//textarea[@tabindex='0']")); 
//editorInput.sendKeys("hello" );
//driver.findElement(By.xpath("//*[@id='output']")).click();
//  driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]")).sendKeys("hello");
 //driver.findElement(By.xpath("//*[@id='output']")).click();	
		//}

}
}
