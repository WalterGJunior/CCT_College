/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class InputUtilities {
     /*
       Some useful methods for gettong input from the user
    */
    
    /**
     * 
     * @param prompt -- message/request made to user
     * @return - the text entered by the user
     */
    public static String getUserText(String prompt){
        
                
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        
        
            //if input is not text, ask again
                        
            System.out.println(prompt); //output prompt
             boolean valid = false;
            try{
              do{
                   userInput = myKB.readLine(); //read input
                   //This validation is to make sure that the user it is just writing letters and not numbers
                   if(!userInput.matches("[a-zA-Z]+")){
                      System.out.println("ERROR: You should not use numbers... Try Again...");
                      System.out.println("#Please# 1 - Enter which the color of your Bicycle...");
                   }
                   
                }while (!userInput.matches("[a-zA-Z]+"));
                  //System.out.println("ERROR: You should not use numbers... Try Again...");
                
            }
            catch(Exception e){
                
                System.out.println("Input error!");
                userInput = ""; //set it to nothinig if invalid
            }
             
        
        
        //userInput must be text
        
        return userInput;
        
    }
    
    /**
     * 
     * @param prompt -- message/request made to user
     * @param minValue - the minimum value that is valid
     * @param maxValue - the max value that is valid
     * @return - a valid int entered by user
     */
    public static int getUserInt(String prompt, int minValue, int maxValue){
        
        
          BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
           
          int userInput=0;
           
          boolean valid = false; 
           
           do{
             //prompt user for input - if not integer - output error and ask again
               System.out.println(prompt); //output prompt
               System.out.println("You must enter a value between " + minValue + " and " + maxValue );
               
            try{
                do{
                    userInput = Integer.parseInt(myKB.readLine()); //read input
                    valid = true;
                    
                    //Validating the number inputed by the user
                    // as well as show a useful error message
                    if(userInput< 16 || userInput > 30){
                        System.out.println("Number Invalid!! You have to Inform a number between 16 and 30...");
                    }
                
                }while(userInput < 16 || userInput > 30);
            }
            catch(Exception e){
                
                System.out.println("ERROR: That is not a number. Please try again");
                //valid stays false
            }
            
            //not valid if < minValue or > maxValie
        }while ( (!valid) || (userInput < minValue) || (userInput > maxValue));
           
           //must be valid and within the range
           return userInput;
           
    }
    
    
}
