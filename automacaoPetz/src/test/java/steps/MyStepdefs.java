package steps;

import org.openqa.selenium.WebDriver;
import pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs{
    private WebDriver driver = Hooks.driver;
    private PetzHome petzHome;
    private PetzCookies petzCookies;
    private PetzResultadoPesquisa petzResultadoPesquisa;
    private PetzPaginaProduto petzPaginaProduto;
    private PetzSacola petzSacola;

    @Given("que um usuario entra no site {string}")
    public void que_um_usuario_entra_no_site(String string) {
        driver.getCurrentUrl();
        petzCookies = new PetzCookies(driver);
        if (petzCookies.btnAceitarCookies.isDisplayed()){
            petzCookies.btnAceitarCookies.click();
        }
    }

    @When("que seleciona um produto com o nome {string}")
    public void que_seleciona_um_produto_com_o_nome(String string) {
        petzHome = new PetzHome(driver);
        petzResultadoPesquisa = new PetzResultadoPesquisa(driver);
        petzHome.pesquisar(string);
        petzResultadoPesquisa.escolheProduto.click();
    }

    @And("na pagina do produto inclui o produto no carrinho e ir ate o carrinho de compra")
    public void na_pagina_do_produto_inclui_o_produto_no_carrinho_e_ir_ate_o_carrinho_de_compra() {
        //valorAtual = petzPaginaProduto.pegaValorDoItem.getText();
        petzPaginaProduto = new PetzPaginaProduto(driver);
        petzPaginaProduto.adicionaNaSacola.click();
    }

    @Then("devera verificar se estao corretos os valores do produto {string}")
    public void devera_verificar_se_estao_corretos_os_valores_do_produto(String string) throws InterruptedException {
        Thread.sleep(4000);
        petzSacola = new PetzSacola(driver);
        //String valorSacola = petzSacola.valorSacola.getText();
        assertEquals(petzSacola.valorSacola,string);
    }
}
