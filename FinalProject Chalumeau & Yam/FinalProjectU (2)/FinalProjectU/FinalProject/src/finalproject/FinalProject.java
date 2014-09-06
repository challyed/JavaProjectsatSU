/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author echalume
 */
public class FinalProject   {
    public String Lname;
    public String Fname;
    public String Pyear; 
    public String Stats;

   public  FinalProject (String Lname, String Fname,String Pyear,String Stats ) {
        this.Lname = Lname;
        this.Fname = Fname;
        this.Pyear= Pyear;
        this.Stats= Stats;
    }
    public String getFname() {
        return Fname;
    }

    // setter method for FirstName
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    
    // getter method for LastName
    public String getLname() {
        return Lname;
    }

    // setter method for LastName
    public void setLname(String Lname) {
        this.Lname = Lname;
}
        public String getPyear() {
        return Pyear;
    }

    // setter method for FirstName
    public void setPyear(String Pyear) {
        this.Fname = Pyear;
    }

    
    // getter method for LastName
    public String getStats() {
        return Stats;
    }

    // setter method for LastName
    public void setStats(String Stats) {
        this.Stats = Stats;
}
}

