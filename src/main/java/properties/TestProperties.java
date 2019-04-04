package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*taking individual for each test parameterSet to bring it to driver*/

public class TestProperties {
    Properties currentProps = new Properties();

    Properties getCurrentProps(String propName) throws IOException {
        FileInputStream in = new FileInputStream("src\\main\\resources\\"+propName);
        currentProps.load(in);
        in.close();
        return currentProps;
    }
    protected String getProp(String propName, String propKey) throws IOException {
        if(!currentProps.containsKey(propKey)) currentProps = getCurrentProps(propName);
        // "default" form used to handle the absence of parameter
        return currentProps.getProperty(propKey, null);
    }
}

