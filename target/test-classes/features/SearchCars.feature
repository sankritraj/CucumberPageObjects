@Search-Cars
Feature:Acceptance testing to validate Search cars page is working
In order to validate that 
the search cars page is working fine 
We will do the acceptance testing

@Search-Cars-positive
Scenario: Validate search cars page
Given I am on Home Page "https://www.carsguide.com.au" of CarsGuide website
When I move to the menu
  | Menu        |
  | Buy + Sell  |
  | Sell my car |
 And Click on "Search Cars"link
 And Select carbrand as "BMW" from AnyMake dropdown
 And Select carmodel as "1 Series" from SelectModel dropdown
 And Select location as "Australia" from SelectLocation dropdown
 And Select price as "$ 1,000" from Price dropdown
 And click on Find_My_Next car button
 Then I Should see list of searched cars
 And Page title should be "BMW 1 Series cars"
 

