package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class LoadTimeoutGetter extends PropertyReader {

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String load_timeout_sec = PropertyReader.getPropValues("load_timeout_sec");
        return Collections.singletonList(load_timeout_sec); }

    @Override
    public List<String> reader() {
        return null;
    }
}
