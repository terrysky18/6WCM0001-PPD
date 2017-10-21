package com.EirScientific;

/**
 *  An object of this class is a Driver of a coach.
 * 
 * @author Terry Song
 * @version Octorber 2017
 */
public class Driver
{
    private String name;
    private int id;    //id of a driver

    public Driver() {
        this.name = "";
        this.id = -1;
    }

    public Driver (String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
