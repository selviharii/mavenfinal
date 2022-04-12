@Adactinhotel
Feature: room booking on adactin hotel
  

  @login
  Scenario: user should be able login into  adactin page
    Given adactin hotel website loginpage should be open
    When user should enter valid username
    And user should enter valid password
    Then aferclicking login button navigate to homepage
    
  @searchhotel
  Scenario: enter mandatory fields in search page
  Given select location from dropdown
  When select your room you want from dropdown
  Then select roomtype from dropdown
  Then select number of rooms in your dropdown 
  And select checkin date with valid format 
  And select checkoutdate from dropdown
  And select number of adult in one room
  And selct number of children count it is not mandatory
  Then click search button
  
  @continuebutton
  scenerio: click on button
  Given check hotel details
  When click on continue button
  Then navigate to next page
  
  @paymentdetails
  scenerio: book a hotel with payment details
  Given enter name in first name
  When enter name in lastname field 
  Then user enter billing address
  Then user enter valid credit card number
  And select card type
  And user select valid expiry month
  And select valid expiry year
  And enter valid ccv number
  Then click on booknow button
  
  @logout
  scenerio: view booking history
  Given navigate to booking history page
  When takescreenshot of reference number
  Then click booking history reference button 
  Then click ok in alert 
  Then click on logout button 
  
  