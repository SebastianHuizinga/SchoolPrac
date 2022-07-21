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
public class Swopong {

    public static void main(String[] args) {

        int temporay;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter number 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter number 2"));
        temporay = num1;
        num1 = num2;
        num2 = temporay;

        System.out.println("swop " + num1 + " " + num2);

    }

}
