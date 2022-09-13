package tests;

import helpers.UserJsonDataHelper;
import locators.BasePageLocators;
import locators.CreateAccountPageLocators;
import locators.MyAccountPageLocators;
import locators.SignInPageLocators;
import model.RegistrationFormData;
import objectRepository.CreateAccountPage_OR;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.testng.Assert;
import org.testng.internal.objects.InstanceCreator;

import java.io.IOException;
import java.util.Random;


public class CreateAccountPageTest extends BaseTest {
    public static WebDriver driver;
    public BasePageLocators base;
    public CreateAccountPageLocators registration;
    public MyAccountPageLocators myaccount;
    public SignInPageLocators signout;
    public CreateAccountPageLocators newaccount;
    public UserJsonDataHelper userdata;

    public String invalidUserData = "///////////////";
    public String invalidUserEmail = "//////@g.l";
    public String navigationPipeName = "My account";
    public String navigationTabName = "My account";
    public String signOutTabClassName = "logout";
    public String contactUsTabName = "Contact us";
    public String signOutTabName = "Sign out";
    public String yourAddressFormDangerAlertMsg = "There are 2 errors";
    public String yourAddressFormAlreadyRegisteredAlertMsg = "An account using this email address has already been registered.";

        public CreateAccountPageTest() throws IOException {
        super();
        this.base = new BasePageLocators();
        this.registration = new CreateAccountPageLocators();
        this.myaccount = new MyAccountPageLocators();
        PageFactory.initElements((ElementLocatorFactory) driver, this);
        InstanceCreator.newInstance(String.valueOf(new CreateAccountPageLocators()), driver);
    }

    @Test
    public void fillYourPersonalInformationWithValidData() {
        registration.wait.waitForElement(registration.femailGenderCheckBox);
        registration.femailGenderCheckBox.click();
        registration.firstNameFld.sendKeys(RegistrationFormData.getUserFirstName());
        registration.lastNameFld.sendKeys(RegistrationFormData.getUserLastName());
        registration.emailFld.sendKeys(RegistrationFormData.getUserEmailAddress());
        registration.passwdFld.sendKeys(RegistrationFormData.getUserPassword());
        registration.birthDaySelector.click();
        Random rnd = new Random();
        int n = Math.round(rnd.nextInt());
        while (n > 31) n -= 31;
        int count = 0;
        while (count < n) {
            registration.birthDaySelector.sendKeys(Keys.DOWN);
            count = count++;
        }
        registration.birthDaySelector.sendKeys(Keys.RETURN);
        registration.birthMonthSelector.click();
        Random rnd1 = new Random();
        int n1 = Math.round(rnd1.nextInt());
        while (n1 > 12) n1 -= 12;
        int count1 = 0;
        while (count1 < n1) {
            registration.birthMonthSelector.sendKeys(Keys.DOWN);
            count1 = count++;
        }
        registration.birthMonthSelector.sendKeys(Keys.RETURN);
        registration.birthYearsSelector.click();
        Random rnd2 = new Random();
        int n2 = Math.round(rnd2.nextInt());
        while (n2 > 80) n2 -= 80;
        int count2 = 0;
        while (count2 < rnd2.nextInt()) {
            registration.birthYearsSelector.sendKeys(Keys.DOWN);
            count2 = count++;
        }
        registration.birthYearsSelector.sendKeys(Keys.RETURN);
        registration.signUpForNewsLetterCheckBox.click();
        registration.signUpForNewsLetterCheckBox.isSelected();
        registration.signUpForNewsLetterLabel.click();
        registration.signUpForNewsLetterLabel.isSelected();
        registration.yourAddressFormFirstNameFld.sendKeys(RegistrationFormData.getUserFirstName());
        registration.yourAddressFormLastNameFld.sendKeys(RegistrationFormData.getUserLastName());
        registration.yourAddressFormCompanyFld.sendKeys(RegistrationFormData.getUserCompany());
        registration.yourAddressFormAddressFld.sendKeys(RegistrationFormData.getUserMainAddress());
        registration.yourAddressFormAddress2Fld.sendKeys(RegistrationFormData.getUserAddress2());
        registration.yourAddressFormCityFld.sendKeys(RegistrationFormData.getUserCity());
        registration.yourAddressFormStateSelector.click();
        registration.stateGeorgia.click();
        registration.yourAddressZipCodeFld.click();
        registration.yourAddressZipCodeFld.sendKeys(Keys.DOWN);
        registration.yourAddressZipCodeFld.sendKeys(Keys.DOWN);
        registration.yourAddressZipCodeFld.sendKeys(Keys.RETURN);
        registration.yourAddressFormCountrySelector.click();
        registration.yourAddressFormCountrySelector.sendKeys(Keys.DOWN);
        registration.yourAddressFormCountrySelector.sendKeys(Keys.RETURN);
        registration.yourAddressFormAdditionalIntoFld.sendKeys(RegistrationFormData.getUserHomePhone());
        registration.yourAddressFormMobilePhoneFld.sendKeys(RegistrationFormData.getUserMobilePhone());
        registration.yourAddressFormFutureReferenceFld.clear();
        registration.yourAddressFormFutureReferenceFld.sendKeys(RegistrationFormData.getUserMainAddress());
        registration.yourAddressFormRegisterBtn.click();
        myaccount.navigationPipe.getText().equals(navigationPipeName);
        myaccount.accountNameTab.getText().equals(RegistrationFormData.getUserFirstName() + RegistrationFormData.getUserLastName());
        myaccount.signOutTab.findElement(By.className(signOutTabClassName)).getText().equals(signOutTabName);
        myaccount.contactUsTab.getText().equals(contactUsTabName);
    }

