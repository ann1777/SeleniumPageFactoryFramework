package model;

public class RegistrationFormData {
    private static String userFirstName;
    private static String userLastName;
    private static String userEmailAddress;
    private static String userPassword;
    private static String userBirthDay;
    private static String userBirthMonth;
    private static String userBirthYears;
    private static boolean isSignUpForNewsLetter;
    private static boolean isReceiveSpecialOffers;
    private String userCompany;
    private String userMainAddress;
    private String userAddress2;
    private String userCity;
    private String userState;
    private String userZipCode;
    private String userCountry;
    private String userAdditionalData;
    private String userHomePhone;
    private String userMobilePhone;
    private String userAdd;

    public RegistrationFormData(String firstName, String lastName, String emailAddress, String password, String birthDay, String birthMonth, String birthYears, boolean isSignUpForNewsLetter, boolean isReceiveSpecialOffers, String company, String address1, String address2) {
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
        this.userMainAddress = address1;
        this.userAddress2 = address2;
        this.userCity = city;
        this.userState = state;
        this.userZipCode = zipCode;
        this.userCountry = country;
        this.userAdditionalData = addInform;
        this.userHomePhone = homePhone;
        this.userMobilePhone = mobilePhone;
    }

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

    public String getUserBirthDay() {
        return userBirthDay;
    }
    public String getUserBirthMonth() { return userBirthMonth; }
    public String getUserBirthYears() { return userBirthYears; }
    public boolean isSignUpForNewsLetter() { return isSignUpForNewsLetter; }
    public boolean isReceiveSpecialOffers() { return isReceiveSpecialOffers; }

    public String getUserCompany() { return userCompany; }

    public String getUserDepartment() { return userDepartment; }
}