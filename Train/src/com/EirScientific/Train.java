package com.EirScientific;

/**
 * Train class for PPD test.
 * 
 * @author ENTER YOUR NAME HERE.
 * @version March 2009
 */
public class Train
{
    //Fields
    /* Destination of the Train */
    private String destination;

    /* Train number - identifies the Train */  
    private int TrainNumber;
    
    /* Capacity of the Train - how many customers can be in it */  
    private int capacity;
    
    /* Number of customers currently in the Train */      
    private int numberInTrain;
    
    /* Ticket price - how much a ticket costs. */
    private int ticketPrice;

    /*
    * Default constructor for Train
    */
    public Train ()
    {
        destination = "";
        capacity = -1;
        TrainNumber = -1;

        numberInTrain = 0;
        ticketPrice = 50;
    }

    /** Constructor for Train
     * @param dest the destination of the Train
     * @param num the number of the Train
     * @param cap the capacity of the Train
     */
    public Train(String dest, int num, int cap)
    {
        destination = dest;
        capacity = cap;
        TrainNumber = num;
        
        numberInTrain = 0;
        ticketPrice = 50;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return TrainNumber;
    }

    public int getNumberInTrain() {
        return numberInTrain;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTrainNumber(int trainNumber) {
        TrainNumber = trainNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", TrainNumber=" + TrainNumber +
                ", capacity=" + capacity +
                ", numberInTrain=" + numberInTrain +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    //mutators
    /* Records customer taking Train */
    public void enterTrain ()
    {
        numberInTrain = numberInTrain + 1;
    }

    /* Records customer leaving Train */
    public void leaveTrain ()
    {
        numberInTrain = numberInTrain - 1;
    }
}