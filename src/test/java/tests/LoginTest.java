package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("aston79.vt-cbqy@force.com", "AstonSF79")
                .isPageOpen();

        assertTrue(isHomePageOpened, "The HomePage isn`t open");
    }
}
