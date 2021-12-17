# MachineCode-Interview   
Ecommerce Feature   

Java Machine Code    

Entry Class    
--> TestMainMethod    

1. Entities    
     USER    
        Customer  
        Seller    
     Item  
     Deal  
   
   
2. DataBase Schema  
  Relational Database  

    1.Table ITEM  
    -- ItemId,ItemName   

    2.Table User   
    -- UserId,UserName,UserType   

    3.Table Deal
    -- DealId, SellerId, ItemId, Quantity, AmountPerItem, Status, EndTime    

       SellerId--> UserId(User)   
       ItemId --> ItemId(Item)   
       Status -->   0 - Created   
        1  - Available   
        2  - End     

    //to find all deals of users   
    4.Table UserDeals   
    -- UserId, DealId  

3. API Methods    

    1. Create Deal - Method   
    POST : /deal   
    return Status 201 Created OK   
            Deal Object    

    2. GetAllDeals - Method   
    GET : /deal/search/:itemName  
    return Status 200   
            Deals JSON List of Object  
            
    3. getDeal - Method  
    GET : /deal/:dealId  
    return Status 200   
            Deal Object   

    4. Update Deal  
    PATCH : /deal/:dealId   
    return Status 204 Updated   
          Updated Deal Object   


   OOPS Pattern Used   
   1. Stretegy pattern  
   -- for Search deals of Items using ItemName   
   2. factory pattern  
   -- can be Used to get Object of Specific User -- Seller/Customer  

---Test Output
![image](https://user-images.githubusercontent.com/74495322/146478757-5b620d6e-db00-4e56-9577-75ccf66fd513.png)


