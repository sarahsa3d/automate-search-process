package automatetestcase2;
   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class javaclass {
	public static void main(string[]  args) {
		 
		 
		 System.setProperty("webdriver.gecko.driver" , "C:\\Users\\K I N G\\Downloads\\Compressed\\geckodriver-v0.26.0-win64");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 driver.findElement(By.id("q")).sendkeys("linkedin");
		 WebElement googlesearch = driver.findElement(By.id("btnk"));
		 googlesearch.click();
		
		 

    }

}
