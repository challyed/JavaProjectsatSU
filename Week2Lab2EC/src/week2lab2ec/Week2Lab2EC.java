/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week2lab2ec;

/**
 *
 * @author Edwin
 */
public class Week2Lab2EC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Declare a variable of type int named temperature and assign it an initial value of 75 . 
        int temperature=57;
        //declare a variable of type String named weather and assign it an initial value of an empty string 
        String weather= "";
        //Below 32
        if(temperature<=32){
            weather="freezing"; 
        }
        //Between 32 and up to 45 
        else if(temperature>32 && temperature<=45){
            weather="cold"; 
        }
        //Between 46 and up to 55
        else if(temperature>46 && temperature<=55){
            weather="cool"; 
        }
        //Between 56 and up to 65
        else if(temperature>56 && temperature<=65){
            weather="mild"; 
        }
        //Between 66 and up to 75
        else if(temperature>66 && temperature<=75){
            weather="warm"; 
        }
        //76 and above
        else if(temperature>=76){
            weather="hot"; 
        }
        System.out.print("If the temperature is " +temperature); 
        System.out.print (" then the weather is " +weather);
    }
    //Test
   /*If the temperature is 100 then the weather is hot
    If the temperature is 67 then the weather is warm
    
    If the temperature is 57 then the weather is mild
    
    
    
    
    */ 
}
