package helpers.browserConfig;

import java.util.Collection;
import java.util.Collections;

public class UsernamePrefGetter extends PropertyReader {

    @Override
    public Object reader() {
        Collection<Object> user_name_pref = Collections.singleton(PropertyReader.config.getProperty("user_name_pref", "user"));
        return String.valueOf("user_name_pref"); }
}
