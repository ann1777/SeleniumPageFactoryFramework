package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class EmailSufGetter extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> email_suf = Collections.singleton(PropertyReader.config.getProperty("email_suf", "@gmail.com"));
        return String.valueOf("email_suf"); }
}