package Assignment.Week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		boolean shadowRoot = driver.findElement(By.xpath("//a[@href='error.html']")).isDisplayed();
		System.out.println(shadowRoot);
		String element = driver.findElement(By.xpath("//a[@href='Button.html']")).getDomAttribute("href");
		System.out.println(element);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		System.out.println(allLinks.size());
		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();
		System.out.println(driver.getCurrentUrl());
		
		
		
	
		
	}
		

}
