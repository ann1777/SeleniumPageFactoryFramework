package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class UsernamePrefGetter extends PropertyReader {

    public UsernamePrefGetter() {
    }

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String user_name_pref = PropertyReader.getPropValues("user_name_pref");
        return Collections.singletonList(user_name_pref); }

    @Override
    public List<String> reader() {
        return null;
    }
}
