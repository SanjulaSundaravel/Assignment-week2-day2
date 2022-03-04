package Assignment.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("(//label[@for='uname'])[1]/following::input")).getAttribute("value");
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("(//label[@for='email'])[2]/following::input")).getAttribute("value");
		System.out.println(text1);
		String text2 = driver.findElement(By.xpath("(//label[@for='uname'])[2]/following::input")).getAttribute("value");
		System.out.println(text2);
		boolean text3 = driver.findElement(By.xpath("((//label[@for='email'])[1]/following::input)[1]")).isEnabled();
		System.out.println(text3);
		boolean text4 = driver.findElement(By.xpath("//label[@for='disabled']/following::input")).isDisplayed();
		System.out.println(text4);
		
		
		
	}

}
