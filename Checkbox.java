package Assignment.Week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[@for='java'])[1]/following::input[1]")).click();
		boolean selected = driver.findElement(By.xpath("(//label[@for='java'])[2]/following::input[1]")).isSelected();
		System.out.println(selected);
         boolean box = driver.findElement(By.xpath("(//label[@for='java'])[3]/following::input[2]")).isSelected();
        if(box==true) {
			driver.findElement(By.xpath("(//label[@for='java'])[3]/following::input[2]")).click();
			
		}
		List<WebElement> list = driver.findElements(By.xpath("(//label[@for='java'])[4]/following::input"));
		  int size = list.size();
		    System.out.println(size);
		    
		    
		    for(int i = 0; i<size; i++) {
		        
		        list.get(i).click();
		        
		    }
		
		
	}

}
