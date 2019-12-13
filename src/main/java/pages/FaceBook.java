package pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class FaceBook extends PageBase {
    private static By Firstname = By.xpath("//*[@id=\"u_0_m\"]");
    private static By Lastname = By.xpath("//*[@name=\"lastname\"]");
   // private static By Regemail = By.xpath("//*[@name=\"reg_email__\"]");

    public static void setFirstname(String mshan) {
        getDriver().findElement(Firstname).sendKeys(mshan);

    }
    public static void setLastname(String nahs) {
        getDriver().findElement(Lastname).sendKeys(nahs);
    }
    public static void waitFistname() {
        implicitWait(Firstname, 10);
    }

}
