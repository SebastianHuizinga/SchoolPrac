package Moth;
import javax.swing.*;
  public class SumOfInt{

   public static void main(String[]args){
   
   String loopnum = JOptionPane.showInputDialog("  HOOOW MANY NUMBAAAAAAAAHHHHHHHHHHHHS");
    int loopies = Integer.parseInt(loopnum);

   double total = 0;
   for (int i = 0; i<= loopies; i += 1){
     String input = JOptionPane.showInputDialog("GIVE ME NUMBAAS");
      int innput = Integer.parseInt(input);
      total += innput;

   }

   System.out.println("the sum is " + total);
   
   System.out.println("the arvage is " + total/loopies);


   }
}