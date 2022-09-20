package helpers;

import objectRepository.BasePage_OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ButtonsHelper extends HelperBase {

    public ButtonsHelper(WebDriver driver) {
        super();
    }

    public void clickToContactUsBtn() {
        click(By.xpath(BasePage_OR.CONTACT_AS_BTN));
    }

    public void clickToWomenBtn() { click(By.xpath(BasePage_OR.WOMEN_BTN)); }

    public void clickToDressesBtn() { click(By.xpath(BasePage_OR.HEADER_DRESSES_BTN)); }

    public void clickToEveningDressesSubTitle() { click(By.xpath(BasePage_OR.HEADER_DISPLAY_BLOCK_EVENING_DRESSES_SUBTITLE)); }

    public void gotoButtonsItemElementsMenu() {
        click(By.xpath("//ul[@class='menu-list']//span [text()='Buttons']"));
    }

    public void clickToTShirtsBtn() { click(By.xpath(BasePage_OR.HEADER_TSHIRTS_BTN)); }

    public void clickSortBySelector() { click(By.xpath("//select [@id='selectProductSort']"));}
    public void clickHomeIcn() { click(By.xpath("//*[@class='icon-home']")); }

    public void clickLoginBtn() { click(By.xpath("//*[@class='login']")); }

    public void clickContactLink() { click(By.xpath("//*[@id='contact-link']")); }
}
