package Assignment.Week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Selenium");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("1");
		Select se = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
    	List<WebElement> options = se.getOptions();
    	System.out.println(options.size());
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("Selenium");
		String text = driver.findElement(By.xpath("(//select)[6]/option[2]")).getText();
		System.out.println(text);
		
	}
}
