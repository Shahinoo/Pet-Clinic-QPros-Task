@smoke
Feature: Find all the existing owners and Add a new owner, add pet for that owner

  Background: User already on Find Owners page
    Given user navigate to findOwner page

  Scenario: Find all the existing owners which are added in an application and print that list
    When user click on findOwner Button
    Then user find all listed owners

  Scenario: Add a new owner, add pet for that owner and assert on all information
    When user click on AddOwner Button
    And user add owner with valid data
    Then owner is added Successfully
    When user click on AddNewPet Button
    And user add pet for the owner with valid data
    Then pet is added successfully
