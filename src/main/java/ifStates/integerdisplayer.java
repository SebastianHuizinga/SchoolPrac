/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifStates;

import javax.swing.*;

/**
 *
 * @author sebastianh
 */
public class integerdisplayer {

    public static void main(String[] args) {
        int numinput = Integer.parseInt(JOptionPane.showInputDialog("enter num"));

        if (numinput < 0) {
            System.out.println(numinput + " is negative ");
        } else {

            System.out.println(numinput + " is positive ");

        }

        if (numinput % 2 == 0) {

            System.out.println(numinput + " is even");

        } else {
            System.out.println(numinput + " is odd");
        }

        if (numinput % 7 == 0) {
            System.out.println(numinput + " is a mutliple of 7");

        } else {
            System.out.println(numinput + " is not a multiple of 7");
        }

    }
}
