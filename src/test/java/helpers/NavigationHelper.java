package helpers;

import helpers.browserConfig.URLGetter;
import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {

    WebDriver driver;
    public NavigationHelper() {
        super();
    }
    public void gotoHomePage() {
        driver.navigate().to(URLGetter.BASE_URL); }
    public void goToSignInPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("signInPage")); }
    public void goToContactPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("contactUsPage")); }
    public void goToFbPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("fbPage")); }
    public void goToTwitterPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("twitterPage")); }
    public void goToYoutubePage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("youtubePage")); }
    public void goToGooglePlusPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("googlePlusPage")); }
    public void goToWomenPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("catalogPage")); }
    public void goToSpecialsPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("specialsPage")); }
    public void goToNewProductsPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("newProductsPage")); }
    public void goToBestSellersPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("bestSellersPage")); }
    public void goToOurStoresPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("ourStoresPage")); }
    public void goToContactUsPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("contactUsPage")); }
    public void goToTermsOfUsePage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("termsOfUsePage")); }
    public void goToAboutUsPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("aboutUsPage")); }
    public void goToSitemapPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("sitemapPage")); }
    public void goToMyOrdersPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("orderHistoryPage")); }
    public void goToMyCreditSlipsPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("creditSlipsPage")); }
    public void goToMyAddressPagePage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("myAddressPage")); }
    public void goToMyPersonalInfoPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("personalInfoPage")); }
    public void goToSignOutPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("signInPage")); }
    public void goToCreateAccountPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("createAccountPage")); }
    public void goToMyAccountPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("myAccountPage")); }
    public void goToRecoveryPasswdPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("recoveryPasswdPage")); }
    public void goToSearchResultsPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("searchResultsPage")); }
    public void goToShoppingCartPage() {
        driver.navigate().to(URLGetter.PAGE_URLS.get("shoppingCartPage")); }
}


