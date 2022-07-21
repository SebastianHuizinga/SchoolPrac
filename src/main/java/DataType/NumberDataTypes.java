package DataType;

import javax.swing.JOptionPane;

public class NumberDataTypes{

   public static void main (String args[]){
   
      String numog = JOptionPane.showInputDialog("How many numbers do you wish to add?");
      
            int num = Integer.parseInt(numog);

   
   
   
   for(int i = 0; i < num; i++){   
      String input1 = JOptionPane.showInputDialog("Please enter your first number");
        int int1 = Integer.parseInt(input1);

      
      
      
      
      
      
      
      //String input3 = JOptionPane.showInputDialog("Enter choice please select +, -, /, or *");
         
      //int int2 = Integer.parseInt(input3);
      
     // if(input3.equals("+")){
        // System.out.println("The answer is " + ( int1 + int2));   
     // }
   
     // if(input3.equals("*")){
         //System.out.println("The answer is " + ( int1 * int2));
     // }
      
      //if(input3.equals("/")){
         //System.out.println("The answer is " + ( int1 / int2));
     // }
      
      //if(input3.equals("-")){
         //System.out.println("The answer is " + ( int1 - int2));
      //}
   //}
 
   
  
    }
   }