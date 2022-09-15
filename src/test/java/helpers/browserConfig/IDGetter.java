package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class IDGetter extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> id = Collections.singleton(PropertyReader.config.getProperty("id", "qa"));
        return String.valueOf("id"); }
}
