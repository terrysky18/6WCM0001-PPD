package com.EirScientific;

/**
 * Write a description of class Carpet here.
 * 
 * @author Mick Wood 
 * @version 31/10/02
 */
public class Carpet
{
    // Description of the carpet
    private String description;

    // Width of the carpet
    private int width;

    // Price per square metre
    private double price_p_sqr_metre;

    // Default constructor
    public Carpet() {
        this.description = "";
        this.width = 0;
        this.price_p_sqr_metre = 0;
    }

    /*
    Constructor with 3 initial values
    param:  String description - carpet description
    param:  int width - carpet width
    param:  double price_p_sqr_metre - carpet price per square metre
     */
    public Carpet(String description, int width, double price_p_sqr_metre) {
        this.description = description;
        this.width = width;
        this.price_p_sqr_metre = price_p_sqr_metre;
    }

    /*
    Constructor with 2 initial values
    param:  String description - carpet description
    param:  int width - carpet width
     */
    public Carpet(String description, int width) {
        this.description = description;
        this.width = width;
        this.price_p_sqr_metre = 5.0;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "description='" + description + '\'' +
                ", width=" + width +
                ", price_p_sqr_metre=" + price_p_sqr_metre +
                '}';
    }

    public String getDescription() {
        return this.description;
    }

    public int getWidth() {
        return this.width;
    }

    public double getPrice_p_sqr_metre() {
        return this.price_p_sqr_metre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPrice_p_sqr_metre(double price_p_sqr_metre) {
        this.price_p_sqr_metre = price_p_sqr_metre;
    }

    /*
    public double getBill(double carpet_length)
    Accessor method, calculates the total cost of a carpet, a service of £2 is included
    param:  double carpet_length - length of carpet
    return:  double
     */
    public double getBill(double carpet_length)
    {
        double service_fee = 2;
        double carpet_area = this.width * carpet_length;
        return this.price_p_sqr_metre * carpet_area + service_fee;
    }
}
