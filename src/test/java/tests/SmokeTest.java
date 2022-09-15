package tests;

import helpers.AppManager;
import model.RegistrationFormData;
import org.junit.Test;
import org.testng.Assert;

import java.io.IOException;

public class SmokeTest extends BaseTest {
    AppManager app = new AppManager();
    public RegistrationFormData registrationFormData;

    public SmokeTest() throws IOException {
        super();
        this.app = app;
    }
    @Test
    public void testElementsButtonsItem() {
        app.getNavigationHelper().gotoHomePage();
        app.getButtonsHelper().gotoButtonsItemElementsMenu();
        app.getButtonsHelper().clickToClickMeButton();
        Assert.assertEquals(app.getButtonsHelper().getTextClickMeButton(),"You have done a dynamic click");
        System.out.println("After clicking on 'Click Me' button follow test appears: " + app.getButtonsHelper().getTextClickMeButton());
        app.getNavigationHelper().gotoHomePage();
        app.getUserJsonHelper().createAccount(registrationFormData);
    }
}
