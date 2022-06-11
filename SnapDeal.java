package Week5Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		
		WebElement findElement = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(findElement).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	    String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	    System.out.println("the count is"+text);
		
	}
		

}
