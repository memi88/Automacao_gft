package pages;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import runners.TestRule;

public class LoginPage extends LoginElementMap{

    public LoginPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessarCadastro(){
        linkCadastrar.click();
    }

    public void preencherCadastro(String nome, String sobrenome, String email, String sexo, String cpf, String dia, String mes, String ano, String senha, String senha2){
        labelNome.sendKeys(nome);
        labelSobreNome.sendKeys(sobrenome);
        labelEmail.sendKeys(email);
        Select selectSexo = new Select(labelSexo);
        selectSexo.selectByValue(sexo);
        labelCpf.sendKeys(cpf);
        Select selectDia = new Select(labelDia);
        selectDia.selectByValue(dia);
        Select selectMes = new Select(labelMes);
        selectMes.selectByValue(mes);
        Select selectAno = new Select(labelAno);
        selectAno.selectByValue(ano);
        labelSenha.sendKeys(senha);
        labelRepetirSenha.sendKeys(senha2);

    }

    public void clicarCriarConta(){
        btnCriarConta.click();
    }

    public void validarCadastro(){
        Assert.assertEquals(true, headerName.isDisplayed());
        Assert.assertEquals(true, infoConta.isDisplayed());
        Assert.assertEquals(true, meusPedidos.isDisplayed());
        Assert.assertEquals(true, meusFavoritos.isDisplayed());
        Assert.assertEquals(true, meusEnderecos.isDisplayed());
    }


}
