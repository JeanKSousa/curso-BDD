#Autor: Jean Sousa
  @stories
  Feature: Search Choucair Wiki
    As I user, i want to do a search so that  found information
  @scenario
  Scenario: Search for a concept
    Given Browser on the Choucairwiki page
    |user|password|
    |jsousad|Choucair10696@@|
    When Search the concept
    |concept|
    |Metodología de Pruebas|
    Then search results are displayed
    |result|
    |Resultados de la búsqueda|


