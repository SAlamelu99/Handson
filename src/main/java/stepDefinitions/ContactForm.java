package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactForm {
	

	public static WebDriver driver1;

	@Before
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void closebrowser() {
		driver.quit();
	}

	@Given("user is in Application Home Page")
	public void user_is_in_Application_Home_Page() {
		driver.get("https://www.mycontactform.com/samples/basiccontact.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("the title is Basic Contact Form - myContactForm.com")
	public void the_title_is_Basic_Contact_Form_myContactForm_com() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Basic Contact Form - myContactForm.com";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Then("click on here link")
	public void click_on_here_link() {
		driver.findElement(By.xpath("//*[@id=\"center_col\"]/p/a")).click();
	}

	@When("the title is Become a Site User - myContactForm.com")
	public void the_title_is_Become_a_Site_User_myContactForm_com() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "Become a Site User - myContactForm.com";
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@Then("user enters the details")
	public void user_enters_the_details(io.cucumber.datatable.DataTable dataTable) {
		List<String> userData = dataTable.asList();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(userData.get(0));
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userData.get(1));
		driver.findElement(By.xpath("//*[@id=\"user_signup\"]")).sendKeys("SabariKannan");
		driver.findElement(By.xpath("//*[@id=\"pass_signup\"]")).sendKeys("sabari");
		driver.findElement(By.xpath("//*[@id=\"pass2\"]")).sendKeys("sabari");

	}

	@Then("user click on privacy check box")
	public void user_click_on_privacy_check_box() {

		driver.findElement(By.xpath("//*[@id=\"useragree\"]")).click();
	
		
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {

		driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/div[7]/input")).click();
	}

	@Then("verifying the status")
	public void verifying_the_status() {
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"success_status\"]"))));

	}


}
