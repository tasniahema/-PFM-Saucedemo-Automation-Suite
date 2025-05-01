package pagesPFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SortingProductsValidation {
	protected WebDriver driver;
	
	// constructor
		public SortingProductsValidation(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
		
		// Locate element in page Factory Model
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement dropdownLowToHigh;
		
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/div[1]")
		private WebElement  LowToHighPage1stItem;
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement  dropdownHighToLow;
	
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement AtoZDorpdown;
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement ZtoADorpdown;

		
		
		// Verify the sorting functionality for products.
		
		public void LowToHigh() throws InterruptedException{
			
			// ProductPage Hard Assertion getCurrenturl()
			String expectedUr9 = "https://www.saucedemo.com/inventory.html";
			String actualUr9 = driver.getCurrentUrl();
			Assert.assertEquals(actualUr9, expectedUr9);
			System.out.println("Product Page URL assertion completed successfully.");
			Thread.sleep(2000);
			
			
			
			// select low to high 
			dropdownLowToHigh.click();
			Select selectLtoH = new Select(dropdownLowToHigh);
			selectLtoH.selectByIndex(2);
			System.out.println("Low To High Dorpdown Completed");
			Thread.sleep(2000);
			

			
			// hard assertion  Low to High  page current url
			String expectedUrl4 = "https://www.saucedemo.com/inventory.html";
			String actualUrl4 = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl4, expectedUrl4);
			System.out.println("Low to High page Current  URL assertion completed successfully.");
			Thread.sleep(3000);

	
		}
		
	public void HighToLow() throws InterruptedException{
			
			//  low to high ProductPage Hard Assertion getCurrenturl()
			String expectedUr9 = "https://www.saucedemo.com/inventory.html";
			String actualUr9 = driver.getCurrentUrl();
			Assert.assertEquals(actualUr9, expectedUr9);
			System.out.println("Low to High Product Page URL assertion completed successfully.");
			Thread.sleep(2000);
			
			
			
			// select Price (high to low) 
			 dropdownHighToLow.click();
			Select selectHtoL = new Select( dropdownHighToLow);
			selectHtoL.selectByIndex(3);
			System.out.println("High To Low Dorpdown Completed");
			Thread.sleep(2000);
			
			
			// hard assertion  High to Low  page current url
						String expectedUrl4 = "https://www.saucedemo.com/inventory.html";
						String actualUrl4 = driver.getCurrentUrl();
						Assert.assertEquals(actualUrl4, expectedUrl4);
						System.out.println("High to Low  page Current  URL assertion completed successfully.");
						Thread.sleep(3000);
			}
	
	public void NameAtoZ() throws InterruptedException{
		
		//  high to low  ProductPage Hard Assertion getCurrenturl()
		String expectedUr9 = "https://www.saucedemo.com/inventory.html";
		String actualUr9 = driver.getCurrentUrl();
		Assert.assertEquals(actualUr9, expectedUr9);
		System.out.println("High to Low Product Page URL assertion completed successfully.");
		Thread.sleep(2000);
		
		// select Name (A to Z)
		AtoZDorpdown.click();
		Select selectAtoZ = new Select(AtoZDorpdown);
		selectAtoZ.selectByIndex(0);
		System.out.println("Name (A to Z) Dorpdown Completed");
		Thread.sleep(2000);
		
		// hard assertion  High to Low  page current url
		String expectedUrl4 = "https://www.saucedemo.com/inventory.html";
		String actualUrl4 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl4, expectedUrl4);
		System.out.println("NameAtoZ() page Current  URL assertion completed successfully.");
		Thread.sleep(3000);
	
	}
	
public void NameZtoA() throws InterruptedException{
		
		// A to Z   ProductPage Hard Assertion getCurrenturl()
		String expectedUr9 = "https://www.saucedemo.com/inventory.html";
		String actualUr9 = driver.getCurrentUrl();
		Assert.assertEquals(actualUr9, expectedUr9);
		System.out.println("A to Z   Product Page URL assertion completed successfully.");
		Thread.sleep(2000);
			
		
		// select Name (Z to A)
		ZtoADorpdown.click();
		Select selectZtoA = new Select(ZtoADorpdown);
		selectZtoA.selectByIndex(1);
		System.out.println("Name (Z to A) Dorpdown Completed");
		Thread.sleep(2000);
		
		// hard assertion  High to Low  page current url
				String expectedUrl4 = "https://www.saucedemo.com/inventory.html";
				String actualUrl4 = driver.getCurrentUrl();
				Assert.assertEquals(actualUrl4, expectedUrl4);
				System.out.println("NameZtoA() page Current  URL assertion completed successfully.");
				Thread.sleep(3000);
	   
			
	}
	
	
		
		
}
