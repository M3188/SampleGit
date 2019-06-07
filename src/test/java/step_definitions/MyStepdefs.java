package step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MyStepdefs {

    @Before
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    WebDriver driver = null;
    @Given("I navigate to the site with valid url")
    public void iNavigateToTheSiteWithValidUrl() {
        driver = new ChromeDriver();
      driver.navigate().to("https://www.phptravels.net/register");
        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//li[@id='li_myaccount']")).click();
        List<WebElement> elements = driver.findElements(By.partialLinkText("register"));
        System.out.println("number of elements: " + elements.toString());

        for(WebElement ele : elements){
            System.out.println(ele.getText());

        }*/
    }

    @When("I  fill all required details")
    public void iFillAllRequiredDetails() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("Saty");
        driver.findElement(By.cssSelector("[name=lastname]")).sendKeys("Dcosta");
        driver.findElement(By.cssSelector("[name=phone]")).sendKeys("9056789273");
        driver.findElement(By.cssSelector("[name=email]")).sendKeys("saty123@gmail.com");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("Saty123");
        driver.findElement(By.cssSelector("[name=confirmpassword]")).sendKeys("Saty123");
    }

    @And("I submit request")
    public void iSubmitRequest() {
        driver.findElement(By.cssSelector(".signupbtn")).click();
    }

    @Then("User is registered succesfully")
    public void userIsRegisteredSuccesfully() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.getCurrentUrl().contains("/account/");

    }

    @And("User is able to login")
    public void userIsAbleToLogin() {
        driver.findElement(By.cssSelector(".RTL.go-right")).getText().contains("Sam");

    }
}
