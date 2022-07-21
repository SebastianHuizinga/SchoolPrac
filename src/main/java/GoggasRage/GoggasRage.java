package GoggasRage;

import it.*;
import java.awt.*;
public class GoggasRage{



   public static void main(String [] args){
      Gogga bug = new Gogga();
      
      bug.setPosition(1,5);
      
      bug.setColor(Color.blue);
      
      //Ledder S
      bug.move();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.move();
      bug.move();
      bug.turnRight();
      bug.setPosition(1,5);
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.LEFT);
      bug.move();
      bug.move();
      
      bug.setColor(Color.green);
      
      //Ledder E
      bug.setPosition(4,2);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setPosition(4,5);
      bug.move();
      bug.move();
      bug.setPosition(4,2);
      bug.move();
      bug.move();
     
     
      //ledder B
      bug.setPosition(7,2);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setPosition(9,2);
      bug.setDirection(Gogga.LEFT);
      bug.move();
      bug.move();
      bug.setPosition(9,2);
      bug.setDirection(Gogga.DOWN);
       bug.move();
        bug.move();
         bug.move();
          bug.move();
           bug.move();
      
  
      
      
  
       
  
            
   }
}