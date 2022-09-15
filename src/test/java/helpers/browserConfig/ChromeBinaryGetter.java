package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class ChromeBinaryGetter extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> chrome_binary = Collections.singleton(PropertyReader.config.getProperty("chrome_binary", "src/test/resources/drivers/chromedriver.exe"));
        return String.valueOf("chrome_binary"); }
}
