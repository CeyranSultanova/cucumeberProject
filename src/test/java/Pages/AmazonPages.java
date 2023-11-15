package Pages;
import Util.ElementHelper;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver ;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By acceptCookies= By.id("sp-cc-accept");
    static By search=By.id("twotabsearchtextbox");
    static By searchButton =By.id("nav-search-submit-button");
    static  By filterForShippedByAmazon=By.cssSelector("span[class='s-navigation-icon-text aok-relative'] span[class='a-size-base a-color-base']");
    static  By appleFilter=By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    static  By firstProduct =By.cssSelector("img[alt='Apple AirPods Max - Gümüş Rengi']");
    static  By add =By.id("add-to-cart-button");
    public  AmazonPages (WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
        this.elementHelper= new ElementHelper(driver);
    }
    public static void Homepage() {
    }

    public static void clickAcceptCookies() {
        elementHelper.click(acceptCookies);
    }

    public static void clickSearchButton() {
        elementHelper.click(searchButton);
    }

    public static void writeProductName() {
        elementHelper.findElement(search).sendKeys("airpods");

    }
    public static void filterForShippedByAmazon() {
        elementHelper.click(filterForShippedByAmazon);

    }


    public static void filterForApple() {
    elementHelper.click(appleFilter);
    }

    public static void clickTheFirstProduct() {
        elementHelper.click(firstProduct);
    }


}
