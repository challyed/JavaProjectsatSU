JavaProjects
============
View by using Netbeans

Final Project
===
In a group of two create a desktop application for our community service fraternity. The purpose of the application is to be a type of directory for people to use.  



The first thing the user will do is open the file. There are 3 ways that we can do this. We can either use a drop down menu or use a radio group/button. The final way will allow the user to pick what family line file they would want to view.  It will also have that error message if something bad happens. 

//quick code made in a text editor 
import java.io*
Scanner s = null;
        try {
            
            JFileChooser fc = new JFileChooser();
            
            int retval ;  
            
            File txtfile ;
            
            // open file chooser
            retval = fc.showOpenDialog(null) ;

    

            // we need to know if the user clicked open or save
            if (retval == JFileChooser.APPROVE_OPTION) {
                txtfile = fc.getSelectedFile() ;  // get file selected
            }    
            else {
                
                javax.swing.JOptionPane.showMessageDialog(null, "No file was selected program exited.");
                return ;
            }

            // read the contents of this file 
            FileReader fr = new FileReader(txtfile)  ;
            
            BufferedReader bufr = new BufferedReader(fr);
            
          
        }
        catch (IOException e)   {
            // print any error messages
            System.out.println(e.getMessage());
            
            javax.swing.JOptionPane.showMessageDialog(null, "Unknown Family");
        }

        finally  {
            if (s != null)  {  s.close(); }
        }
        
    }




Then the list will load into one of the GUI objects. We could do separate jtextfield that would load the data or put it in one huge list. They can click on someone’s name which will display a picture and some information about the person.


 //quick code made in a text editor   
 jTextField#.setText(Lastname);
    jTextField#.setText(Name);
    jTextField#.setText(PledgeClass);
    jTextField#.setText(Gyear);
    //or it we are going it into a box
    jTextField#.setText(Lastname,Name,PledgeClass,Gyear);





After, you can sort the file via the year they leave Syracuse University, when they entered the fraternity and name. This would be in a radio group. 


// This is an example of what we want to do & /quick code made in a text editor 
import java.util.Arrays;

public class testsort {
	public static void main ( String [] args){
		String [] stnameofpeopleofhe = new String[5];
		
	}
	Arrays.sort(stnameofpeopleofhe);
	

for (int i=0;i<peopleofhe.length; i++){
	//Print String to j_text_feild
    //jTextField#.setText(stnameofpeopleofhe);
	
}



 
Finally when the user presses “Print File” The file will print an html document. The user will also be able to clear the program. 
