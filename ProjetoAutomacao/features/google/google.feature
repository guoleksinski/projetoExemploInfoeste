@google
Feature: pesquisa no google

  Scenario: Fazer pesquisa no google
    Given abro a pagina do google
    When digito na barra de pesquisa
    And clico no botão pesquisar
    Then deve aparecer a pesquisa feita

  # Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
