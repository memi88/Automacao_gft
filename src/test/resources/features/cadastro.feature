#language: pt

  Funcionalidade: Cadastro
    Sendo um usuário do site Kanui
    Gostaria de poder me cadastrar
    Para poder realizar compras

  Contexto: Inicia na página de Cadastri
    Dado que esteja na página de cadastro

    Cenário: Realizar cadastro
      Quando preencher o form com dados válidos
      E clicar no botão Criar Conta
      Então cadastro realizado com sucesso