/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moth;

import it.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class calcaltor {

    public static void main(String[] args) {

        int good_num = 1;
        System.out.println("WELCOME TO WALMORT");

        //initial section (beofre loop0
        double pricetotal = 0;
        double price = Double.parseDouble(JOptionPane.showInputDialog("Price of good"));

        while (price != -10) { //test condition

            System.out.println("Price of good number " + good_num + " is " + price);

            //calclatoins (things to be repeatedd
            pricetotal += price;
            price = Double.parseDouble(JOptionPane.showInputDialog("Price of good")); //change - increment

            good_num++;

        }
        //Post processing section (once after)
        System.out.println("Moneuy is " + pricetotal);

    }

}
