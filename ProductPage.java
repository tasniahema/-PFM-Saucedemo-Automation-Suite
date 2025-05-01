package pagesPFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
	protected WebDriver driver;

	// constructor
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Locate element in page Factory Model
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement add1stProduct;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement add2ndProduct;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	private WebElement clickCarticon;

	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeoneProduct;

	@FindBy(id = "continue-shopping")
	private WebElement continueShoppingBtn;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement againaddoneProduct;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	private WebElement clickCarticon1;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
	private WebElement cartBadge;

	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeoneProdeuctagain;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
	private WebElement cartBadgeupdate;

	// action

	public void BuyFristProduct() throws InterruptedException {
		// ProductPage Hard Assertion getCurrenturl()
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("URL assertion completed successfully.");
		Thread.sleep(2000);

		// add first product
		add1stProduct.click();
		System.out.println("1st product add to cart completed");
		Thread.sleep(3000);
	}

	public void BuySecondProduct() throws InterruptedException {

		// add 2nd product
		add2ndProduct.click();
		System.out.println("2nd product add to cart completed");
		Thread.sleep(2000);

		clickCarticon.click();// click CART ICON
		// hard assertion cart page current url
		String expectedUrl1 = "https://www.saucedemo.com/cart.html";
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);

		// remove one item
		removeoneProduct.click();
		System.out.println("Remove item One times");
		Thread.sleep(2000);

		// click continue shopping button
		continueShoppingBtn.click();

		// back to product page (hard assertion )
		String expectedUrl2 = "https://www.saucedemo.com/inventory.html";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2);
		System.out.println("URL assertion completed successfully.");
		Thread.sleep(2000);

		// again add one item
		againaddoneProduct.click();
		System.out.println("3rd time  product add to cart completed");
		Thread.sleep(3000);

		clickCarticon1.click();// click cart iocn
		Thread.sleep(3000);

		// Find the cart badge element
		// WebElement cartBadge =
		// driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span"));
		cartBadge.click();
		// Get the number from cart badge
		String itemCount = cartBadge.getText();
		// Print the number
		System.out.println("First Time Number of products in cart: " + itemCount);
		Thread.sleep(3000);

		// remove one item
		removeoneProdeuctagain.click();
		System.out.println("Remove item Two times");
		Thread.sleep(2000);

		// hard assertion cart page current url
		String expectedUrl3 = "https://www.saucedemo.com/cart.html";
		String actualUrl3 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl3, expectedUrl3);
		System.out.println("Cart-page URL assertion completed successfully.");
		Thread.sleep(3000);

		// Find the cart badge element
		cartBadgeupdate.click();
		;
		// Get the number from cart badge
		String itemCountupdate = cartBadgeupdate.getText();
		// Print the number
		System.out.println("Number of products in cart: " + itemCountupdate);
		Thread.sleep(3000);

	}

}
