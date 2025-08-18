# automacaoWeb
Projeto de automação WEB usando Java, Selenium, Cubumber, JUnit

Parte 1: Configuração do Ambiente (10 pts) 
Tarefa: 
Crie um projeto Maven com as dependências necessárias para usar: 
 Java 11+ 
 Selenium WebDriver 
 Cucumber 
 JUnit 
Critérios de avaliação: 
 Estrutura correta do projeto 
 pom.xml com dependências bem definidas 
 Organização dos pacotes (features, steps, pages, runners) 
Parte 2: Automação com Selenium (30 pts) 
Tarefa: 
Automatize o seguinte fluxo no site https://www.petz.com.br/: 
1. Escolhe um produto (Ex.: Escada Baw & Miaw Grafite para Cães e Gatos) 
2. Seleciona esse produto 
3. Na pagina do produto selecionado, pegar o seu valor 
4. Clicar no botão de “Adicionar à sacola” 
5. Verifique se os valores da pagina do produto e da Sacola estão corretos 
com o valor esperado (Ex.: "R$ 202,99") 
Critérios de avaliação: 
 Uso correto do WebDriver 
 Identificação de elementos (por ID, CSS ou XPath) 
 Validação de URL ou elemento da página pós-login 
 Boas práticas (uso de Page Object Model é um diferencial) 
Parte 3: Cenário em Cucumber (30 pts) 
Tarefa: 
Crie um arquivo .feature com o seguinte cenário: 
Exemplo: 
Feature: Comprar produto no site Petz 
Scenario: Validar o valor do produto no site Petz 
Given que um usuario entra no site "https://www.petz.com.br/" 
When que seleciona um produto com o nome "Escada Baw & Miaw Grafite para Cães e Gatos" 
And na pagina do produto inclui o produto no carrinho e ir ate o carrinho de compra 
Then devera verificar se estao corretos os valores do produto "R$ 202,99"    
Critérios de avaliação: 
 Clareza e estrutura do Gherkin 
 Mapeamento correto dos steps 
 Integração com Selenium 
 Execução funcional do teste 
Parte 4: Validação e Boas Práticas (30 pts) 
Tarefa: 
 Execute os testes e envie evidências (prints ou logs) 
 Implemente pelo menos uma espera explícita 
 Use assertions para validar o resultado 
 Organize o código com clareza e reutilização 
Critérios de avaliação: 
 Código limpo e legível 
 Separação de responsabilidades 
 Uso de boas práticas de teste automatizado 
 Teste executável e funcional
