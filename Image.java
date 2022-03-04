package Assignment.Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		boolean enabled = driver.findElement(By.xpath("((//label[@for='position'])[1]/following::img)[1]")).isEnabled();
		System.out.println("Is the image is broken "+enabled);
		driver.findElement(By.xpath("(//label[@for='position'])[2]/following::img")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[4]/img")).click();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]/img")).click();
		
		
	}

}
