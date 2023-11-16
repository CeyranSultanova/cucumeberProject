package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages= new AmazonPages(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.Homepage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.clickAcceptCookies();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProductName();

    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterForShippedByAmazon();

    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.filterForApple();
    }

    @When("click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.clickTheFirstProduct();
    }

    @When("Add to Cart")
    public void addToCart() { AmazonPages.addToCard();

    }

    @When("Check at cart page")
    public void checkAtCartPage() { AmazonPages.checkAtCartPage();
    }
}
