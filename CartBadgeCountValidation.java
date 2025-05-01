package pagesPFM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartBadgeCountValidation {

	protected WebDriver driver;

	// constructor
	public CartBadgeCountValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	// Locate element in page Factory Model
	
				@FindBy(id = "add-to-cart-sauce-labs-backpack")
				private WebElement addFirstProduct;
				
				@FindBy(id = "add-to-cart-sauce-labs-bike-light")
				private WebElement add2ndProduct;
				
				@FindBy(id = "add-to-cart-sauce-labs-onesie")
				private WebElement add3rdProduct;
				
				@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
				private WebElement add4thProduct;
				
				
				@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
				private WebElement clickCarticon;
				
				@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
				private WebElement cartBadgeupdate;
				
				@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
				private WebElement cartBadgeupdate1;

	public void BuyMultipleProduct() throws InterruptedException {
		// ProductPage Hard Assertion
		String expectedUr = "https://www.saucedemo.com/inventory.html";
		String actualUr = driver.getCurrentUrl();
		Assert.assertEquals(actualUr, expectedUr);
		System.out.println("Product Page URL assertion completed successfully.");
		Thread.sleep(2000);

		addFirstProduct.click();// add first product
		System.out.println("1st product add to cart completed");
		Thread.sleep(2000);

		add2ndProduct.click();// add 2nd product
		System.out.println("2nd product add to cart completed");
		Thread.sleep(2000);

		add3rdProduct.click();// add 3rd product
		System.out.println("3rd product add to cart completed");
		Thread.sleep(2000);

		add4thProduct.click();// add 4th product
		System.out.println("4th product add to cart completed");
		Thread.sleep(3000);

		clickCarticon.click();// click CART ICON
		// hard assertion cart page current url
		String expectedUrl1 = "https://www.saucedemo.com/cart.html";
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);

		// Find the cart badge element
		cartBadgeupdate.click();
		// Get the number from cart badge
		String itemCountupdate = cartBadgeupdate.getText();
		// Print the number
		System.out.println("Number of products in cart: " + itemCountupdate);
		Thread.sleep(3000);

		// remove one item
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		System.out.println("Remove item one times");
		Thread.sleep(2000);

		clickCarticon.click();// click CART ICON
		// hard assertion cart page current url
		String expectedUrl2 = "https://www.saucedemo.com/cart.html";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);

		// Verify that the cart badge updates correctly.
		// Find the cart badge element
		cartBadgeupdate1.click();
		// Get the number from cart badge
		String itemCountupdate1 = cartBadgeupdate1.getText();
		// Print the number
		System.out.println("Number of products in cart: " + itemCountupdate1);
		Thread.sleep(3000);

	}
}