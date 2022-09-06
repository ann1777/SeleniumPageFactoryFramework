package helpers;
import model.RegistrationFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTableHelper extends HelperBase {
//    public RegistrationFormData registrationFormData = new RegistrationFormData("John", "Snow",
//            "foo@test.com", "25", "1000", "Accountant");
//    public RegistrationFormData changedRegistrationFormData = new RegistrationFormData("NewJohn", "NewSnow",
//            "newfoo@test.com", "50", "500", "Sales");

    public WebTableHelper(WebDriver driver) {
        super(driver);
    }

    public void editRecord() {
        click(By.xpath("//div [@class='action-buttons']//span[@title='Edit']"));
        RegistrationFormData changedRegistrationFormData;
        submitRegistrationForm();
    }

    public String findRecord(RegistrationFormData registerFormData) {
        type(By.xpath("//input[@id='searchBox']"), registerFormData.getUserFirstName());
        return driver.findElement(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group'][1]//div[@role='gridcell'][1]")).getText().trim();
    }

    public int recordCounter() {
        String firstName;
        List<String> listFirstName = new ArrayList<String>();
        int xpathCount = driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']")).size();
        for (int i = 1; i <= xpathCount; i++) {
            firstName = driver.findElement(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group'][" + i + "]//div[@role='gridcell'][1]")).getText().trim();
            if (!firstName.isEmpty()) {
                listFirstName.add(firstName);
            } else {
                i = xpathCount;
            }
        }
        return listFirstName.size();
    }

    public void submitRegistrationForm() {
        click(By.id("submit"));
    }

    public void fillRegistrationForm(RegistrationFormData registerFormData) {
        type(By.xpath("//input[@id='firstName']"), registerFormData.getUserFirstName());
        type(By.xpath("//input[@id='lastName']"), registerFormData.getUserLastName());
        type(By.xpath("//input[@id='userEmail']"), registerFormData.getUserEmailAddress());
        type(By.xpath("//input[@id='department']"), registerFormData.getUserDepartment());
    }

    public void addNewRecord() {
        click(By.xpath("//div [@class='web-tables-wrapper']//button [text()='Add']"));
    }

    public void gotoWebTablesItemElementsMenu() {
        click(By.xpath("//ul[@class='menu-list']//span [text()='Web Tables']"));
    }
}