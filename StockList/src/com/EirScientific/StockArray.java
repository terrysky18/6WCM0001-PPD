package com.EirScientific;

/**
 * Collection of StockItems stored in an array.
 * 
 * @author Mick Wood
 * @version 06/01/03
 */
public class StockArray
{
    //part c.
    private StockItem[] stock;
    
    //part d.
    public StockArray(int size)
    {
        stock = new StockItem [size];
    }
    
    /** part e.
     * @param description - description of stock item to be added
     * @param price - price of stock item to be added
     * @param index - where in array to add item
     */
    public void addNewStockItem (String description, int price, int index)
    {
        if (0 <= index && index < stock.length)
        {
            stock [index] = new StockItem (description, price);
        }    
    }
    
    // part f.
    public int noOfStockItems() {return stock.length;}

    /** part i. 
     * @param ix - index of item to be displayed
     */    
    public void displayStockItem(int ix)
    {
         if(ix >= 0 && ix < stock.length && stock[ix]!=null)
         {
            System.out.println(stock[ix].toString());
         }
    }
    
    // part k.
    public void listAllStockItems()
    {
        for (int i = 0; i < stock.length; i++ )
        {
            if(stock[i] != null)
            {
                System.out.println(i + ": " + stock[i].toString());
            }
        }
    }

    /** part l.
     * @param ix - index of item to be updated
     * @param del - number delivered
     */
    public void updateStockLevel(int ix, int del)
    {
        if( ix>= 0 && ix  <stock.length && stock[ix] != null)
        {
            stock[ix].doDelivery(del);
        }
    }
}