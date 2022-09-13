package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.*;
import model.RegistrationFormData;
import objectRepository.BasePage_OR;
import objectRepository.CreateAccountPage_OR;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import tests.BaseTest;

import java.io.IOException;

public class CreateAccountPageSteps extends BaseTest {

    public CreateAccountPageLocators newAccountPage;
    public MyAccountPageLocators myAccountPage;

    public CreateAccountPageSteps() throws IOException {
        super();
        this.newAccountPage = new CreateAccountPageLocators();
        this.myAccountPage = new MyAccountPageLocators();
        PageFactory.initElements((ElementLocatorFactory) driver, this);
    }

    @Before
    public void setUp() throws RuntimeException {
        appManager.initApp();
    }

    @After
    public void tearDown() throws RuntimeException {
        appManager.stopApp();
    }

    @Given("Create an account page is displayed")
    public void searchFieldIsOnBasePage(@NotNull WebDriver driver) {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.findElement(By.xpath(BasePage_OR.SEARCH_FLD));
        Assert.assertTrue(newAccountPage.createAccountPageTitle.getText().equals("Create an account"));
    }

    @When ("I choose MailCheckBox")
    public void clickOnMailCheckBox() {
        newAccountPage.mailGenderCheckBox.click();
    }

    @And  ("I fill up the <firstName> and <lastname> fields")
    public void FillUpFirstNameAndLastNameFlds() {
        newAccountPage.firstNameFld.sendKeys(RegistrationFormData.getUserFirstName());
        newAccountPage.lastNameFld.sendKeys(RegistrationFormData.getUserLastName());
    }

    @And ("I click on the Birth data selector")
    public void birthDataSelect() {
        newAccountPage.birthDaySelector.click();
    }

    @And ("I click on 14 in opened dropdown menu")
    public void chooseDataFromDropDownMenu() {
        newAccountPage.birthDaySelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_14_BIRTHDAY_OPT)).click();
    }

    @And ("I click on the Birth month selector")
    public void birthMonthSelect() {
        newAccountPage.birthMonthSelector.click();
    }
    @And ("I click on May in opened dropdown menu")
    public void chooseMonthFromDropDownMenu() {
        newAccountPage.birthMonthSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_MONTH_MAY_OPT)).click();
    }

    @And ("I click on the Birth year selector")
    public void birthYearSelect() {
        newAccountPage.birthYearsSelector.click();
    }
    @And ("I click on 2004 in opened dropdown menu")
    public void chooseYearFromDropDownMenu() {
        newAccountPage.birthMonthSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_YEARS_2004_OPT)).click(); }

    @And ("I press return key")
    public void pressReturnKey() {
        newAccountPage.yourAddressFormCountrySelector.sendKeys(Keys.RETURN);
        }


    @And ("I fill up the <Email> and <password> fields with valid data")
    public void FillUpEmailAndPasswdFldsWithValidData(String userEmail, String passwd) {
        newAccountPage.emailFld.sendKeys(userEmail);
        newAccountPage.passwdFld.sendKeys(passwd);
    }

    @And ("I fill up the <Address> and <City> fields with valid data")
    public void FillUpAddressAndCityFldsWithValidData() {
        newAccountPage.emailFld.sendKeys(RegistrationFormData.getUserEmailAddress());
        newAccountPage.yourAddressFormCityFld.sendKeys(RegistrationFormData.getUserCity());
    }

    @And ("I click on the State selector")
    public void clickOnStateSelector() {
        newAccountPage.yourAddressFormStateSelector.click();
    }

    @And ("I press down arrow key several times before it Georgia has been chosen in opened dropdown menu")
    public void chooseGeorgiaFromDropDownMenu() {
        newAccountPage.yourAddressFormStateSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA)).click();
    }


    @And ("I fill up the <Zip/Postal Code>  with valid data")
    public void fillUpZipCodeWithValidData() {
        newAccountPage.yourAddressZipCodeFld.sendKeys(RegistrationFormData.getUserZipCode());
    }

    @And ("I click on the Country selector")
    public void clickOnCountrySelector() {
        newAccountPage.yourAddressFormCountrySelector.click();
    }

    @And ("I press down arrow key to get available option")
    public void pressDownArrowKey() {
        newAccountPage.yourAddressFormCountrySelector.sendKeys(Keys.DOWN);
    }

    @And ("I press return key to chose it")
    public void pressOnReturnKey() {
        newAccountPage.yourAddressFormCountrySelector.sendKeys(Keys.RETURN);
    }

    @And ("I fill up the <Mobile phone> and <future reference alias> fields with valid data")
    public void fillUpMobilePhoneAndAliasWithValidData() {
        newAccountPage.yourAddressFormMobilePhoneFld.sendKeys(RegistrationFormData.getUserMobilePhone());
    }

    @And ("I press on the Register button")
    public void pressOnRegisterBtn() {
        newAccountPage.yourAddressFormRegisterBtn.click();
    }

    @Then ("My account page opens with My account title and My account navigation tab next to the Home icon on it")
    public void isMyAccountTitleAndNavigationTabPresent() {
        Assert.assertNotNull(myAccountPage.pageTitle);
        Assert.assertNotNull(myAccountPage.homeIcnTab);
    }

    @And ("I see the User info button appears on the page header with the user <fullName> on it")
    public void isInfoBtnWithFullNamePresent() {
        Assert.assertNotNull(myAccountPage.accountNameTab);
        Assert.assertEquals(myAccountPage.accountNameTab, RegistrationFormData.getUserFirstName()+" "+RegistrationFormData.getUserLastName());

    }

    @And ("I see the <Sign out button name> appears on the page header between the <Contact us button name> and the User info button")
    public void isSignOutBtnPresent() {
        Assert.assertNotNull(myAccountPage.signOutTab);
    }

}
