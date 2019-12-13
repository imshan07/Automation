package tests;

import org.testng.annotations.Test;
import pages.FaceBook;
import pages.LoginPage;
import utils.TestBase;

public class FbTest extends TestBase {
    @Test(priority=1, enabled=true)
    public void fbtesting(){
        FaceBook.setFirstname("mshan");
        FaceBook.setLastname("nahs");



    }
}
