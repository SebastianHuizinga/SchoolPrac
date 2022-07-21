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
public class driving {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));

        if (age < 18) {
            System.out.println("too young");
        } else if (age > 75) {
            System.out.println("too old");
        } else {

            System.out.println("you may drivong");
        }

    }
}
