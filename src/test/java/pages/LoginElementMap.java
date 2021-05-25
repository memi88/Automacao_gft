package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginElementMap {

    @FindBy(xpath = "//h2[contains(text(),'Quero me cadastrar')]")
    protected WebElement linkCadastrar;

    @FindBy(id = "RegistrationForm_first_name")
    protected WebElement labelNome;

    @FindBy(id = "RegistrationForm_last_name")
    protected WebElement labelSobreNome;

    @FindBy(id = "RegistrationForm_email")
    protected WebElement labelEmail;

    @FindBy(id = "RegistrationForm_gender")
    protected WebElement labelSexo;

    @FindBy(id = "RegistrationForm_tax_identification")
    protected WebElement labelCpf;

    @FindBy(id = "RegistrationForm_day")
    protected WebElement labelDia;

    @FindBy(id = "RegistrationForm_month")
    protected WebElement labelMes;

    @FindBy(id = "RegistrationForm_year")
    protected WebElement labelAno;

    @FindBy(id = "form-customer-account-password")
    protected WebElement labelSenha;

    @FindBy(id = "RegistrationForm_password2")
    protected WebElement labelRepetirSenha;

    @FindBy(id = "customer-account-create")
    protected WebElement btnCriarConta;

    @FindBy(xpath = "//p[contains(text(),'Informações de Conta')]")
    protected WebElement infoConta;

    @FindBy(xpath = "//p[contains(text(),'Meus Pedidos')]")
    protected WebElement meusPedidos;

    @FindBy(xpath = "//p[contains(text(),'Meus Favoritos')]")
    protected WebElement meusFavoritos;

    @FindBy(xpath = "//p[contains(text(),'Meus Endereços')]")
    protected WebElement meusEnderecos;





}
