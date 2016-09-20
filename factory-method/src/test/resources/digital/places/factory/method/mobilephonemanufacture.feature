Feature: MobilePhoneManufacture

  Scenario: make 2 phones
    Given I have 2 types of phones Apple and Android
    When I make an Apple phone
    Then I should get the output Apple ios=[CALL, TEXT], store=Store [name=iTunes]
    When I make an Android phone
    Then I should get the output Android androidos=[CALL, TEXT], store=Store [name=Google Play]
    
