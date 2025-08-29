package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PetzSacola extends BasePO{
    @FindBy(xpath = "//*[@class='money']")
    public WebElement valorSacola;

    @FindBy(id = "ptz-bag-product-quantity")
    public WebElement quantidade;

    /**
     * Construtor base para criação da fábrica de elementos (PageFactory).
     *
     * @param driver Driver da página atual
     */
    protected PetzSacola(WebDriver driver) {
        super(driver);
    }
}
