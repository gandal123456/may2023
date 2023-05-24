package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tempt {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\Automation Support\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		//enter uname
		driver.findElement(By.xpath("//*[@name='txtuId']")).sendKeys("Admin");                            //sendKeys
		
		
		//enter pass
		driver.findElement(By.xpath("//*[@name='txtPword']")).sendKeys("Admin");                             //sendKeys
				
		//click on Login button
		driver.findElement(By.xpath("//*[@name='login']")).click();                                             //click
				
		
		//click on branches
		driver.findElement(By.xpath("(//*[@height='24'])[2]")).click();                                          //click
		
		//Select INDIA as country
		   Select country=new Select(driver.findElement(By.xpath("//*[@name='lst_countryS']")));                  //select
		   
		          country.selectByVisibleText("INDIA");
		          
         //Select MH as state
		   Select state=new Select(driver.findElement(By.xpath("//*[@name='lst_stateS']")));                       //select
				   
				  state.selectByVisibleText("MAHARASTRA");
				          
		 //Select MUMBAI as city
		  Select city=new Select(driver.findElement(By.xpath("//*[@name='lst_cityS']")));                           //select
						   
			  city.selectByVisibleText("MUMBAI");
						          
		
		//click on search
			  driver.findElement(By.xpath("//*[@id='btn_search']")).click();                                       //click
			  
			  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
