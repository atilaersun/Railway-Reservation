/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg215se2299project1cse112;

import java.util.Date;

/**
 *
 * @author atila
 */
public class Reservation {

    
    private static int regular_seats = 500;
    private static int firstclass_seats = 50;
    private static int total_seats=firstclass_seats+regular_seats;
   
    private Date reservationDate;
    private int numberOfSeats=1;
    private String from = "İstanbul" ;
    private String to = "Ankara";
    private String dateOfTravel = "June 13,2021,16:00:00";
    private int typeOfSeats;    // 1 for regular 2 for first class
    private static int count;
    private int reservationcode;

    
    
    
    public Reservation(int numberOfSeats,int typeOfSeats){
        
        this.numberOfSeats=numberOfSeats;
       
        this.typeOfSeats=typeOfSeats;
        reservationcode++;
       
        count++;
        reservationcode=reservationcode+count;;
        reservationDate=new Date();
        
        
        if(typeOfSeats==1){
            regular_seats=regular_seats-numberOfSeats;
        }
        if(typeOfSeats==2){
            firstclass_seats=firstclass_seats-numberOfSeats;
        }
        
        
    }
    
    public void cancelMe(int numberOfSeats,int typeOfSeats){
        if(typeOfSeats==1){
            regular_seats=getRegular_seats()+numberOfSeats;
        }
        if(typeOfSeats==2){
            firstclass_seats=getFirstclass_seats()+numberOfSeats;
        }
    }
    
    
    
    /**
     * @return the reservationDate
     */
    public Date getReservationDate() {
        return reservationDate;
    }

    /**
     * @param reservationDate the reservationDate to set
     */
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    /**
     * @return the numberofseats
     */
    public int getNumberofseats() {
        return numberOfSeats;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return the dateOfTravel
     */
    public String getDateOfTravel() {
        return dateOfTravel;
    }

    /**
     * @param dateOfTravel the dateOfTravel to set
     */
    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    /**
     * @return the typeOfSeats
     */
    public int getTypeOfSeats() {
        return typeOfSeats;
    }

    /**
     * @return the count
     */
    
    
    
    /**
     * @return the regular_seats
     */
    public static int getRegular_seats() {
        return regular_seats;
    }

    /**
     * @return the firstclass_seats
     */
    public static int getFirstclass_seats() {
        return firstclass_seats;
    }

    /**
     * @return the total_seats
     */
    public static int getTotal_seats() {
        return total_seats;
    }

    /**
     * @return the reservationcode
     */
    public  int getReservationcode() {
        return reservationcode;
    }

    @Override
    public String toString() {
        return   "Your Reservation code :  "+ getReservationcode()+ "\n" + "Number Of Seats : "+  getNumberofseats() + "\n"+" Type Of Seats : "+ getTypeOfSeats()+"\n"
                +"Date Of Travel : "+ getDateOfTravel()+"\n"+"From : "+getFrom()+"\n"+"To : "+getTo();
    }
    
    
    
}
