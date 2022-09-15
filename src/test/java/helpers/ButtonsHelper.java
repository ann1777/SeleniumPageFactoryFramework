package helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ButtonsHelper extends HelperBase {

    public ButtonsHelper(WebDriver driver) {
        super();
    }

    public void clickToClickMeButton() {
        click(By.xpath("//button [text()='Click Me']"));
    }

    public String getTextClickMeButton()    {
        return driver.findElement(By.xpath("//p [@id='dynamicClickMessage']")).getText().trim(); }

    public void gotoButtonsItemElementsMenu() {
        click(By.xpath("//ul[@class='menu-list']//span [text()='Buttons']"));
    }

    public void clickHomeIcn() { click(By.xpath("//*[@class='icon-home']")); }

    public void clickLoginBtn() { click(By.xpath("//*[@class='login']")); }

    public void clickContactLink() { click(By.xpath("//*[@id='contact-link']")); }
}
