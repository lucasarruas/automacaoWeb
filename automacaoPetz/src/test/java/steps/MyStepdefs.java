package steps;

import pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class MyStepdefs extends Hooks {

    private static PetzHome petzHome;
    private static PetzCookies petzCookies;
    private static PetzResultadoPesquisa petzResultadoPesquisa;
    private static PetzPaginaProduto petzPaginaProduto;
    private static PetzSacola petzSacola;
    //public String valorAtual;

    @Given("que um usuario entra no site {string}")
    public void que_um_usuario_entra_no_site(String string) {
        final String URL_BASE = string;
        driver.get(URL_BASE);
        //petzHOME = new PetzHOME(driver);
        petzCookies.btnAceitarCookies.click();
    }

    @When("que seleciona um produto com o nome {string}")
    public void que_seleciona_um_produto_com_o_nome(String string) {
        petzHome.pesquisar(string);
        petzResultadoPesquisa.escolheProduto.click();
    }

    @When("na pagina do produto inclui o produto no carrinho e ir ate o carrinho de compra")
    public void na_pagina_do_produto_inclui_o_produto_no_carrinho_e_ir_ate_o_carrinho_de_compra() {
        //valorAtual = petzPaginaProduto.pegaValorDoItem.getText();
        petzPaginaProduto.adicionaNaSacola.click();
    }

    @Then("devera verificar se estao corretos os valores do produto {string}")
    public void devera_verificar_se_estao_corretos_os_valores_do_produto(String string) throws InterruptedException {
        Thread.sleep(4000);
        String valorSacola = petzSacola.valorSacola.getText();
        assertEquals(valorSacola,string);
    }
}
