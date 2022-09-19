package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class BrowserTypeReader extends PropertyReader {

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String browser_type = PropertyReader.getPropValues("browser_type");
        return Collections.singletonList(browser_type); }

    @Override
    public List<String> reader() {
        return null;
    }
}
