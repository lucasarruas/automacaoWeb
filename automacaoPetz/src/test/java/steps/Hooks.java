package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    private static final String URL_BASE = "https://www.petz.com.br/";
    private static final String CAMINHO_DRIVER = "src/test/resources/drivers/chromedriver_v139_0_7258_68.exe";
    private PetzHome petzHome;
    private PetzCookies petzCookies;
    private PetzResultadoPesquisa petzResultadoPesquisa;
    private PetzPaginaProduto petzPaginaProduto;
    private PetzSacola petzSacola;

    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @After
    public void finalizar(){
        driver.quit();
    }
}
