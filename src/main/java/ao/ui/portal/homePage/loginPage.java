package ao.ui.portal.homePage;

import ao.ui.utils.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends PageObjects {
    //constructor
    public loginPage(WebDriver driver) {super(driver);}

    //locators
    By userName = By.id("j_username");
    By pswd = By.id("j_password");
    By btnLogin = By.id("btnLoginDC");

    /* Refatorando o método a fim de enxugar a ação uma vez pelo metodo credenciais.
    public void setUserName(String utilizador){driver.findElement(userName).sendKeys(utilizador);}
    public void setPswd(String password){driver.findElement(pswd).sendKeys(password);}
    public void setBtnLogin(){driver.findElement(btnLogin).click();}
    */
    public void credenciais(String userNam, String password) {
        driver.findElement(userName).sendKeys(userNam);
        driver.findElement(pswd).sendKeys(password);
        driver.findElement(btnLogin).click();
    }
}
