package Assignment.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//button[@id='home']")).getText();
		System.out.println(text);
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println(location);
		String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println(size);
		
		
	}

}
