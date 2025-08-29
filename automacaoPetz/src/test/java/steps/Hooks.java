package steps;

import pages.PetzHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PetzHome;

public abstract class Hooks {
    protected static WebDriver driver;
    private static PetzHome petzHOME;
    //private static final String URL_BASE = "https://www.petz.com.br/";
    private static final String CAMINHO_DRIVER = "src/test/resources/drivers/chromedriver_v139_0_7258_68.exe";

    @Before(order = 0)
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get(URL_BASE);
        //petzPage = new PetzPO(driver);
        //petzHOME = new PetzHOME(driver);
    }

    @After(order = 0)
    public static void finalizar(){
        driver.close();
        driver.quit();
    }
}
