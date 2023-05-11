package Tests;

import Utility.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUsage {

    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Verify title contains OrangeHRM.
    Use Driver Class.
     */

    @Test
    public void veriyTitle() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title, "OrangeHRM","Test failed Title is not OrangeHRM");


        Driver.closeDriver();
    }
}
