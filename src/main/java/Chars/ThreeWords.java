package Chars;
import javax.swing.*;
public class ThreeWords
{
   public static void main(String[]args){
   
   String word1, word2, word3;
   int total;   
   
    word1 = JOptionPane.showInputDialog("Please enter your first word");
    word2 = JOptionPane.showInputDialog("Please enter your second word");
    word3 = JOptionPane.showInputDialog("Please enter your third word");
    
    System.out.println("The number of digits in " + word1 + " is "  + word1.length());
      System.out.println("The number of digits in " + word2 + " is "  + word2.length());
        System.out.println("The number of digits in " + word3 + " is "  + word3.length());
         total = ( word1.length() + word2.length() + word3.length());
          System.out.println("The total number of digits in all words is " + total );

    

    

    
   }
}
         
  