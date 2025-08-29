package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetzResultadoPesquisa extends BasePO{

    @FindBy(xpath = "//h1")
    public WebElement tituloPesquisa;

    @FindBy(xpath = "//p[@class='ptz-card-label-left']")
    public WebElement escolheProduto;

    /**
     * Construtor base para criação da fábrica de elementos (PageFactory).
     *
     * @param driver Driver da página atual
     */


    protected PetzResultadoPesquisa(WebDriver driver) {
        super(driver);
    }
}
