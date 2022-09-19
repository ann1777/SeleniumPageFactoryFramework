package helpers.browserConfig;
import org.testng.annotations.DataProvider;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigProviders {
    @DataProvider(name = "config test data")
    public static Object[][] getConfigData() throws IOException {
        FileReader reader=new FileReader("driver-config.properties");

        Properties conf=new Properties();
        conf.load(reader);
        return new Object[][]{
        };
    }
}
