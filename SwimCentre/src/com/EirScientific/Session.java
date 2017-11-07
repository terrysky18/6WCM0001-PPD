package com.EirScientific;

import java.util.*;

/**
 * Class Session describes sessions organized by a swimming centre.
 * 
 * @author 
 * @version 
 */

public class Session
{
    private String SessionCode;
    private String description;
    private double fee;
    public  Date startDate;
    private double totalFees;
    private ArrayList<Member> participants;
     
    public Session (String SessionCode, String description, 
                    double fee, Date date)
    {
        startDate = date;
        this.SessionCode = SessionCode;
        this.description = description;
        this.fee = fee;
        totalFees = 0;
     }
     
    public String getSessionCode () {return SessionCode;}

    public double getFee () {return fee;}

    public Date getStartDate () {return startDate;}

    public void signUp(Member participant_member)
    {
        participants.add(participant_member);
        totalFees += fee;
    }

    public void showMembersOnSession()
    {
        System.out.println("Participating members on the session:");
        for (int idx=0; idx<participants.size(); idx++)
        {
            System.out.println(participants.get(idx));
        }
    }

    public String toString()
    {              
        String separator = ", ";
        return SessionCode + separator + description + separator + 
                            "\nDate: " + startDate.toString() + 
                            "\nFee: " + fee + " Total fees: " + totalFees;
    }            
}
