package steps;

import cucumber.api.java.pt.*;
import pages.LoginPage;

public class CadastroSteps {


    @Dado("^que esteja na página de cadastro$")
    public void que_esteja_na_página_de_cadastro() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.acessarCadastro();
    }

    @Quando("^preencher o form com dados válidos$")
    public void preencher_o_form_com_dados_válidos() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.preencherCadastro("Guilherme", "Moreira", "gmoreirasss@email.com.br", "male", "70287842070", "20", "05", "1990", "Gu123456.", "Gu123456.");

    }

    @Quando("^clicar no botão Criar Conta$")
    public void clicar_no_botão_Criar_Conta() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.clicarCriarConta();
    }

    @Então("^cadastro realizado com sucesso$")
    public void cadastro_realizado_com_sucesso() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.validarCadastro();
    }
}
