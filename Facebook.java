package Assignment.Week2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//form[@class='_9vtf']//a)[3]")).click();
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Sanjula");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Sundaravel");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("7338887439");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("S@nju1117");
		WebElement date = driver.findElement(By.xpath("((//span)[11]/select)[1]"));
		Select data1 = new Select(date);
		data1.selectByVisibleText("17");
		WebElement month = driver.findElement(By.xpath("((//span)[11]/select)[2]"));
		Select data2 = new Select(month);
		data2.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.xpath("((//span)[11]/select)[3]"));
		Select data3 = new Select(year);
		data3.selectByVisibleText("1997");
		driver.findElement(By.xpath("((//label[@class='_58mt'])[1]/following::input)[1]")).click();
		
		
		
		
		
	}

}
