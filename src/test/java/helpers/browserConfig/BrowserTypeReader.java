package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class BrowserTypeReader extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> explicit_wait = Collections.singleton(PropertyReader.config.getProperty("browser_type", "Chrome"));
        return String.valueOf("browser_type"); }
}
