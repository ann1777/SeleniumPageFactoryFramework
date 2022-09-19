package helpers.browserConfig;

import java.util.Collections;
import java.util.List;

public class IDGetter extends PropertyReader {


    @Override
    public List<String> reader(List<String> value) throws NoSuchFieldException {
       String id = PropertyReader.getPropValues("id");
        return Collections.singletonList(id); }

    @Override
    public List<String> reader() {
        return null;
    }
}

