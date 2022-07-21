package Moth;

import javax.swing.*;
public class Getmid{
   public static void main(String[]args){
   
   String word1;
   int wordlong, mid;

  
   word1 = JOptionPane.showInputDialog("What is your word");
   
   wordlong = word1.length();
   mid = wordlong / 2;

   System.out.println(word1.charAt(mid));
 
   
   
 }
}