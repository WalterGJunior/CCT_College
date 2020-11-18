/*
 Higher Diploma in Science in COmputing - CCT College Dublin
 Software Development - Ken Healy

--> Create a new Java Class called “Bicycle”
    Add TWO properties following best practice. The properties should be (i) colour – this is text, and (ii)
    size - this is an integer
    
    Add a constructor to the class that will create a new bicycle based on a colour and a size passed as
    parameters

    Add a method called cycleBike() that will output a message saying “I am cycling the <colour here>
    bike”

    Now create a main class called BikeShop in the same project. Add some code to create 5 bicycles by
    asking the user for the colour and the size of the bicycle. The validation rules are:
    The colour must be text (you do not have to check that it is a real colour!)
    The size must be a number between 16 and 30
    If invalid data is entered, output a useful error message. 
 */
package bikeshop;
import Bike.*;

import Utilities.InputUtilities;
import java.util.Scanner;


/**
 * @author Walter Guimaraes Junior / Student Number: 2020403
 */
public class BikeShop {

    public static void main(String[] args) {
        
        // Declaring the variables(Color and Size) that will be used to create the Bicycle
        String colour;      
        int size;
        int array;
        
        try{
            
            Scanner myKB = new Scanner(System.in); 
            
            System.out.println("How many bikes do you need?");
            array = myKB.nextInt();
            //Creating a List of 5 Bicylce 
            bicycle[] bikelist = new bicycle[array]; 
            
            //Asking the user about the informations from their Bike and saving it in a List 
            // as well as doing the validation from the Class InputUtilities
            for (int i = 0; i < bikelist.length; i++) {
                colour  = InputUtilities.getUserText("#Please# 1 - Enter which the color of your Bicycle...");
                size = InputUtilities.getUserInt("#Please# 2 - Inform the size of your Bike", 16, 30);
                bikelist[i] = new bicycle(colour,size);//Creating a list with the values informed by the user.
            }
            
            for (bicycle b: bikelist){
            //Calling the method cycleBike() and showing the message to the user with the color and size of each bike
            b.cycleBike();
            
        }
                     
            
        }catch(Exception e){
            //If happens any unespected error the system will show a error message
            System.out.println("Error Invalid data!!!");
        }    
 
    }
}
