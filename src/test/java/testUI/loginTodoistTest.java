package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.Todoist.MainPage;
import pages.Todoist.EmailRegisterPage;
import pages.Todoist.NameRegisterPage;
import pages.Todoist.GoPage;
import pages.Todoist.ThemePage;
import pages.Todoist.OpenPage;
import session.Session;

public class loginTodoistTest {

    MainPage mainPage = new MainPage();
    EmailRegisterPage emailPage = new EmailRegisterPage();
    NameRegisterPage namePage = new NameRegisterPage();
    GoPage goPage = new GoPage();
    ThemePage themePage = new ThemePage();
    OpenPage openPage = new OpenPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("http://todoist.com/");
    }

    @DisplayName("verify The Register Using Email")
    @Description("This test case is to verify verify The Register Using Email, Name And Password")
    @Owner("Marcos Rafael")
    @Test
    public void verifyTheLoginWithRegister() throws InterruptedException {
        mainPage.registerButton.click();
        emailPage.emailTextBox.type("1modulo4tarea3@gmail.com");
        emailPage.registerEmailButton.click();
        namePage.nameTextBox.type("marcos");
        namePage.passwordTextBox.type("123*Ucb*");
        namePage.registerNowButton.click();
        goPage.goButton.click();
        themePage.themeButton.click();
        themePage.createButton.click();
        openPage.openButton.click();

        // Verification
        Thread.sleep(2000);
        Assert.assertFalse("ERROR , no se pudo realizar el login!",namePage.registerNowButton.isDisplayedOnPage());
    }
    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }
}
