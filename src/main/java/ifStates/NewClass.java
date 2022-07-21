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
public class NewClass {

    public static void main(String[] args) {
        int numinput1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your first number"));
        int numinput2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second number"));

        if (numinput1 > numinput2) {
            System.out.println(numinput1 + " is bigger");

        } else if (numinput1 < numinput2) {
            System.out.println(numinput2 + " is bigger");
        } else {
            System.out.println(numinput1 + " and " + numinput2 + " are equal ");
        }

    }

}
