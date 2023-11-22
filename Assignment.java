package controll_transfer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
		driver.manage().window().maximize();
		WebElement tablebutton = driver.findElement(By.xpath("//summary[.='Table Data']"));
		tablebutton.click();
		WebElement data = driver.findElement(By.id("jsondata"));
		data.sendKeys(Keys.CONTROL+"a");
		data.sendKeys(Keys.DELETE);
		data.sendKeys("[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, {\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Sara\", \"age\" : 42, \"gender\": \"female\"}, {\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]");
		WebElement refreshbutton = driver.findElement(By.id("refreshtable"));
		refreshbutton.click();
		

	}

}
