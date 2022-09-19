package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class ExplicitWaitReader extends PropertyReader {

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String explicit_wait = PropertyReader.getPropValues("explicit_wait");
        return Collections.singletonList(explicit_wait); }

    @Override
    public List<String> reader() {
        return null;
    }
}
