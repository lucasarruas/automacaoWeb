Feature: Comprar produto no site Petz
  Scenario: Validar o valor do produto no site Petz
    Given que um usuario entra no site "https://www.petz.com.br/"
    When que seleciona um produto com o nome "Escada Baw & Miaw Grafite para Cães e Gatos"
    And na pagina do produto inclui o produto no carrinho e ir ate o carrinho de compra
    Then devera verificar se estao corretos os valores do produto "R$ 289,99"