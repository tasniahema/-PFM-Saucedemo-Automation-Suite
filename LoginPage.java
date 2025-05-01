package pagesPFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	protected WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Locate element in page Factory Model
	@FindBy(id = "user-name")
	private WebElement usernameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "login-button")
	private WebElement loginBtn;

	// actions
	public void enterUser(String username) {
		usernameField.sendKeys(username);
		System.out.println("User set completed");
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
		System.out.println("Password set completed");

	}

	public void clickLogin() {
		loginBtn.click();
		System.out.println("Click completed");

	}
}
