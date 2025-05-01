package pagesPFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkoutpage {

	protected WebDriver driver;

	// constructor
	public Checkoutpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	// Locate element in page Factory Model
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	private WebElement clickCarticon;

	@FindBy(id = "checkout")
	private WebElement checkoutBtn;
	
	@FindBy(id = "first-name")
	private WebElement firstname;

	@FindBy(id = "last-name")
	private WebElement lastname;
	
	@FindBy(id = "postal-code")
	private WebElement postalcode;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")
	private WebElement FinishBtn;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/h2")
	private WebElement Checkoutcompletepage;
	
	@FindBy(id = "back-to-products")
	private WebElement BackHomeBtn;
	
	public void CheckOut() throws InterruptedException {

		clickCarticon.click();// click CART ICON
		// hard assertion cart page current url
		String expectedUrl4 = "https://www.saucedemo.com/cart.html";
		String actualUrl4 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl4, expectedUrl4);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);

		// click checkout button
		checkoutBtn.click();
		
		// Hard assertion checkout page
		String expectedUrl5 = "https://www.saucedemo.com/checkout-step-one.html";
		String actualUrl5 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl5, expectedUrl5);
		System.out.println("Chckout page  URL assertion completed successfully.");
		Thread.sleep(3000);

		// provide first name ,last name , zip code

		firstname.sendKeys("John");
		lastname.sendKeys("Doe");
		postalcode.sendKeys("12345");
		Thread.sleep(4000);
		continueBtn.click();
		Thread.sleep(5000);

		
		// Hard assertion checkout page 
		
				String expectedUrl6 = "https://www.saucedemo.com/checkout-step-two.html";
				String actualUrl6 = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl6, expectedUrl6);
				System.out.println("Checkout: Overview URL assertion completed successfully.");
				Thread.sleep(3000);
				
				
				// click finish button 
				FinishBtn.click();
				
	            // get url complete checkout page assertion 
				String expectedUrl7 = "https://www.saucedemo.com/checkout-complete.html";
				String actualUrl7 = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl7, expectedUrl7);
				System.out.println("Checkout: Complete! URL assertion completed successfully.");
				Thread.sleep(3000);
				
				
				// get text  Thank you for your order!
				Checkoutcompletepage.click();
				String Completecheckout = Checkoutcompletepage.getText();
				String CheckOutcompletePage = "Thank you for your order!";
				Assert.assertEquals(Completecheckout, CheckOutcompletePage);
				System.out.println(Completecheckout);
			    Thread.sleep(3000);
				
			    
			 // click Back Home  button 
			    BackHomeBtn.click();
				Thread.sleep(3000);
				
				
				// ProductPage Hard Assertion getCurrenturl()
				String expectedUr8 = "https://www.saucedemo.com/inventory.html";
				String actualUr8 = driver.getCurrentUrl();
				Assert.assertEquals(actualUr8, expectedUr8);
				System.out.println("Product page URL assertion completed successfully.");
				Thread.sleep(2000);
	
	}
}
