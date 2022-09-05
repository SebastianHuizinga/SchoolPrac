/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misc;

import it.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class CheckSecret {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive integer"));
        if (num % 2 == 0 && num % 7 == 0) {
            System.out.println("yeah man");

        }

    }

}
