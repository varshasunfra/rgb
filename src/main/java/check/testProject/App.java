package check.testProject;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
        driver=new ChromeDriver();
    	//Actions act=new Actions(driver);
    	//act.moveToElement(driver.findElement(By.xpath("")));

        driver.manage().window().maximize();
        driver.get("https://www.rrrgggbbb.com");
        Thread.sleep(200);
        Actions act=new Actions(driver);
        	
       
      boolean tru=  driver.findElement(By.xpath("//*[@id='R']/..//*[@id='R-fill']")).isDisplayed();
      System.out.println(tru); 
      if(tru) {
    	 
    	  act.moveToElement(driver.findElement(By.xpath("//*[@id='R']/..//*[@id='R-fill']"))).click().build().perform();
          
      }
      
     
       
        
        Actions act1=new Actions(driver);
       
        	
       
      boolean tru1=  driver.findElement(By.xpath("//*[@id='G']/..//*[@id='G-fill']")).isDisplayed();
      System.out.println(tru1); 
      if(tru1) {
    	  act1.moveToElement(driver.findElement(By.xpath("//*[@id='G']/..//*[@id='G-fill']"))).click().build().perform();
      }
     
       
        
        Actions act2=new Actions(driver);
      
        	
       
      boolean tru2=  driver.findElement(By.xpath("//*[@id='B']/..//*[@id='B-fill']")).isDisplayed();
      System.out.println(tru2); 
      if(true) {
    	  act2.moveToElement(driver.findElement(By.xpath("//*[@id='B']/..//*[@id='B-fill']"))).click().build().perform();
      }
     
      assertFalse();
        
        
 
 
      
       
  
        
    }
}
