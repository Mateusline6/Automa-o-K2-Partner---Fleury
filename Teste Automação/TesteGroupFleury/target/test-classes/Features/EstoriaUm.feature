#Author: mateusefigenio55@gmail.com

@tag
Feature: Pesquisar unidades
   Eu como usuario quero pesquisar unidades de atendimento

  @tag1
  Scenario: Pesquisando Unidades
    Given Que esteja no site "https://www.fleury.com.br"
    And Clique em unidades
    When Selecionar unidade por facilidade
    Then Valido nome da unidade
    

 
