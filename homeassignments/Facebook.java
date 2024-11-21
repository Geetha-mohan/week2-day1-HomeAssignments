	package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
		
			
		//enter the details and click create account button
		driver.findElement(By.name("name")).sendKeys("Getuser7");
		driver.findElement(By.name("phone_number")).sendKeys("123456789");
		driver.findElement(By.xpath("//span[contains(text(),'Use email')]")).click();
		driver.findElement(By.name("email")).sendKeys("Getuser7@gmail.com");
		String errorEmail = driver.findElement(By.xpath("//span[text()='Email']")).getText();
		if(errorEmail.contains("Email has already been taken"))
			System.out.println("Duplicate email ID");
		
		
		
		//Select class Month
		  WebElement month = driver.findElement(By.xpath("//select[contains(@class,'r-30o5oe')]"));
		  Select monthOptions = new Select(month); 
		  monthOptions.selectByValue("5");
		 
		
		//Select Date		
		new Select(driver.findElement(By.xpath("(//select[contains(@class,'r-30o5oe')])[2]"))).selectByVisibleText("24");
		
		//Select Year
		new Select(driver.findElement(By.xpath("(//select[contains(@class,'r-30o5oe')])[3]"))).selectByIndex(2);
		
		//Click next button
		driver.findElement(By.xpath("(//div[@class='css-146c3p1 r-bcqeeo r-qvutc0 r-37j5jr r-q4m81j r-a023e6 r-rjixqe r-b88u0q r-1awozwy r-6koalj r-18u37iz r-16y2uox r-1777fci'])[2]")).click();
		Thread.sleep(3000);	
		
		System.out.println(driver.getTitle());
		
		
		//close driver
		driver.close();
		
		}	

}
