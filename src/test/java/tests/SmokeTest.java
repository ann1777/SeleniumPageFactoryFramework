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
        app.getButtonsHelper().clickToWomenBtn();
        Assert.assertTrue(app.getUserJsonHelper().isWomenPage());
        app.getButtonsHelper().clickHomeIcn();
        Assert.assertTrue(app.getUserJsonHelper().isHomePage());
        app.getNavigationHelper().goToSignInPage();
        app.getUserJsonHelper().createAccount(registrationFormData);
        app.getUserJsonHelper().createAlreadyUsedEmailAccount(registrationFormData);
        app.getNavigationHelper().goToShoppingCartPage();
        app.getUserJsonHelper().isShoppingCartPage();
        app.getSessionHelper().login();
        Assert.assertNotNull(app.getSessionHelper().getCurrentUserName());
    }
}
