package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetzHome extends BasePO{
    @FindBy(id = "headerSearch")
    public WebElement inputPesquisa;

    @FindBy(xpath = "//*[@data-testid='ecom-home-mascot-card-Cachorro']")
    public WebElement cardCachorro;

    @FindBy(xpath = "//*[@data-testid='ecom-home-mascot-card-Gato']")
    public WebElement cardGato;

    @FindBy(xpath = "//*[@data-testid='ecom-home-mascot-card-Pássaro']")
    public WebElement cardPassaro;

    @FindBy(xpath = "//*[@data-testid='ecom-home-mascot-card-Peixe']")
    public WebElement cardPeixe;

    @FindBy(xpath = "\"//*[@data-testid='ecom-home-mascot-card-Outros']\"")
    public WebElement cardOutros;

    @FindBy(xpath = "//*[@data-testid='ecom-home-mascot-card-Jardim']")
    public WebElement cardJardim;

    /**
     * Construtor base para criação da fábrica de elementos (PageFactory).
     *
     * @param driver Driver da página atual
     */
    public PetzHome(WebDriver driver) {
        super(driver);
    }

    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto+ Keys.ENTER);
    }
}
