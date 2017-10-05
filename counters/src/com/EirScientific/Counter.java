package com.EirScientific;

/***
 * Description: Simple Counter class.
 * First version.  No user interface.  No error checking.
 *@author Mick Wood
 *@version 1.0
 */
public class Counter
{
    private int count = 0;

    /**Adds one to count, provided count < 999 */
    public void increment () {count ++;}
    
    /** Subtracts one from count, provided count > 0 */
    public void decrement () {count --;}
    
    /** Sets count to zero */
    public void clear () {count = 0;}
    
    /**Returns value of count.
     * @return value of count 
     */
    public int getCount () {return count;}
}