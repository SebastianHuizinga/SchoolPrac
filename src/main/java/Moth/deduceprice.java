/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moth;

/**
 *
 * @author sebastianh
 */
public class deduceprice {

    public static void main(String[] args) {

        //initilastion (before loop
        int price = 200;

        //sect 1
        int days = 1;

        while (price > 100) { //test condition
            price -= 8;    //change - increment
            days++;  //calclatoins (things to be repeatedd

        }
        System.out.println("it will take " + days + " days "); //post processing after loop
        System.out.println(price);
    }
}
