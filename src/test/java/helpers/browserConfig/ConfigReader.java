package helpers.browserConfig;

import java.util.List;

public interface ConfigReader {
   List<String> reader();

   List<String> reader (List<String> value) throws NoSuchFieldException;
}