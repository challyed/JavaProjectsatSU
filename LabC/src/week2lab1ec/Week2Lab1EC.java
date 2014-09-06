/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week2lab1ec;

/**
 *
 * @author echalume
 */
public class Week2Lab1EC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /*Declare a variable of type boolean to represent whether 
        an additional discount needs to be applied if the buyer is a veteran.
            */
    boolean is_a_vet;
    /*Declare a variable of type double to
    hold the discount percentage if buyer is a vet.
    */
    double add_vdis;
    /*3 variables to hold the price of a shoe for 
    3 levels based on quantity of sale 
    */
    double regular, level_1, level_2;
    /*3 variable to hold the quantities used for the discount levels above*/
    double pregular, d_level_1, d_level_2;
    /*a variable to hold the number of 
      pairs of shoes ordered ie quantity of sale 
   */
    int num_of_pairs;
    
    is_a_vet= false;
    num_of_pairs = 44;
    regular = 15; 
    level_1 = 30;
    d_level_1=.90;
    level_2 = 45;
    d_level_2=.14;
    add_vdis = .5; 
   pregular=0;
    
    
    /*Use the standard price if the quantity of shoes bought 
    is less than the first discount level
   */
            if(num_of_pairs < level_1){
        pregular = regular * num_of_pairs;
    }
    
    /*Use the discount level 1 price if the quantity of shoes bought is less 
            than the 2nd  discount level but greater than or equal to the 
            first discount level quantity */
   
        if (num_of_pairs >= level_1 && num_of_pairs < level_2){
        pregular = (regular * num_of_pairs) * d_level_1 ;
        }
        
        /* Apply a final discount if the buyer is a veteran
         */
        if ( is_a_vet== true){
        pregular= pregular*add_vdis;
        }
     System.out.println("Number of Shoes Sold: " +num_of_pairs);
     System.out.println("Pair per Price: " +regular);
     System.out.println("Sale Amount: " +num_of_pairs*regular);
     System.out.println("Veteran Discount: " +add_vdis );
     System.out.println("Finalamountdue: " +pregular );
            
    }
}
