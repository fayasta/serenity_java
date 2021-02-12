package web.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import web.ui.LoginPage;

public class LoginSteps {
    //metodos de interaccion con los webElements
    // ingresar un texto a  un input

    LoginPage loginPage;

    @Step
    public void openLoginPage(){
        loginPage.open();
    }

    @Step
    public void fillUsernameField(String email){
        WebElementFacade usernameInput = loginPage.getUsernameInput();
        usernameInput.waitUntilVisible();
        usernameInput.waitUntilClickable();
        usernameInput.click();
        usernameInput.sendKeys(email);
    }

    @Step
    public void fillPasswordField(String password){
        WebElementFacade passwordInput = loginPage.getPasswordInput();
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    @Step
    public void clickOnLoginButton(){
        WebElementFacade entrarButton = loginPage.getEntrarButton();
        entrarButton.click();
    }
}
