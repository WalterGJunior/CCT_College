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
package Bike;

/**
 * @author Walter Guimaraes Junior / Student Number: 2020403
 */
public class bicycle {
    //Declaring the properties that is required to create a Bicyle (Size and Color)
    private String colour;
    private int size;
    
    //Creating an Constructor passing by Parameters the properties from the Bike.
    public bicycle(String colour, int size){
        
        this.colour = colour;
        this.size = size;
        
    }
    
    // Creating an Method that will show a message to the user which all the informations about every bikes with their colours and sizes.
    public void cycleBike(){

        System.out.println("I am cycling the Bike -> Color: " + " " + this.colour + " and Size: " +  this.size);
        
    }


}
