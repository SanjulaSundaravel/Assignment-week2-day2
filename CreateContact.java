package Assignment.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sanjula");
		driver.findElement(By.id("lastNameField")).sendKeys("Sundaravel");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Manvi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Malotra");
		driver.findElement(By.xpath("((//span[@class='tableheadtext'])[6]/following::input)[1]")).sendKeys("SalesForce");
		driver.findElement(By.xpath("(//span[@class='tableheadtext'])[9]/following::textarea[1]")).sendKeys("It was good day");
		driver.findElement(By.xpath("(//span[@class='tableheadtext'])[17]/following::input[1]")).sendKeys("sanjulasundaravel1117@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select location = new Select(state);
		location.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//span[@class='tableheadtext'])[8]/following::textarea[1]")).clear();
		driver.findElement(By.xpath("(//span[@class='tableheadtext'])[9]/following::textarea[1]")).sendKeys("Learning selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td)[64]/input")).click();
		String title = driver.getTitle();
		System.out.println("Title is = "+title);
		
		}

}
