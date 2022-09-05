/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pracs;

import it.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class HCF {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("num 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("num 2"));

        int hcf = 0;

        for (int i = 0; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;

            }
            System.out.println(hcf);

        }

    }
}
