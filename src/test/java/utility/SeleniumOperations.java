package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{	
	public static WebDriver driver=null;	
	//browserLaunch
	       public static void browserLaunch(Object[]inputParameters)  
	       {
	    	   String bname=(String) inputParameters[0];          // chrome
	    	   String exe=(String) inputParameters[1];            //exe
	    	   
	    	if(bname.equalsIgnoreCase("Chrome"))   
	    	{
	    	        System.setProperty("webdriver.chrome.driver", exe);	    	        
	    	        driver=new ChromeDriver();	    	        
	    	        driver.manage().window().maximize();    	   
	    	}
	    	
	    	if(bname.equalsIgnoreCase("FF"))   
	    	{
	    	        System.setProperty("webdriver.gecko.driver", exe);	    	        
	    	        driver=new FirefoxDriver();	    	        
	    	        driver.manage().window().maximize();    	   
	    	}
	    	
	    	
	    	
	    	}
	
	//openingApplication	       
	       public static void openApplication(Object[]inputParameters)
	       {
	    	     String url=(String) inputParameters[0];	    	     
	    	     driver.get(url);	    	   
	       }
	
	//enter text on UI
	           public static void enterTextOnUi(Object[]inputParameters)
	           {
	        	   String xpath=(String) inputParameters[0];
	        	   String text=(String) inputParameters[1];        	   
	        	       driver.findElement(By.xpath(xpath)).sendKeys(text);	        	   
	           }
	       
	       
	         //click on Element	       
		       public static void clickOnElement(Object[]inputParameters)
		       {
		    	     String xpath=(String) inputParameters[0];	    	     
		    	     driver.findElement(By.xpath(xpath)).click();		    	   
		       }      
	       
	       //static dropdown by Select
		       public static  void selectValue(Object[]inputParameters)
		       {
		    	   
		    	   String xpath=(String) inputParameters[0];
		    	   String value=(String) inputParameters[1];
		    	   
		    	   Select sel=new Select(driver.findElement(By.xpath(xpath)));
		    	   
		    	          sel.selectByValue(value);
		    	   
		       }
		       
		//validation
		       public static void validation(Object[]inputParameters)
		       {
		    	   String xpath=(String) inputParameters[0];
		    	   String text=(String) inputParameters[1];
		    	   
		    	   String capturedText=driver.findElement(By.xpath(xpath)).getText();
		    	   
		    	   String givenText=text;
		    	   
		    	   if(capturedText.equalsIgnoreCase(givenText))
		    	   {
		    		   System.out.println("Test Case Pass");
		    	   }
		    	   else 
		    	   {
		    		   System.out.println("Test Case Fail");
		    	   }
		    	   
		       }
		       
		       
		    
}
