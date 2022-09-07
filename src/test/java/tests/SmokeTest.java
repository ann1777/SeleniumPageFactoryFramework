package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SmokeTest extends BaseTest {
    public SmokeTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void testElementsButtonsItem() {
        app.getNavigationHelper().gotoMainPage();
        app.getButtonsHelper().gotoButtonsItemElementsMenu();
        app.getButtonsHelper().clickToClickMeButton();
        Assert.assertEquals(app.getButtonsHelper().getTextClickMeButton(),"You have done a dynamic click");
        System.out.println("After clicking on 'Click Me' button follow test appears: " + app.getButtonsHelper().getTextClickMeButton());
        app.getNavigationHelper().gotoMainPage();
    }

    @Test
    public void testElementsWebTablesItem() {
        app.getNavigationHelper().gotoMainPage();
        app.getWebTableHelper().gotoWebTablesItemElementsMenu();
        int recordNumBefore = app.getWebTableHelper().recordCounter();
        app.getWebTableHelper().addNewRecord();
        app.getWebTableHelper().fillRegistrationForm(app.getWebTableHelper().registrationFormData);
        app.getWebTableHelper().submitRegistrationForm();
        int recordNumAfter = app.getWebTableHelper().recordCounter();
        Assert.assertEquals(recordNumAfter, recordNumBefore + 1);
        String firstName = app.getWebTableHelper().findRecord(app.getWebTableHelper().registrationFormData);
        Assert.assertEquals(firstName, app.getWebTableHelper().registrationFormData.getUserFirstName());
        app.getWebTableHelper().editRecord();
        firstName = app.getWebTableHelper().findRecord(app.getWebTableHelper().changedRegistrationFormData);
        Assert.assertEquals(firstName, app.getWebTableHelper().changedRegistrationFormData.getUserFirstName());
        app.getNavigationHelper().gotoMainPage();
    }

}
