package helpers;

import model.RegistrationFormData;
import org.openqa.selenium.WebDriver;


public class SessionHelper extends NavigationHelper{
    private static WebDriver driver;
    public NavigationHelper navigationHelper;
    public RegistrationFormData registrationFormData;
    AppManager app = new AppManager();

    SessionHelper(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void login() {
        navigationHelper.goToSignInPage();
        app.getUserJsonHelper().createAccount(registrationFormData);
    }

    public static SessionHelper getCurrentSession() {
        if (getCurrentSession().app.driver == null) return null;
        return (SessionHelper) driver;
    }


    public static void put(String key, Object value) {
        if (key != null) {
            getCurrentSession().put(key, value);
        }
    }


    public static Object get(String key) {
        if (key == null) return null;
        return getCurrentSession().get(key);
    }


    public static Object remove(String key) {
        if (key == null) return null;
        return getCurrentSession().remove(key);
    }


    public static String getCurrentUserName(RegistrationFormData registerFormData) {
        return getCurrentSession().registrationFormData.getUserFirstName();
    }
}
