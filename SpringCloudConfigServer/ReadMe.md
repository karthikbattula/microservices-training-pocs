## Energy Account Statement
BGB registered customers are able to view their account statement online or download it as PDF document for their energy accounts.
Overview : 
* API validates the customer's accountID and returns the energy account statement details from SAP for the given date range based on the request.
* This API performs two operations explained as below,
* View Statement:
    * Requested 'Accept' type is application/vnd.api+json in Request header.
    * Account statement details are returned as JSON reponse to the client for the contract account number.
* Download Statement:
