package actions;

import locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends BasePage{
    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.home);
    }

    public void SearchingAnItem() {

        home.signInBtn.click();
        home.txtSearchBox.sendKeys("7yr old toys");
        home.btnSearchSubmit.click();

    }
}
