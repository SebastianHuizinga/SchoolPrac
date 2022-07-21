package Moth;
public class RandNum{
   public static void main(String[]args){
   
   
 //3 13  the range is 10 so you would add 11
 //int num = (int)(Math.random()*11+3);
 
 //2 6  the range is 4 so you would add 5
// int num = (int)(Math.random()*5+2);
 
 
 //4 8 the range is 4 so you would add 5
 // int num = (int)(Math.random()*5+4);
 
  int num1 = (int)(Math.random()*1000 +0);
char num2 = (char)(Math.random()*26 +65);
char num3 = (char)(Math.random()*26 +65);
char num4 = (char)(Math.random()*26 +65);




  
 System.out.println("Your lucky number of today is " + num1);
  System.out.println("Your lucky letters are " + num2  + " " +  num3 + " " + num4);
 
 
 
 
 
 
 
      }
   }