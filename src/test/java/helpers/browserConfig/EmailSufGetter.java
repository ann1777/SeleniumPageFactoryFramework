package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class EmailSufGetter extends PropertyReader {

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String email_suf = PropertyReader.getPropValues("email_suf");
        return Collections.singletonList(email_suf); }

    @Override
    public List<String> reader() {
        return null;
    }
}