    @Test
    public void SignUPForNewLetter(boolean isSignUp) {
        registration.wait.waitForElement(registration.mailGenderCheckBox);
        if (RegistrationFormData.getIsMail()) {
            registration.mailGenderCheckBox.click();
        }
        registration.femailGenderCheckBox.click();
    }

    @Test
    public void fillYourPersonalInformationWithEmptyEmailFldAndEmptyCityFld() {
        registration.wait.waitForElement(registration.mailGenderCheckBox);
        registration.mailGenderCheckBox.click();
        registration.firstNameFld.sendKeys(RegistrationFormData.getUserFirstName());
        registration.lastNameFld.sendKeys(RegistrationFormData.getUserLastName());
        registration.passwdFld.sendKeys(RegistrationFormData.getUserPassword());
        registration.signUpForNewsLetterCheckBox.click();
        Assert.assertTrue(registration.signUpForNewsLetterCheckBox.isSelected());
        Assert.assertFalse(registration.receiveSpecialOffersCheckBox.isSelected());
        registration.receiveSpecialOffersCheckBox.click();
        Assert.assertTrue(registration.receiveSpecialOffersCheckBox.isSelected());
        Assert.assertTrue(registration.yourAddressFormFirstNameFld.getText().equals(RegistrationFormData.getUserFirstName()));
        Assert.assertTrue(registration.yourAddressFormLastNameFld.getText().equals(RegistrationFormData.getUserLastName()));
        registration.yourAddressFormCompanyFld.sendKeys(RegistrationFormData.getUserCompany());
        registration.yourAddressFormAddressFld.sendKeys(RegistrationFormData.getUserMainAddress());
        registration.yourAddressFormAddress2Fld.sendKeys(RegistrationFormData.getUserAddress2());
        registration.yourAddressFormStateSelector.click();
        registration.stateGeorgia.click();
        registration.yourAddressZipCodeFld.sendKeys(RegistrationFormData.getUserZipCode());
        registration.yourAddressFormCountrySelector.click();
        registration.yourAddressFormCountrySelector.sendKeys(Keys.DOWN);
        registration.yourAddressFormCountrySelector.sendKeys(Keys.RETURN);
        registration.yourAddressFormAdditionalIntoFld.sendKeys(RegistrationFormData.getUserHomePhone());
        registration.yourAddressFormHomePhoneFld.sendKeys(RegistrationFormData.getUserHomePhone());
        registration.yourAddressFormMobilePhoneFld.sendKeys(RegistrationFormData.getUserMobilePhone());
        registration.yourAddressFormFutureReferenceFld.clear();
        registration.yourAddressFormFutureReferenceFld.sendKeys(RegistrationFormData.getUserMainAddress());
        registration.yourAddressFormRegisterBtn.click();
        Assert.assertTrue(registration.yourAddressFormDangerAlert.getText().equals(yourAddressFormDangerAlertMsg));
    }

