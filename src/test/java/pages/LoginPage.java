package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public static final By USER_NAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }

    public LoginPage open(){
        driver.get(BASE_URL);
        return this;

    }

    public HomePage login(String userName, String password){
        driver.findElement(USER_NAME_INPUT).sendKeys("aston79.vt-cbqy@force.com");
        driver.findElement(PASSWORD_INPUT).sendKeys("AstonSF79");
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}
