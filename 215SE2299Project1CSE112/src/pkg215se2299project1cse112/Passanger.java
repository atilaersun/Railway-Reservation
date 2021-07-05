/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg215se2299project1cse112;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author atila
 */
public class Passanger {
    private String name;
    private String address;
    private String phonenumber;
     private Password pwd;
    private ArrayList<Reservation> listOfReservations;
    private static int count;
    private int accountid=1000-1;
    
    
    
    public Passanger(String name, String address, String phonenumber, int pass){
       
        this.name = name;
        this.name = address;
        count++;
        accountid=accountid+count;
        System.out.println("Your id = "+ accountid);
        this.pwd=new Password(pass);
        
        listOfReservations = new ArrayList<Reservation>();
        
        
        
        
        
    }
    public boolean Login(int pass,int id){
  
       // i converted int pass to string for using equals method
        if(String.valueOf(pass).equals(String.valueOf(pwd))&& String.valueOf(id).equals(String.valueOf(accountid))){
           return true;
       }
       else
           return false;
   }
    public int addReservation(int nofseats,int tofseats){
      
        if(tofseats==1 && Reservation.getRegular_seats()!=0 ){
         Reservation r =new Reservation(nofseats,tofseats);
            listOfReservations.add(r);
            System.out.println("Your Reservation Code: "+r.getReservationcode());
         return r.getReservationcode();
            
      }
        if(tofseats==2 && Reservation.getFirstclass_seats()!=0 ){
         Reservation r=new Reservation(nofseats,tofseats);
            listOfReservations.add(r);
            System.out.println("Your Reservation Code: "+r.getReservationcode());
         return r.getReservationcode();
      } 
        else{
            System.out.println("Sorry we dont have any this type of seats");
            return 0;
        }
        
         
 
     
    
}
    public void displayReservation(int rcode){
        Reservation res = findReservationWithGivenReservationCode( rcode);
        if(res!=null){
            System.out.println(res.toString());
        }
            
        else{
            System.out.println("There is no such reservation with this reservation code "+rcode);
        }
            
    }

        
    private Reservation findReservationWithGivenReservationCode(int rcode){
        Reservation res = null;
        for(int i=0;i<listOfReservations.size();i++){
           Reservation r = listOfReservations.get(i);
           if(r.getReservationcode()==rcode){
               res = r;
           }
       }
        return res;
    }
    
    public void cancelReservation(int pass,int id){
        Login(pass, id);
        System.out.println("Please enter reservation code"); 
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        Reservation res = findReservationWithGivenReservationCode( x);
        if(res!=null){
            res.cancelMe(res.getNumberofseats(), res.getTypeOfSeats());
            listOfReservations.remove(res);
            System.out.println("Your reservation canceled ");
        }
            
        else{
            System.out.println("There is no such reservation with this reservation code "+x);
        }
            
           
        }

} 
        
        
    
    