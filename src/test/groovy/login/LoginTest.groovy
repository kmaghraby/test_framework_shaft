package login;

import com.shaft.gui.browser.BrowserActions;
import io.qameta.allure.Link
import org.springframework.beans.factory.annotation.Autowired
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test
import pages.loginpage.LoginPage
import commons.annotations.retry.Retry

 class LoginTest {

    @Autowired
    @Lazy
    private LoginPage loginPage;

    private final String url = "https://www.facebook.com/";
    @Link("TC_001")
    @Test(description = "TC_01 - Login Functionality Test" ,retryAnalyzer = Retry)
     void loginTest(){

        loginPage.navigateTo(url)

    }

    @AfterMethod
     void afterMethod(){
        BrowserActions.closeCurrentWindow(loginPage.driver)
    }


}
