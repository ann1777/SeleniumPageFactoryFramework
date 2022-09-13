package helpers;

import locators.CreateAccountPageLocators;
import locators.MyAccountPageLocators;
import locators.SignInPageLocators;
import model.RegistrationFormData;
import objectRepository.CreateAccountPage_OR;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class UserJsonDataHelper extends HelperBase {
    public SignInPageLocators signInPage;
    public CreateAccountPageLocators newAccountPage;
    public MyAccountPageLocators myAccountPage;
    public String myAccountPageTitle = "My account";
    public String myAccountPageHomeIcnTitle = "My account";
    public RegistrationFormData registrationFormData = new RegistrationFormData(true,"John","Snow","user"+randomAlphanumeric(5)+"@test.com","r56$UM25","10","june","1978",true,false,"CocaCola","accountant","Right way str., 15", "Victory str., 345", "Kiyv", "Podol", "785623", "Ukraine", "jonn", "74185296", "+38954123", "Jon");
    public RegistrationFormData changedRegistrationFormData = new RegistrationFormData(true, "NewJohn", "NewSnow",
            "newuser"+randomAlphanumeric(5)+"@test.com", "50_%mYaq", "5", "may", "2002", true, false, "Twitter", "adv", "Victory str, 22", "New History str., 17", "Kharkiv", "NewUkraine", "785612", "Ukraine", "jony", "452389", "+3874562319", "newJon");

    public UserJsonDataHelper() {
        super();
    }

    public boolean isMyAccountPage() {
        if((myAccountPage.homeIcnTab.getText()) == myAccountPageHomeIcnTitle) {
            return true;
        }
        return false;
    }

    public void createAccount(@NotNull RegistrationFormData registerFormData) {
        signInPage.createAccountEmailField.sendKeys(registerFormData.getUserEmailAddress());
        signInPage.createAccountSubmitBtn.click();
        newAccountPage.mailGenderCheckBox.click();
        newAccountPage.firstNameFld.sendKeys(registerFormData.getUserFirstName());
        newAccountPage.lastNameFld.sendKeys(registerFormData.getUserLastName());
        newAccountPage.emailFld.sendKeys(registerFormData.getUserEmailAddress());
        newAccountPage.passwdFld.sendKeys(registerFormData.getUserPassword());
        newAccountPage.birthDaySelector.click();
        newAccountPage.birthDaySelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_14_BIRTHDAY_OPT)).click();
        newAccountPage.birthMonthSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_MONTH_MAY_OPT)).click();
        newAccountPage.birthYearsSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_BIRTHDAY_YEARS_2004_OPT)).click();;
        if(registerFormData.isSignUpForNewsLetter()) newAccountPage.signUpForNewsLetterCheckBox.click();
        if(registerFormData.isReceiveSpecialOffers()) newAccountPage.receiveSpecialOffersCheckBox.click();
        newAccountPage.yourAddressFormCompanyFld.sendKeys(registerFormData.getUserCompany());
        newAccountPage.yourAddressFormAddressFld.sendKeys(registerFormData.getUserMainAddress());
        newAccountPage.yourAddressFormAddress2Fld.sendKeys(registerFormData.getUserAddress2());
        newAccountPage.yourAddressFormCityFld.sendKeys(registerFormData.getUserCity());
        newAccountPage.yourAddressFormStateSelector.click();
        newAccountPage.yourAddressFormStateSelector.findElement(By.xpath(CreateAccountPage_OR.CREATEACCOUNTPAGE_YOURADDRESS_FORM_STATE_SELECTOR_GEORGIA)).click();
        newAccountPage.yourAddressZipCodeFld.sendKeys(registerFormData.getUserZipCode());
        newAccountPage.yourAddressFormCountrySelector.click();
        newAccountPage.yourAddressFormCountrySelector.sendKeys(registerFormData.getUserCountry());
        newAccountPage.yourAddressFormAdditionalIntoFld.sendKeys(registerFormData.getUserAdditionalData());
        newAccountPage.yourAddressFormHomePhoneFld.sendKeys(registerFormData.getUserHomePhone());
        newAccountPage.yourAddressFormMobilePhoneFld.sendKeys(registerFormData.getUserMobilePhone());
        newAccountPage.yourAddressFormFutureReferenceFld.sendKeys(registerFormData.getUserAlias());
        newAccountPage.yourAddressFormRegisterBtn.click();
        if(isMyAccountPage()) myAccountPage.pageTitle.getText().equals(myAccountPageTitle);
    }

    public void createAlreadyUsedEmailAccount(RegistrationFormData registerFormData) {
        createAccount(registerFormData);
        createAccount(registerFormData);
        Assert.assertTrue(newAccountPage.yourAddressFormAlreadyRegisteredAlert.getText().equals("An account using this email address has already been registered."));
   }
}