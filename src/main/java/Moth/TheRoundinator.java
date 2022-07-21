package Moth;
import javax.swing.*;
public class TheRoundinator{
   public static void main(String[]args){
   
      double num1;
      String input;
       input =  JOptionPane.showInputDialog("Please enter your number");
       
         num1 =  Double.parseDouble(input);
         num1 = num1 * 100;
         num1 = Math.round(num1) ;
         System.out.println(" The number rounded to 2 decimal place is " + num1/100);
      
      }
   }