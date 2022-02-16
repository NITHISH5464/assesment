package assignment.com;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginfacebooaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver fb=new ChromeDriver();
        fb.get("https://www.facebook.com/");
        //fb.manage().window().maximize();
       fb.findElement(By.id("email")).sendKeys("MAIL ID");
       fb.findElement(By.id("pass")).sendKeys("PASSWORD");
      fb.findElement(By.name("login")).click();
        
		
	}

}
