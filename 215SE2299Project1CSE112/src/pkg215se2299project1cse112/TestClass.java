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
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For Reservation class type of seats,i used 1 for regular seats and 2 for first class seas
       
        
        Passanger p=new Passanger("Atila", "kadıköy", "5327174736", 134256);
       
       
       p.addReservation(3, 1); // adding reservation
       
       p.displayReservation(2); //displaying reservation
       
       p.cancelReservation(134256, 1000); // canceling reservation
      
       // making sure reservation canceled with given reservation code
       
      
         p.displayReservation(2);
        
        
        
    }
}
    

