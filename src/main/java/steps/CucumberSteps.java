package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberSteps extends CartPage{

    private static final String SUCCESSFULL_MESSAGE = "Product successfully added to your shopping cart";
    private CartPage cartPage;
    private WebDriver driver;

    @Given("^Configure browser$")
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\My data\\study\\Cucumber\\cucumber-archetype\\src\\main\\java\\resourses\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();

        this.cartPage = new CartPage(this.driver);
    }

    @And("^open home page$")
    public void openMainPage() {
        this.driver.navigate().to(PAGE_URL);
    }

    @And("^search the word \"([^\"]*)\" in search field$")
    public void searchBlouse(String word) {
        searchField.sendKeys(word);
        searchButton.click();
    }

    @And("^turn page into a list view$")
    public void turnIntoListView() {
        listIcon.click();
    }

    @Then("^add product into a cart$")
    public void addProductIntoCart() {
        addToCartButton.click();
    }

    @And("^checking the presence of product in a cart$")
    public boolean toCheckTheMsg() {
        return successfullyMsg.getText().equals(SUCCESSFULL_MESSAGE);
    }

    @Then("^close the browser$")
    public void cleanup() {
        this.driver.close();
    }
}

