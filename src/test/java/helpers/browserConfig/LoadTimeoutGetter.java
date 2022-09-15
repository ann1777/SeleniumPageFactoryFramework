package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class LoadTimeoutGetter extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> load_timeout_sec = Collections.singleton(PropertyReader.config.getProperty("load_timeout_sec", "50"));
        return String.valueOf("load_timeout_sec"); }
}
