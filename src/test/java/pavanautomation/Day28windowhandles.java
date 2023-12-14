package pavanautomation;

import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day28windowhandles {
	WebDriver driver;

	public static  void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	String element=driver.findElement(By.xpath("//h2[text()='Tabs']")).getText();
	System.out.println(element);
	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
List<WebElement>webelements=driver.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//div/a"));
for( WebElement searchelements:webelements)
{
	System.out.println( searchelements.getText());
	searchelements.click();
}
	Set<String> windowIds=driver.getWindowHandles();
	System.out.println("Switching toeach browser window and getting the titles"); 
	for(String ids:windowIds)
	{
	String title=	driver.switchTo().window(ids).getTitle();
	System.out.println(title);
	}
	driver.quit();
	}

}
