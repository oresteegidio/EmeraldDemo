@ClassicsCDFeatures
Feature: Test ClassicsCD App
  I want to use this template for my feature file
  
  @smoke
  Scenario: Open and Close ClassicsCD App
  Given I start ClassicsCD App
  Then I close the App
  
  @smoke
  Scenario: maximize and restore ClassicsCDApp
  Given I start ClassicsCD App
  Then I maximize the App
  Then I click the same button to restore the App
  Then I close the App
