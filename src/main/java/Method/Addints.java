/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

import it.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class Addints {

    public static void main(String[] args) {

        int sum = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Put in number or slumber"));

        while (num != -99) {
            sum += num;

            num = Integer.parseInt(JOptionPane.showInputDialog("Put in number or slumber"));

        }

        System.out.println("hey look at that sum wowie " + sum);

    }

}
