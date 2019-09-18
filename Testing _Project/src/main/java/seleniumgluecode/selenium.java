package seleniumgluecode;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.*;

public class selenium {
	public static WebDriver driver;
	
	@Given("^user is  on signup page$")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avyaan\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.bookswagon.com/");
	}

	@When("^user navigates to signup Page$")
	public void user_navigates_to_signup_Page(){
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String Email, String Password, String CPassword) {
		
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtEmail']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtPassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtConfirmPwd']")).sendKeys(CPassword);
	}
	
	@Then("^user success login$")
	public void user_success_login(){
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_btnSubmit']")).click();
	}


}
