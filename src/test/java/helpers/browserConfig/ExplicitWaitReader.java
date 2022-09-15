package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class ExplicitWaitReader extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> explicit_wait = Collections.singleton(PropertyReader.config.getProperty("explicit_wait", "visibilityOfElementLocated"));
        return String.valueOf("explicit_wait"); }
}
