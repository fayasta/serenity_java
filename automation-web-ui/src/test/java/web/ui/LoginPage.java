package web.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:docEle.base.url")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade usernameInput;

    @FindBy(id = "password")
    private WebElementFacade passwordInput;

    @FindBy(name = "Entrar")
    private WebElementFacade entrarButton;

    public WebElementFacade getUsernameInput() {
        return usernameInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getEntrarButton() {
        return entrarButton;
    }
}