Feature: Validation of Adactin  Web Application

Background:
Given User launch Adactin  Web Application
Then User verify Adactin Hotel Login page is displayed

Scenario: TC01_Validation of Adaction with valid credentials

When User enters valid username and valid password 
And User clicks Login Button
Then User verify  Search Hotel page is displayed
When User select valid Location,Hotels,Room Type,Number of Rooms,Adults per Room,Child per Room
And User clicks Search Button
Then User verify Select Hotel page
When User clicks Radio Button and User clicks Continue Button
Then User verify Booking page
When User enters Frist Name, Last Name,Billing Address
When User enters Credit Card No and Select Credit Card Type,Expiry Month,Year and Cvv Number
And User Clicks Book Now Button
Then User Verify Order No is displayed


Scenario Outline: Tc02_Validation of Adactin with multiple valid test data

 When User enters valid "<username>" and valid "<password>"
 And User clicks Login Button 
 Then User verify  Search Hotel page is displayed
 When User select valid "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Adults per Room>","<Child per Room>"
 And User clicks Search Button
 Then User verify Select Hotel page
 When User clicks Radio Button and User clicks Continue Button
 Then User verify Booking page
 When User enters "<Frist Name>", "<Last Name>","<Billing Address>"
 When User enters "<Credit Card No>" and Select "<Credit Card Type>","<Expiry Month>","<Year>" and "<Cvv Number>"
 And User Clicks Book Now Button
 Then User Verify Order No is displayed
 
 Examples:
 |username|password|Location|Hotels|Room Type|Number of Rooms|Adults per Room|Child per Room|Frist Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Expiry Month|Year|Cvv Number|
 |Gowthamkage123|kage123@|Sydney|Hotel Creek|Standard|1 - One|1 - One|0 - None|gowtham|Anbu|c-15 cable street cuddalore|9791255869456123|American Express|February|2022|456|
 |Gowthamkage123|kage123@|Melbourne|Hotel Sunshine|Double|2 - Two|2 - Two|1 - One|pravin|Fernando|c-45 bill street cuddalore|9791255869789456|VISA|March|2022|457|  
 |Gowthamkage123|kage123@|Brisbane|Hotel Hervey|Deluxe|3 - Three|3 - Three|2 - Two|dinesh|Raja|c-45 clerk street cuddalore|9791255869123789|Master Card|April|2022|458| 
 |Gowthamkage123|kage123@|Adelaide|Hotel Cornice|Super Deluxe|4 - Four|4 - Four|4 - Four|karthi|Raja|c-88 count street cuddalore|9791255869123789|Other|June|2022|429|
         