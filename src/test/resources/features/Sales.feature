@Sales @SauceDemo
  Feature: SalesFlow
    As a user  I want to buy something

    Scenario: User make a purchase with 2 item
      Given User already on website sauce demo
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on sales page
      When User sort product list by "Name (Z to A)"
      And User pick 2 item from the basket Sauce Labs Onesie and Sauce Labs Bike Light
      And User click chart button
      Then Verify Chart Page
      Then User Remove 1 item
      Then User click Checkout
      When User input "Arum" as firstName , input "Puspa" as lastName and input "19293" as posCode
      Then Verify button finish
