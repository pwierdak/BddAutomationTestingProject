package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class LogInSteps {

    static WebDriver driver;

    @BeforeAll
    static public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Legion\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Legion\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/login");
        driver.navigate().to("https://the-internet.herokuapp.com/login");

    }
    @When("User types correct login")
    public void user_types_correct_login() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @When("User types correct password")
    public void user_types_correct_password() {
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    @When("User clicks LogIn button")
    public void user_clicks_log_in_button() {
        driver.findElement(By.tagName("button")).click();
    }
    @Then("User loged in correctly")
    public void user_loged_in_correctly() {
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        //driver.close();
    }
    @AfterAll
    static public void tearDown() {
        driver.close();

    }

}
