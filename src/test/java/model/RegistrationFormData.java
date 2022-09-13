package model;

public class RegistrationFormData {
    private  static boolean isMail;
    private static String userFirstName;
    private static String userLastName;
    private static String userEmailAddress;
    private static String userPassword;
    private static String userBirthDay;
    private static String userBirthMonth;
    private static String userBirthYears;
    private static boolean isSignUpForNewsLetter;
    private static boolean isReceiveSpecialOffers;
    private static String userCompany;
    private static String userDepartment;
    private static String userMainAddress;
    private static String userAddress2;
    private static String userCity;
    private static String userState;
    private static String userZipCode;
    private static String userCountry;
    private static String userAdditionalData;
    private static String userHomePhone;
    private static String userMobilePhone;
    private static String userAlias;

    public RegistrationFormData(boolean isMail, String firstName, String lastName, String emailAddress, String password, String birthDay, String birthMonth, String birthYears, boolean isSignUpForNewsLetter, boolean isReceiveSpecialOffers, String company, String department, String address1, String address2, String city, String state, String zipCode, String country, String addInform, String homePhone, String mobilePhone, String userAlias) {
        this.isMail = isMail;
        this.userFirstName = firstName;
        this.userLastName = lastName;
        this.userEmailAddress = emailAddress;
        this.userPassword = password;
        this.userBirthDay = birthDay;
        this.userBirthMonth = birthMonth;
        this.userBirthYears = birthYears;
        this.isSignUpForNewsLetter = isSignUpForNewsLetter;
        this.isReceiveSpecialOffers = isReceiveSpecialOffers;
        this.userCompany = company;
        this.userDepartment = department;
        this.userMainAddress = address1;
        this.userAddress2 = address2;
        this.userCity = city;
        this.userState = state;
        this.userZipCode = zipCode;
        this.userCountry = country;
        this.userAdditionalData = addInform;
        this.userHomePhone = homePhone;
        this.userMobilePhone = mobilePhone;
        this.userAlias = userAlias;
    }

    public static boolean getIsMail() { return isMail; }
    public static String getUserFirstName() {
        return userFirstName;
    }
    public static String getUserLastName() {
        return userLastName;
    }
    public static String getUserEmailAddress() {
        return userEmailAddress;
    }
    public static String getUserPassword() { return userPassword; }
    public static boolean isSignUpForNewsLetter() { return isSignUpForNewsLetter; }
    public static boolean isReceiveSpecialOffers() { return isReceiveSpecialOffers; }
    public static String getUserCompany() { return userCompany; }
    public static String getUserMainAddress() { return userMainAddress; }
    public static String getUserAddress2() { return userAddress2; }
    public static String getUserCity() { return userCity; }
    public static String getUserZipCode() { return userZipCode; }
    public static String getUserCountry() { return userCountry; }
    public static String getUserAdditionalData() { return userAdditionalData; }
    public static String getUserHomePhone() { return userHomePhone; }
    public static String getUserMobilePhone() { return userMobilePhone; }
    public static String getUserAlias() { return userAlias; }

}