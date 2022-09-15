package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class ImplicitWaitReader extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> implicit_wait = Collections.singleton(PropertyReader.config.getProperty("implicit_wait", "500"));
        return String.valueOf("implicit_wait"); }
}
