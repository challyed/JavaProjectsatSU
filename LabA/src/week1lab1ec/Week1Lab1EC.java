/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week1lab1ec;

/**
 *
 * @author echalume
 */
public class Week1Lab1EC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        //declare variables 
        int qty;
        double shoe, taxrate, subtotal, taxamount, total ;
        qty = 99;
        shoe= 49.99;
        taxrate = 0.08;
        subtotal = 0.00;
        taxamount = 0.00; 
        total = 0.00 ;
        //mathstuff
        subtotal = qty * shoe;
        taxamount = subtotal * taxrate;
        //print statements 
        System.out.println("Product Desc: Footwear ");
        System.out.println("Quanitiy: " +qty);
        System.out.println("Price: " +shoe);
        System.out.println("Subtotal: " +subtotal);
        System.out.println("Sales Tax: " +taxamount);
        
        /*
 Product Desc: Footwear 
 Quanitiy: 3
Price: 49.99
Subtotal: 149.97
Sales Tax: 11.9976

Product Desc: Footwear 
Quanitiy: 54
Price: 49.99
Subtotal: 2699.46
Sales Tax: 215.95680000000002

Product Desc: Footwear 
Quanitiy: 99
Price: 49.99
Subtotal: 4949.01
Sales Tax: 395.92080000000004
         */
    }
}
