package Moth;
import it.*;
import javax.swing.*;
import java.awt.*;

public class Shop{
      public static void main(String[]args){
      
  double num1, num2, num3, total;
   String input1, input2, input3;

    input1 = JOptionPane.showInputDialog("How many coca colar");
    input2 = JOptionPane.showInputDialog("How many chocloot yummy oo yeah");
    input3  = JOptionPane.showInputDialog("How many water are buying?");

    num1 = Double.parseDouble(input1);
    num2 = Double.parseDouble(input2);
    num3 = Double.parseDouble(input3);
    total = (num1 * 13.80) + (num2 * 12.00) + (num3 * 9.50);
    
    System.out.println("your total is R" +  total);
    
 
       

      
      
      
   }
}