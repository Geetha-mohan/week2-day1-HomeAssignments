package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter username, password and enter login button and click on CRM/SFA link
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click account tab and click create lead menu
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		  //enter account name, description, site name, number of employees and click create account button
		  driver.findElement(By.xpath("//input[contains(@id,'LeadForm_firstName')]")).sendKeys("GetLead1");
		  driver.findElement(By.xpath("//input[contains(@id,'LeadForm_lastName')]")).sendKeys("Mohan");
		  driver.findElement(By.xpath("//input[contains(@id,'LeadForm_companyName')]")).sendKeys("TestLeaf Pvt Ltd");
		  driver.findElement(By.name("generalProfTitle")).sendKeys("Test Engineer");
		  driver.findElement(By.name("submitButton")).click();
		  
		 //getTitle and verify the text displayed 
		 String title = driver.getTitle();
		 System.out.println(title);
		 if(title.contains("View Lead"))
			 System.out.println("Title matached"); 
		 else
			 System.out.println("title not matched");
		 
		  //close driver
		 driver.close();
		 
		}
}
