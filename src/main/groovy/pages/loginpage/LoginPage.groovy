package pages.loginpage

import com.shaft.gui.browser.BrowserActions
import com.shaft.gui.browser.BrowserFactory
import com.shaft.gui.element.ElementActions
import groovy.util.logging.Slf4j
import io.qameta.allure.Step
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import static locators.loginpage.LoginPageLocators.*

@Slf4j
class LoginPage {
    public WebDriver driver = BrowserFactory.getBrowser()

    @Step
    def navigateTo(String URI){
        BrowserActions.navigateToURL(driver, URI)
        ElementActions.click(driver, By.cssSelector(LOGIN_BTN) )
        return this
    }
}
