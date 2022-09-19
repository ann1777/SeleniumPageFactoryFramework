package helpers.browserConfig;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class PropertyReader implements ConfigReader{
    String browserConfig = "";
    InputStream inputStream;
    
    PropertyReader reader = new PropertyReader();

    public static String getPropValues(String baseUrl) {
        return baseUrl;
    }

    public String getPropValues() throws IOException {

        Properties prop;
        String driverConfig = "driver-config.properties";
        try {
            prop = new Properties();
            inputStream = getClass().getClassLoader().getResourceAsStream(driverConfig);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + driverConfig + "' not found in the classpath");
            }
            Date time = new Date(System.currentTimeMillis());
            String browserType = prop.getProperty("browserType");
            String baseUrl = prop.getProperty("baseUrl");
            String userNamePref = prop.getProperty("userNamePref");
            String userEmailSuf = prop.getProperty("userEmailSuf");
            String chromeExe = prop.getProperty("chromeExe");
            String implicitWait = prop.getProperty("implicitWait");
            String explicitWait = prop.getProperty("explicitWait");
            String loadTimeOut = prop.getProperty("loadTimeOut");

            browserConfig = "BrowserType = " + browserType + ", BaseURL = " + baseUrl + ", UsernamePref = " + userNamePref + ",\nuserEmailSuf = " + userEmailSuf + ", chromeBinry = " + chromeExe + ", implicitWait = " + implicitWait + ", explicitWait = " + explicitWait + ", loadTimeOut = " + loadTimeOut;
            System.out.println(browserConfig + "\nProgram run on " + time);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return browserConfig;
    }

    public List<String> reader() {
        return new ArrayList<>();
    }

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        return Collections.singletonList(browserConfig);
    }
}
