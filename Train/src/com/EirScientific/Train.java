package com.EirScientific;

/**
 * Train class for PPD test.
 * 
 * @author Terry Song
 * @version October 2017
 */
public class Train
{
    //Fields
    /* Destination of the Train */
    private String destination;

    /* Train number - identifies the Train */  
    private int trainNumber;
    
    /* Capacity of the Train - how many customers can be in it */  
    private int capacity;
    
    /* Number of customers currently in the Train */      
    private int numberInTrain;
    
    /* Ticket price - how much a ticket costs. */
    private int ticketPrice;

    /* Total takings - total money taken in by the train */
    private int totalTaking;

    /** Default constructor for Train */
    public Train ()
    {
        this.destination = "";
        this.capacity = -1;
        this.trainNumber = -1;

        this.numberInTrain = 0;
        this.ticketPrice = 50;
        this.totalTaking = numberInTrain * ticketPrice;
    }

    /** Constructor for Train
     * @param dest the destination of the Train
     * @param num the number of the Train
     * @param cap the capacity of the Train
     */
    public Train(String dest, int num, int cap)
    {
        this.destination = dest;
        this.capacity = cap;
        this.trainNumber = num;
        
        this.numberInTrain = 0;
        this.ticketPrice = 50;
        this.totalTaking = numberInTrain * ticketPrice;
    }

    /** Constructor for Train
     * @param destination
     * @param trainNumber
     * @param capacity
     * @param ticketPrice
     */
    public Train(String destination, int trainNumber, int capacity, int ticketPrice) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;

        this.numberInTrain = 0;
        this.totalTaking = numberInTrain * this.ticketPrice;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getNumberInTrain() {
        return numberInTrain;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getTotalTaking() {
        return totalTaking;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /* Reset total taking to 0 */
    public void resetTotalTaking()
    {
        this.totalTaking = 0;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", capacity=" + capacity +
                ", numberInTrain=" + numberInTrain +
                ", ticketPrice=" + ticketPrice +
                ", totalTaking=" + totalTaking +
                '}';
    }

    //mutators
    /* Records customer taking Train */
    public void enterTrain ()
    {
        if (numberInTrain <= capacity)
        {
            numberInTrain++;
            totalTaking = totalTaking + ticketPrice;
        }
        else
        {
            System.out.println("Train " + trainNumber + " is full.");
        }
    }

    /* Records customer leaving Train */
    public void leaveTrain ()
    {
        if (numberInTrain > 0)
        {
            numberInTrain--;
        }
        else
        {
            System.out.println("Train " + trainNumber + " is empty.");
        }
    }
}