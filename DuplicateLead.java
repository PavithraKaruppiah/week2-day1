package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf Se march 2022");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karuppiah");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavik");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Se first Program");
		driver.findElement(By.name("primaryEmail")).sendKeys("pavithra1karuppiah@gmail.com");
		
		WebElement dd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop = new Select(dd);
		drop.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.name("submitButton")).click();
		
		String title3 = driver.getTitle();
		System.out.println("Final Title" + title3);
		
	}

}
