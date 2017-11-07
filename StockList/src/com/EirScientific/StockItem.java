package com.EirScientific;

/**
 * Answer to Additional Execise 4.10
 * 
 * @author Mick Wood 
 * @version 15/11/02
 */
public class StockItem
{

    private String description;
    private int quantity;
    private int price;
    

    private boolean onOrder;
    
    /** 
     * @param d - description of the item
     * @param p - price of the item
     */
    public StockItem (String d, int p)
    {
        description = d;
        quantity = 0;
        price = p;
        onOrder = false;
    }
    
    public void setPrice (int p) {price = p;}
    
    public void doDelivery (int amount) 
    {
        quantity = quantity + amount;
        onOrder = false;
    }
    
    public void doSale (int amount) 
    {
        if (quantity >= amount)  {quantity = quantity - amount;}
    }   
    
    public String getDescription() {return description;}
    
    public int getQuantity() {return quantity;}
    
    public int getPrice() {return price;}

    public boolean orderMore()
    {
        return (quantity < 5); 
        
        //NOTE - this is better than:  if (quantity<5) {return true;} else {return false;}
    }
    
    public void setOnOrder () {onOrder = true;}
    
    /** @return total value of stock
    */
    public int getStockValue ()
    {
        int stockValue = quantity * price;
        return stockValue;
    }
    
    public String toString()
    {
        return description + ", " + quantity + " in stock, Price = " + price;
    }
}
