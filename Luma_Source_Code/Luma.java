package luma;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Luma {
	
	static WebDriver wd;
	static Actions act ;
	JavascriptExecutor js;
	

  @BeforeTest
  public void beforeTest() {
	  
	  // Site Opening
	     // Driver Code
		  System.setProperty("driver.chrome", "chromedriver.exe");
				
		// Start Chrome Maximized
		  ChromeOptions opt = new ChromeOptions();
		  opt.addArguments("start-maximized");
				
		  wd = new ChromeDriver(opt);
				
		 // Link
		  wd.get("https://magento.softwaretestingboard.com");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  String s1 = wd.getTitle();
	  String s2 = "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
	  String s3 = "My Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
	  String s4 = "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
	  String s5 = "Hollister Backyard Sweatshirt Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
	  String s6 = "Shopping Cart Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
	  
	  

	  if (s1.equals(s2)) 
	  {
		System.out.println("Is Title Matching Or Not :- True");
		System.out.println("You Are On Home Page");
		System.out.println("Title Of Page :- "+wd.getTitle());
		System.out.println("Url Of Page :- "+wd.getCurrentUrl());
		System.out.println("\n");
	  }
	  else if (s1.equals(s3)) 
	  {
		    System.out.println("Is Title Matching Or Not :- True");
			System.out.println("You Are On My Account Page");
			System.out.println("Title Of Page :- "+wd.getTitle());
			System.out.println("Url Of Page :- "+wd.getCurrentUrl());
			System.out.println("\n");
	  }
	  else if (s1.equals(s4)) 
	  {
		    System.out.println("Is Title Matching Or Not :- True");
			System.out.println("You Are On Customer Login Page");
			System.out.println("Title Of Page :- "+wd.getTitle());
			System.out.println("Url Of Page :- "+wd.getCurrentUrl());
			System.out.println("\n");
	  }
	  else if (s1.equals(s5)) 
	  {
		    System.out.println("Is Title Matching Or Not :- True");
			System.out.println("You Are On Product Page");
			System.out.println("Title Of Page :- "+wd.getTitle());
			System.out.println("Url Of Page :- "+wd.getCurrentUrl());
			System.out.println("\n");
	  }
	  else if(s1.equals(s6))
	  {
		    System.out.println("Is Title Matching Or Not :- True");
			System.out.println("You Are On Shopping Cart Page");
			System.out.println("Title Of Page :- "+wd.getTitle());
			System.out.println("Url Of Page :- "+wd.getCurrentUrl());
			System.out.println("\n");
	  }
	  
	  
  }
  
  @Test (priority = 1 )
  @Parameters({"first_name","last_name","email_id","password","conf_password"})
  public void sign_In(String s1,String s2,String s3,String s4,String s5) throws InterruptedException, IOException {
	  
	//User Account Creation
	  wd.findElement(By.linkText("Create an Account")).click();//Clicking on Create An Account
	  
	  
	   
	  wd.findElement(By.xpath("//input[@id='firstname']")).sendKeys(s1);// firstName 
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='lastname']")).sendKeys(s2);//lastName 
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='is_subscribed']")).click(); //Check box
	 
	  Thread.sleep(1000);
	  
	  js = (JavascriptExecutor) wd; 
	  js.executeScript("window.scrollBy(0,600)");//Scrolling Down
	   
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='email_address']")).sendKeys(s3);//email_Id
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='password']")).sendKeys(s4);// Password 
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(s5);//Conf. Password 
	  
	  Thread.sleep(2000);
	  
	 wd.findElement(By.xpath("//button[@title='Create an Account']")).click();//Button
  }
  
  @Test (priority = 2 )
  @Parameters({"firstname","lastname","new_email_id","old_password","new_password","conf_Password"})
  public void profile(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException 
  {
	//Profile( My Account )
	  
	  Thread.sleep(2000); 
	  
	  wd.findElement(By.linkText("Edit")).click(); // edit link
	  
	  Thread.sleep(2000);
	  
	  js.executeScript("window.scrollBy(0,250)");//scroll down
	  
	  wd.findElement(By.xpath("//input[@id='firstname']")).clear();//Clearing field
	  
	  Thread.sleep(900);
	  
	  wd.findElement(By.xpath("//input[@id='firstname']")).sendKeys(s1);//firstName 
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='lastname']")).clear();//Clearing The field
	  
	  Thread.sleep(900);
	  
	  wd.findElement(By.xpath("//input[@id='lastname']")).sendKeys(s2);//lastName 
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='change-email']")).click();//check box
	  
	  Thread.sleep(900);
	  
	  wd.findElement(By.xpath("//input[@id='change-password']")).click();//check box
	  
	  Thread.sleep(1000); 
	  
	  wd.findElement(By.xpath("//input[@id='email']")).clear();//Clearing The Field
	  
	  Thread.sleep(900); 
	  
	  wd.findElement(By.xpath("//input[@id='email']")).sendKeys(s3);//email id
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='current-password']")).sendKeys(s4); //current Password 
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='password']")).sendKeys(s5);//new password 
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(s6); //conf.password 
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//button[@title='Save']")).click();//save button
  }
  @Test (priority = 3)
  @Parameters({"username","pass"})
  public void log_In(String s1,String s2) throws InterruptedException 
  {
	// Log_in
	 
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//input[@id='email']")).sendKeys(s1);// email_Id
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(s2); // Password
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//button[@class='action login primary']")).click();// Sign_in button
  }
  @Test (priority = 4)
  @Parameters({"product"})
  public void search_Product(String s1) throws InterruptedException 
  {
	// Logo_Clicking
	  
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//a[@aria-label='store logo']")).click();//Click On Logo

	// Product_Searching
	  
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//input[@id='search']")).click();// search bar clicking
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='search']")).sendKeys(s1);// search bar input
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@id='search']")).submit();// search bar submit(Enter)
	  
	  Thread.sleep(2000);
	  
	  js = (JavascriptExecutor) wd;
	  
	  js.executeScript("window.scrollBy(0,280)");// scroll down
	  
	  Thread.sleep(1000);
	  
	  WebElement pr = wd.findElement(By.linkText("Hollister Backyard Sweatshirt"));// Cursor hover to product
	  
	  act = new Actions(wd);
	  
	  act.moveToElement(pr).build().perform();
	  
	  Thread.sleep(2000);
	  
	  wd.findElement(By.linkText("Hollister Backyard Sweatshirt")).click();// Selecting product
	  
	  Thread.sleep(1000);
  }
  @Test(priority = 5)
  @Parameters({"quantity"})
  public void add_To_Cart(String s1) throws InterruptedException 
  {
	  //Adding To Cart
	  
	   js.executeScript("window.scrollBy(0,250)");// scroll down
	   
	   Thread.sleep(1000);
	   
		WebElement sz = wd.findElement(By.xpath("//div[@option-id='170']"));// Cursor hover to "xl" size
		
		act.moveToElement(sz).build().perform();
		
		Thread.sleep(1000);
		
		wd.findElement(By.xpath("//div[@option-id='170']")).click();// selecting "xl" size
		
		Thread.sleep(1000);
		
		WebElement cl = wd.findElement(By.xpath("//div[@option-id='53']"));// Cursor hover to "Green" color
		
		act.moveToElement(cl).build().perform();
		
		Thread.sleep(1000);
		
		wd.findElement(By.xpath("//div[@option-id='53']")).click();// selecting "Green" color
		
		Thread.sleep(1000);
		
		wd.findElement(By.xpath("//input[@id='qty']")).clear();// clearing default quantity
		
		Thread.sleep(1000);
		
		wd.findElement(By.xpath("//input[@id='qty']")).sendKeys(s1);// adding quantity as"2"
		
		Thread.sleep(1000);
		
		wd.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();// add to cart button
		
		Thread.sleep(2000);
		  
		  js.executeScript("window.scrollBy(0,-200)");// scroll up
		  
		  Thread.sleep(1000);
			
		  WebElement ca = wd.findElement(By.xpath("//a[@class='action showcart']"));// Cursor hover to cart symbol
		  
		  act.moveToElement(ca).build().perform();
		  
		  Thread.sleep(1000);
			
		  wd.findElement(By.xpath("//a[@class='action showcart']")).click();// clicking cart symbol
			
		  Thread.sleep(2000);
			
		  wd.findElement(By.linkText("View and Edit Cart")).click();//clicking view and edit cart link
  }
  @Test(priority = 6)
  @Parameters({"company","address_line_1","address_line_2","address_line_3","city","zipcode","phone_number"})
  public void payment_Product(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws InterruptedException 
  {
	 
	  Thread.sleep(3000);
	  
	  js.executeScript("window.scrollBy(0, 100)");// scroll down
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//button[@data-role='proceed-to-checkout']")).click();//button proceed to checkout
	  
	  Thread.sleep(4000);
	  
	  js.executeScript("window.scrollBy(0,120)");//scroll down
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@name='company']")).sendKeys(s1);//company
	  
	  Thread.sleep(1000);
	  
      wd.findElement(By.xpath("//input[@name='street[0]']")).sendKeys(s2);//Address line 1
	  
	  Thread.sleep(1000);
	  
      wd.findElement(By.xpath("//input[@name='street[1]']")).sendKeys(s3);////Address line 2
	  
	  Thread.sleep(1000);
	  
      wd.findElement(By.xpath("//input[@name='street[2]']")).sendKeys(s4);//Address line 3
      
	  
	  Thread.sleep(1000);
	  
	  js.executeScript("window.scrollBy(0,570)");//scroll down
	  
	  wd.findElement(By.xpath("//input[@name='city']")).sendKeys(s5);
	  
	  Thread.sleep(1000);
	  
	  Select country = new Select(wd.findElement(By.xpath("//select[@name='country_id']")));
	 
	  country.selectByVisibleText("India"); //Selecting Country
	  
	  Thread.sleep(1000);
	  
	  Select state = new Select(wd.findElement(By.xpath("//select[@name='region_id']")));
	  
	  state.selectByVisibleText("Maharashtra");//Selecting State
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@name='postcode']")).sendKeys(s6);
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.xpath("//input[@name='telephone']")).sendKeys(s7);
	  
	  Thread.sleep(3000);
	  
	  wd.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
	  
	  Thread.sleep(5000);
	  
	  wd.findElement(By.xpath("//button[@title='Place Order']")).click();
	  
	  Thread.sleep(5000);
	  
	  
	  wd.findElement(By.xpath("//a[@class='order-number']")).click();
	  
	  Thread.sleep(1000);
	  
	  String s11 = wd.getTitle();
	  
	  String s12 = wd.getTitle();
	  
	  if(s11.equals(s12))
	  {
		    System.out.println("Is Title Matching Or Not :- True");
			System.out.println("You Are On Order Page");
			System.out.println("Title Of Page :- "+wd.getTitle());
			System.out.println("Url Of Page :- "+wd.getCurrentUrl());
			System.out.println("\n");
	  }
	  
	  js.executeScript("window.scrollBy(0,250)");//scroll down
	  
	  Thread.sleep(2000);
	  
	  js.executeScript("window.scrollBy(0,650)");//scroll down
	  
  }
 
  @Test (priority = 7)
  public void log_Out() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  
	  js.executeScript("window.scrollBy(0,-900)");//scroll up
	  
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//button[@data-action='customer-menu-toggle']")).click();
	  
	  Thread.sleep(1000);
	  
	  wd.findElement(By.linkText("Sign Out")).click();
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  
	  wd.close();
  


}
}
