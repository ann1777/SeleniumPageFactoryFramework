package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class URLGetter extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> BASE_URL = Collections.singleton(PropertyReader.config.getProperty("website_host", "https://automationpractice.com/index.php"));
        return String.valueOf("website_host"); }

    public static final String BASE_URL = "http://automationpractice.com/index.php";

    public static final Map<String, String> PAGE_URLS = Map.ofEntries(
            Map.entry("homePage", BASE_URL),
            Map.entry("aboutUsPage", BASE_URL + "?controller=addresses"),
            Map.entry("bestSellersPage", BASE_URL + "?controller=best-sales"),
            Map.entry("catalogPage", BASE_URL + "?id_category=5&controller=category"),
            Map.entry("contactUsPage", BASE_URL + "?controller=contact"),
            Map.entry("createAccountPage", BASE_URL + "?controller=authentication&back=my-account#account-creation"),
            Map.entry("creditSlipsPage", BASE_URL + "?controller=order-slip"),
            Map.entry("myAccountPage", BASE_URL + "?controller=my-account"),
            Map.entry("myAddressPage", BASE_URL + "?controller=addresses"),
            Map.entry("newProductsPage", BASE_URL + "?controller=new-products"),
            Map.entry("orderHistoryPage", BASE_URL + "?controller=history"),
            Map.entry("ourStoresPage", BASE_URL + "?controller=stores"),
            Map.entry("personalInfoPage", BASE_URL + "?controller=addresses"),
            Map.entry("recoveryPasswdPage", BASE_URL + "?controller=password"),
            Map.entry("searchResultsPage", BASE_URL + "?controller=search&orderby=position&orderway=desc&search_query=Dress&submit_search="),
            Map.entry("shoppingCartPage", BASE_URL + "?controller=order"),
            Map.entry("signInPage", BASE_URL + "?controller=authentication&back=my-account"),
            Map.entry("sitemapPage", BASE_URL + "?controller=sitemap"),
            Map.entry("specialsPage", BASE_URL + "?controller=prices-drop"),
            Map.entry("termsOfUsePage", BASE_URL + "?id_cms=3&controller=cms"),
            Map.entry("fbPage", "https://www.facebook.com/groups/525066904174158/"),
            Map.entry("twitter", "https://twitter.com/seleniumfrmwrk"),
            Map.entry("googlePlusPage", "https://plus.google.com/111979135243110831526/posts"),
            Map.entry("youtubePage", "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA")
    );
}
