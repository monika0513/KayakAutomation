package javamock;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Kayak {
		
		public static void link(){
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.kayak.com/");
		WebElement element=  driver.findElement(By.linkText("FLIGHTS"));
		element.click();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.kayak.com/flights");
	//WebElement element1 =   driver.findElement(By.xpath("//input[@placeholder='To'][@name='destination']"));
		WebElement element1 = driver.findElement(By.id("destination"));
		element1.sendKeys("New Delhi (DEL)");
		Actions act=new Actions(driver);
		      act.click(element1);

		WebElement startDate = driver.findElement(By.id("travel_dates-start-display"));
		startDate.clear(); 
		startDate.sendKeys("12/1/2015");
		driver.findElement(By.id("travel_dates-end")).click();
		WebElement endDate = driver.findElement(By.id("travel_dates-end-display"));
		endDate.clear(); 
		endDate.sendKeys("12/15/2015");
		
		WebElement element2 = driver.findElement(By.className("r9-dropdownDialog-label"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.id("cabin"));
		element3.click();
		Select s= new Select(element3);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		s.selectByVisibleText("Premium Economy");
		WebElement element4 = driver.findElement(By.xpath(".//*[@id='travelers-Adults']/button[2]"));	
	element4.click();
	element4.click();
	WebElement sbtbutton = driver.findElement(By.id("fdimgbutton"));
	sbtbutton.click();
	}
	
		
public static void main(String[] args) {
	
}
			//Kayak.link();

		}

	



