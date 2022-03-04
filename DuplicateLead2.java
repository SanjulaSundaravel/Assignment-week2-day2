package Assignment.Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//li)[32]//em")).click();
		driver.findElement(By.xpath("(//label[@class='x-form-item-label'])[22]/following::input[1]")).sendKeys("sanjulasundaravel1117@gmail.com");
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		WebElement leadName1 = driver.findElement(By.xpath("(//span[@class='requiredField'])[2]/following::span[1]"));
		String originalID = leadName1.getText();
		System.out.println("The original Id is "+originalID);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		if(driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("Title of the page is Dublicate Lead");
		}
		driver.findElement(By.xpath("(//td[@colspan='4'])[8]/input")).click();
		WebElement leadName2 = driver.findElement(By.xpath("(//span[@class='requiredField'])[2]/following::span[1]"));
		String DuplicateID = leadName2.getText();
		System.out.println("Duplicat ID is "+DuplicateID);
		if(originalID.equals(DuplicateID)) {
			System.out.println("The Lead ID is Duplicated");
		}
		else {
			System.out.println("Lead Id is not Duplicated");
		}
		
		driver.close();
	}

}
