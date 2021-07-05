/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg215se2299project1cse112;

/**
 *
 * @author atila
 */
public class Password {
     private int password;
    
     
     public Password (int pass){
         
         if(isValid(pass)){
            this.password = pass;
             System.out.println("your password is strong,");
         }
         else{
             
             pass = 123456;   // i didnt do random generate,
         System.out.println("your password is weak , your generated password is= "+ pass);
         
         }
    
     }
     public boolean checkPassword(int pwd){
        return String.valueOf(password).equals(String.valueOf(pwd));
    }
     
      
      
      private boolean isValid(int p){
        int pnumber1=p/100000;
         int pnumber2=(p/10000)%10;
         int pnumber3=(p/1000)%10;
         int pnumber4=(p/100)%10;
         int pnumber5=(p/10)%10;
         int pnumber6=p%10;
          if(pnumber1==0 || pnumber1==pnumber2 || pnumber2==pnumber3 || pnumber3==pnumber4 || pnumber4==pnumber5 || pnumber5==pnumber6){
             
              return false;
             
         }
          else{
              return true;
          }
             

}   
          public void resetPassword(int pwd){
        if(isValid(pwd)){
            password = pwd;
            System.out.println("Your new Password is "+ pwd);
        }
    }
}
