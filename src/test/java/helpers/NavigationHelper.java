package helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {

    WebDriver driver;
    public NavigationHelper(WebDriver driver) {
        super();
    }

    public void gotoMainPage() { click(By.xpath("//*[@class='icon-home']"));
    }

    public void gotoSignInPage() {
        click(By.xpath("//*[@class='login']"));
    }

    public void gotoContactPage() {
        click(By.xpath("//*[@id='contact-link']"));
    }

    public void goToFbPage() {
        driver.navigate().to("https://www.facebook.com/groups/525066904174158/");
    }
    public void goToTwitterPage() {
        driver.navigate().to("https://twitter.com/seleniumfrmwrk");
    }
    public void goToYoutubePage() {
        driver.navigate().to("https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
    }
    public void goToGooglePlusPage() {
        driver.navigate().to("https://plus.google.com/111979135243110831526/posts");
    }
    public void goToWomenPage() {
        driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
    }
    public void goToSpecialsPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=prices-drop");
    }

    public void goToNewProductsPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=new-products");
    }
    public void goToBestSellersPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=new-products");
    }
    public void goToOurStoresPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=stores");
    }
    public void goToContactUsPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
    }
    public void goToTermsOfUsePage() {
        driver.navigate().to("http://automationpractice.com/index.php?id_cms=3&controller=cms");
    }
    public void goToAboutUsPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=stores");
    }
    public void goToSitemapPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=stores");
    }
    public void goToMyOrdersPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=history");
    }
    public void goToMyCreditSlipsPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=order-slip");
    }
    public void goToMyAddressPagePage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=addresses");
    }
    public void goToMyPersonalInfoPage() {
        driver.navigate().to("http://automationpractice.com/index.php?controller=identity");
    }
    public void goToSignOutPage() {
        driver.navigate().to("http://automationpractice.com/index.php?mylogout");
    }
}
