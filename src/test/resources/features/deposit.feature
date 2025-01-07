Feature: deposit
    As a customer
    I want to deposit to my account using ATM

Background:
    Given a customer with id 1 and pin 111 with balance 200 exists
    When I login to ATM with id 1 and pin 111

Scenario: Deposit negative amount
    When I deposit -50 which is equal or under zero to ATM
    Then my account balance is 200

Scenario: Deposit zero amount
    When I deposit 0 which is equal or under zero to ATM
    Then my account balance is 200

Scenario: Deposit positive amount
    When I deposit 50 to ATM
    Then my account balance is 250