    @Test
    public void fillYourPersonalInformationWithInvalidData() {
        registration.wait.waitForElement(registration.mailGenderCheckBox);
        registration.mailGenderCheckBox.click();
        registration.firstNameFld.sendKeys(invalidUserData);
        registration.lastNameFld.sendKeys(invalidUserData);
        registration.emailFld.sendKeys(invalidUserEmail);
        registration.passwdFld.sendKeys(invalidUserData);
        registration.yourAddressFormCompanyFld.sendKeys(invalidUserData);
        registration.yourAddressFormAddressFld.sendKeys(invalidUserData);
        registration.yourAddressFormCityFld.sendKeys(invalidUserData);
        registration.yourAddressZipCodeFld.sendKeys(invalidUserData);
        registration.yourAddressFormCountrySelector.click();
        registration.yourAddressFormCountrySelector.sendKeys(Keys.UP);
        registration.yourAddressFormCountrySelector.sendKeys(Keys.RETURN);
        registration.yourAddressFormAdditionalIntoFld.sendKeys(invalidUserData);
        registration.yourAddressFormHomePhoneFld.sendKeys(invalidUserData);
        registration.yourAddressFormMobilePhoneFld.sendKeys(invalidUserData);
        registration.yourAddressFormFutureReferenceFld.sendKeys(invalidUserData);
        registration.yourAddressFormRegisterBtn.click();
        Assert.assertTrue(registration.yourAddressFormDangerAlert.getText().endsWith("errors"));
    }

    @Test
    public void createAccount(RegistrationFormData registerFormData) {
        signout.wait.waitForElement(signout.createAccountEmailField);
        signout.createAccountEmailField.sendKeys(registerFormData.getUserEmailAddress());
        signout.createAccountSubmitBtn.click();
        newaccount.mailGenderCheckBox.click();
        newaccount.firstNameFld.sendKeys(registerFormData.getUserFirstName());
        newaccount.lastNameFld.sendKeys(registerFormData.getUserLastName());
        newaccount.emailFld.sendKeys(registerFormData.getUserEmailAddress());
        newaccount.passwdFld.sendKeys(registerFormData.getUserPassword());
        newaccount.birthDaySelector.click();
        newaccount.birthDaySelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_14_BIRTHDAY_OPT)).click();
        newaccount.birthMonthSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_MONTH_MAY_OPT)).click();
        newaccount.birthYearsSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_YEARS_2004_OPT)).click();;
        if(registerFormData.isSignUpForNewsLetter()) newaccount.signUpForNewsLetterCheckBox.click();
        if(registerFormData.isReceiveSpecialOffers()) newaccount.receiveSpecialOffersCheckBox.click();
        newaccount.yourAddressFormCompanyFld.sendKeys(registerFormData.getUserCompany());
        newaccount.yourAddressFormAddressFld.sendKeys(registerFormData.getUserMainAddress());
        newaccount.yourAddressFormAddress2Fld.sendKeys(registerFormData.getUserAddress2());
        newaccount.yourAddressFormCityFld.sendKeys(registerFormData.getUserCity());
        newaccount.yourAddressFormStateSelector.click();
        newaccount.yourAddressFormStateSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA)).click();
        newaccount.yourAddressZipCodeFld.sendKeys(registerFormData.getUserZipCode());
        newaccount.yourAddressFormCountrySelector.click();
        newaccount.yourAddressFormCountrySelector.sendKeys(registerFormData.getUserCountry());
        newaccount.yourAddressFormAdditionalIntoFld.sendKeys(registerFormData.getUserAdditionalData());
        newaccount.yourAddressFormHomePhoneFld.sendKeys(registerFormData.getUserHomePhone());
        newaccount.yourAddressFormMobilePhoneFld.sendKeys(registerFormData.getUserMobilePhone());
        newaccount.yourAddressFormFutureReferenceFld.sendKeys(registerFormData.getUserAlias());
        newaccount.yourAddressFormRegisterBtn.click();
        if(isMyAccountPage()) myaccount.pageTitle.getText().equals(userdata.myAccountPageTitle);
    }

    public boolean isMyAccountPage() {
        newaccount.wait.waitForElement(newaccount.navigationTab);
        if((newaccount.navigationTab.getText()) == navigationTabName) {
            newaccount.wait.waitForElement(newaccount.navigationTab);
            return true;
        }
        return false;
    }

    public void createAlreadyUsedEmailAccount(RegistrationFormData registerFormData) {
        createAccount(registerFormData);
        createAccount(registerFormData);
        Assert.assertTrue(newaccount.yourAddressFormAlreadyRegisteredAlert.getText().equals(yourAddressFormAlreadyRegisteredAlertMsg));
   }
}

