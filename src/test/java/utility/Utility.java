package utility;

import static utility.PropertyUtil.getConfiguration;
import static utility.Constants.ENVIRONMENT_CODE;
import static utility.Constants.INKAFARMA_CONSTANT;

public class Utility {

    PropertyUtil propertyUtil;

//com.globant.inkafarma.
// qa
// :id/
// et_request_name
    public String getLocatorByElementName(String elementName) {
        String code = getConfiguration(ENVIRONMENT_CODE);
        String locator = new StringBuilder()
                .append(INKAFARMA_CONSTANT)
                .append(code)
                .append(":id/")
                .append(elementName)
                .toString();

        System.out.println("***************************   :: " + locator);
        return locator;
    }
}
// actualiza