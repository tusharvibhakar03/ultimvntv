package com.ultimate.course.testbase;

import com.ultimate.course.propertyreader.PropertyReader;
import com.ultimate.course.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser= PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }


}
