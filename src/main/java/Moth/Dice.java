/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moth;

import it.*;

/**
 *
 * @author sebastianh
 */
public class Dice {

    public static void main(String[] args) {
        int dinum = 0;

        while (dinum != 6) {
            dinum = (int) (Math.random() * 6 + 1);
            System.out.print(" " + dinum);

        }

    }

}
