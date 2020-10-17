package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.BaseClassPackage.DriverFactory;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup(){
        driverFactory.openbrowser();
    }

    @After
    public void teardown(){
        driverFactory.closebrowser();
    }


}
