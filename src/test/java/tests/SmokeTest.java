package tests;

import helpers.AppManager;
import org.junit.Test;
import org.testng.Assert;

import java.io.IOException;

public class SmokeTest extends BaseTest {
//    public SmokeTest(WebDriver driver, AppManager app) throws IOException {
//        super(driver);
//        this.app = app;
//    }

    public SmokeTest() throws IOException {
        super(driver);
        this.app = app;
    }
    AppManager app = new AppManager();
    @Test
    public void testElementsButtonsItem() {
        app.getNavigationHelper().gotoMainPage();
        app.getButtonsHelper().gotoButtonsItemElementsMenu();
        app.getButtonsHelper().clickToClickMeButton();
        Assert.assertEquals(app.getButtonsHelper().getTextClickMeButton(),"You have done a dynamic click");
        System.out.println("After clicking on 'Click Me' button follow test appears: " + app.getButtonsHelper().getTextClickMeButton());
        app.getNavigationHelper().gotoMainPage();
        app.getUserJsonHelper().createAccount(registrationFormData);
    }
}
