package tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tricentis_Testing_Fields{

	@BeforeClass
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
	}
	
	@Test (priority=1 )
	public void Test1() throws InterruptedException  {
		//Verify Navigation to Automobile Tab		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		Thread.sleep(3000);
		driver.findElement(By.id("nav_automobile")).click();
	}

	@Test (priority=2  )
	public void Test2() throws InterruptedException  {
		//Check if the Make dropdown field handles valid Make selection
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	        driver.get("https://sampleapp.tricentis.com/101/app.php");
    	        driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("make")).click();
		Thread.sleep(3000);
		WebElement make = driver.findElement(By.xpath("//select[@name='Make']")); 
     	        Select se = new Select(make);
		Thread.sleep(3000);
		se.selectByVisibleText("Toyota");
		Thread.sleep(3000);
	}
	
	@Test (priority=3 )
	public void Test3() throws InterruptedException  {
		//Check if the Make dropdown field handles invalid Make selection
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("make")).click();
		Thread.sleep(3000);
		WebElement make = driver.findElement(By.xpath("//select[@name='Make']")); 
		Select se = new Select(make);
		Thread.sleep(3000);
		se.selectByVisibleText("– please select –");
		Thread.sleep(3000);
	}
	
	@Test (priority=4 )
	public void Test4() throws InterruptedException  {
		//Check if the Engine Performance text field accepts valid input
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("engineperformance")).sendKeys("1");
		Thread.sleep(3000);
	}
	
	@Test (priority=5 )
	public void Test5() throws InterruptedException  {
		//Check if the Engine Performance text field accepts invalid input
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("engineperformance")).sendKeys("@");
		Thread.sleep(3000);
	}
	
	@Test (priority=6 )
	public void Test6() throws InterruptedException  {
		//Check if Date of Manufacture text field accepts valid date format
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dateofmanufacture")).sendKeys("11/05/2024");
	}
	
	@Test (priority=7  )
	public void Test7() throws InterruptedException  {
   	//Check if Date of Manufacture text field accepts invalid date format
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://sampleapp.tricentis.com/101/app.php");
	    driver.findElement(By.id("nav_automobile")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("dateofmanufacture")).sendKeys("11/05/2025");
	}
	
	@Test (priority=8 )
	public void Test8() throws InterruptedException  {
		//Check if the Number of Seats dropdown is working correctly
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("numberofseats")).click();
		Thread.sleep(3000);
		WebElement make = driver.findElement(By.xpath("//select[@name='Number of Seats']")); 
		Select se = new Select(make);
		Thread.sleep(3000);
		se.selectByVisibleText("2");
		Thread.sleep(3000);
	}
	
	@Test (priority=9 )
	public void Test9() throws InterruptedException  {
		//Check if the Number of Seats dropdown is working incorrectly
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("numberofseats")).click();
		Thread.sleep(3000);
		WebElement make = driver.findElement(By.xpath("//select[@name='Number of Seats']")); 
		Select se = new Select(make);
		Thread.sleep(3000);
		se.selectByVisibleText("– please select –");
		Thread.sleep(3000);
	}
	
	@Test (priority=10 )
	public void Test10() throws InterruptedException  {
		//Check valid input handling for Fuel Type dropdown
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fuel")).click();
		Thread.sleep(3000);
		WebElement make = driver.findElement(By.xpath("//select[@name='Fuel Type']")); 
		Select se = new Select(make);
		Thread.sleep(3000);
		se.selectByVisibleText("Petrol");
		Thread.sleep(3000);
	}
	
	@Test (priority=11  )
	public void Test11() throws InterruptedException  {
		//Check invalid input handling for Fuel Type dropdown
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fuel")).click();
		Thread.sleep(3000);
		WebElement make = driver.findElement(By.xpath("//select[@name='Fuel Type']")); 
		Select se = new Select(make);
		Thread.sleep(3000);
		se.selectByVisibleText("– please select –");
		Thread.sleep(3000);
	}
	
	@Test (priority=12  )
	public void Test12() throws InterruptedException  {
		//Check for valid input in List Price field
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("listprice")).sendKeys("15000");
		Thread.sleep(3000);
	}
	
	@Test (priority=13  )
	public void Test13() throws InterruptedException  {
		//Check for invalid input in List Price field
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("listprice")).sendKeys("abc");
		Thread.sleep(3000);
	}
	
	@Test (priority=14  )
	public void Test14() throws InterruptedException  {
	//Verify License Plate Number Field
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("licenseplatenumber")).sendKeys("abc235@#");
		Thread.sleep(3000);
	}
	
	@Test (priority=15  )
	public void Test15() throws InterruptedException  {
		//Check if Annual Mileage field accepts valid input
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("annualmileage")).sendKeys("2000");
		Thread.sleep(3000);
	}
	
	@Test (priority=16  )
	public void Test16() throws InterruptedException  {
		//Check if Annual Mileage field accepts invalid input
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("annualmileage")).sendKeys("-5000");
		Thread.sleep(3000);
	}
	
	@Test (priority=17 )
	public void Test17() throws InterruptedException  {
	    //Check if the "Next" button works when all valid data is entered
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://sampleapp.tricentis.com/101/app.php");
	    driver.findElement(By.id("nav_automobile")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("nextenterinsurantdata")).click();
	}

}
