package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    protected static final String PAGE_URL = "http://automationpractice.com";
    public WebDriver driver;

    @FindBy(id = "search_query_top")
    protected static WebElement searchField;

    @FindBy(xpath = "//*[@id='searchbox']/button")
    protected static WebElement searchButton;

    @FindBy(xpath = "//*[@id='list']/a")
    protected static WebElement listIcon;

    @FindBy(className = "ajax_add_to_cart_button")
    protected static WebElement addToCartButton;

    @FindBy (css = ".layer_cart_product > h2:nth-child(2)")
    protected static WebElement successfullyMsg;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CartPage() {
    }
}
