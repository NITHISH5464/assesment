package assignment.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsAssmnt {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver LT=new ChromeDriver();
	LT.manage().window().maximize();
	LT.get("http://leaftaps.com/opentaps/control/login");
	LT.findElement(By.id("username")).sendKeys("Demosalesmanager");
	LT.findElement(By.id("password")).sendKeys("crmsfa");
	LT.findElement(By.className("decorativeSubmit")).click();
	LT.findElement(By.linkText("CRM/SFA")).click();
	 LT.findElement(By.linkText("Leads")).click();
	 LT.findElement(By.partialLinkText("Create")).click();
	 LT.findElement(By.id("createLeadForm_companyName")).sendKeys("accenture");
	 LT.findElement(By.id("createLeadForm_firstName")).sendKeys("NITHISH");
	 LT.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	 
	 
	 WebElement inputBox= LT.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 Select tl=new Select(inputBox);
	 tl.selectByIndex(3);
	// tl.selectByVisibleText("conference");
	 
	//WebElement createLeadForm_generalStateProvinceGeoId = LT.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//Select tl1=new Select(createLeadForm_generalStateProvinceGeoId);
		//tl1.selectByIndex(0);
	 
	 
	 LT.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nithish");
	 LT.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("s");
	 
LT.findElement(By.id("createLeadForm_personalTitle")).sendKeys("no");
LT.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("no");
LT.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
LT.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cbenithish25@gmail.com");
LT.findElement(By.xpath("//tr/td[@id='ext-gen593']/select[@class='inputBox']/option[@value='USA']")).click();
LT.findElement(By.id("ext-gen173")).click();







	
	
	
	
}
}	/*
 * //Pseudo Code
 * 
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 
 * 2. Enter UserName and Password Using Id Locator
 * 
 * 3. Click on Login Button using Class Locator
 * 
 * 4. Click on CRM/SFA Link
 * 
 * 5. Click on contacts Button
 * 
 * 6. Click on Create Contact
 *  
 * 7. Enter FirstName Field Using id Locator
 * 
 * 8. Enter LastName Field Using id Locator
 * 
 * 9. Enter FirstName(Local) Field Using id Locator
 * 
 * 10. Enter LastName(Local) Field Using id Locator
 * 
 * 11. Enter Department Field Using any Locator of Your Choice
 * 
 * 12. Enter Description Field Using any Locator of your choice 
 * 
 * 13. Enter your email in the E-mail address Field using the locator of your choice
 * 
 * 14. Select State/Province as NewYork Using Visible Text
 * 
 * 15. Click on Create Contact
 * 
 * 16. Click on edit button 
 * 
 * 17. Clear the Description Field using .clear
 * 
 * 18. Fill ImportantNote Field with Any text
 * 
 * 19. Click on update button using Xpath locator
 * 
 * 20. Get the Title of Resulting Page.
 */
