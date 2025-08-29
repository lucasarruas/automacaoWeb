package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetzCookies extends BasePO{

    @FindBy(id = "onetrust-policy-title")
    public WebElement tituloAviso;

    @FindBy(id = "id=\"onetrust-policy-text\"")
    public WebElement textoPolitica;

    @FindBy(id = "onetrust-pc-btn-handler")
    public WebElement btnPersonalizar;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement btnAceitarCookies;

    /**
     * Construtor base para criação da fábrica de elementos (PageFactory).
     *
     * @param driver Driver da página atual
     */
    protected PetzCookies(WebDriver driver) {
        super(driver);
    }
}
