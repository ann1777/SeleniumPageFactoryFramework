package actions;

import locators.BasePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class BasePage {

public BasePageLocators base;
    public WebDriver driver;

    public BasePage(){
        this.base = new BasePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.base);
    }

    public void SearchingAnItem() {
        base.searchFld.sendKeys("Blouse");
        base.searchBtn.click();
        Assert.assertNotNull();

    }



}
