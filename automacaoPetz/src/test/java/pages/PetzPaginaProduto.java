package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetzPaginaProduto extends BasePO {

    @FindBy(xpath = "//div[@class='current-price-left']/strong")
    public WebElement pegaValorDoItem;

    @FindBy(xpath = "//*[@id='addToBag']/button/span/strong")
    public WebElement adicionaNaSacola;

    /**
     * Construtor base para criação da fábrica de elementos (PageFactory).
     *
     * @param driver Driver da página atual
     */
    public PetzPaginaProduto(WebDriver driver) {
        super(driver);
    }
}
