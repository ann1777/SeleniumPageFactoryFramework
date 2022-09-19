package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class ImplicitWaitReader extends PropertyReader {

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String implicit_wait = PropertyReader.getPropValues("implicit_wait");
        return Collections.singletonList(implicit_wait); }

    @Override
    public List<String> reader() {
        return null;
    }
}
