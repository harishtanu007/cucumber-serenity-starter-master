Feature: Using the NCR FLMS APP


   Scenario: Logging into FLMS store
       Given User is in welcome page
       When User clicks on scan button
       And Scans the QRcode
       Then I should be able to Login to the store
	
        
    Scenario: Add an item into cart
        Given User is in cart page
		When User clicks on the scan button
        When Scans the "snickers"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "orbit"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "redbull"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "monster zero"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "sprite"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "7up"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "barqs beer"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "kraft ketchup"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "amstel bier"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "dvd frozen"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "toy car"
        Then Item must be added into cart
        When User clicks on the scan button
         When Scans the "champagne"
        Then Item must be added into cart
        