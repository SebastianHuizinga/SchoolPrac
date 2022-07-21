/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifStates;

/**
 *
 * @author sebastianh
 */
import javax.swing.*;

public class ifstates {

    public static void main(String[] args) {
        double order = Double.parseDouble(JOptionPane.showInputDialog("Enter price"));

        if (order > 100.0) {
            order = order - order * 0.1;
            System.out.println("your order price is  " + order);
        } else {

            System.out.println("your order price is  " + order);
        }

    }

}
