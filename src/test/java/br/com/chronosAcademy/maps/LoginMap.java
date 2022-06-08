package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.CSS;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "input[name = 'username']")
    public WebElement inpUserName;
    @FindBy(css = "input[name = 'password']")
    public WebElement inpPassWord;
    @FindBy(css = "#sign_in_btnundefined")
    public WebElement btnSignIn;
    @FindBy(css = "input[name='remember_me']")
    public WebElement inpRemember;
    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreateAccount;
    @FindBy(css = ".loader")
    public WebElement divLoader;
    @FindBy(css = ".containMiniTitle")
    public WebElement txtLogado;
    @FindBy(xpath = "//label[contains(text(),  'Incorrect')]")
    public WebElement txtErroLogin;
}
