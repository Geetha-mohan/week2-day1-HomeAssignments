package week2.day1.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//enter username, password and enter login button
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA link and click account tab and click create account menu
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		//enter the details and click create account button
		driver.findElement(By.id("accountName")).sendKeys("Getuser8");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.id("numberEmployees")).sendKeys("4");
		
		//Select class
		WebElement industryOptions = driver.findElement(By.name("industryEnumId"));
		Select industryOption = new Select(industryOptions);
		industryOption.selectByVisibleText("Computer Software");
		
		WebElement owenershipOptions = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(owenershipOptions);
		ownership.selectByVisibleText("S-Corporation");
		
		WebElement sourceOptions = driver.findElement(By.id("dataSourceId"));
		Select options = new Select(sourceOptions);
		options.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampign = driver.findElement(By.id("marketingCampaignId"));
		Select marketOptions = new Select(marketingCampign);
		marketOptions.selectByIndex(6);	
		
		WebElement stateOptions = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateOptions);
		state.selectByValue("TX");	
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//getTitle and verify the text displayed
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Account Details"))
			System.out.println("Title matached");
		else
			System.out.println("title not matched");
	
		//close driver
		//driver.close();
		
		}	

}
