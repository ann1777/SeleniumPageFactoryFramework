package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class ChromeBinaryGetter extends PropertyReader {

    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
        String chrome_binary = PropertyReader.getPropValues("chrome_binary");
        return Collections.singletonList(chrome_binary); }

    @Override
    public List<String> reader() {
        return null;
    }
}
