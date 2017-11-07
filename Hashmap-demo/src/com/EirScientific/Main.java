package com.EirScientific;

/*
Simple programme to demonstrate the use of Hashmap
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // Create a hash map
        HashMap my_hm = new HashMap();

        // Put elements into the map
        my_hm.put("Zara", new Double(3452.63));
        my_hm.put("Macey", new Double(321.63));
        my_hm.put("Amy", new Double(8695.048));
        my_hm.put("Daisy", new Double(703872.69));
        my_hm.put("Quincy", new Double(-8597.584));

        // Get a set of the entries
        Set my_set = my_hm.entrySet();

        // Get an iterator
        Iterator my_itr = my_set.iterator();

        // Display the elements
        while (my_itr.hasNext())
        {
            Map.Entry map_entry = (Map.Entry)my_itr.next();  // casting from Iterator to Map.Entry
            System.out.print(map_entry.getKey() + ": ");
            System.out.println(map_entry.getValue());
        }
        System.out.println();

        // Desposit 1000 into Zara's account
        double balance = ((Double)my_hm.get("Zara")).doubleValue();
        my_hm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance = " + my_hm.get("Zara"));
    }
}
