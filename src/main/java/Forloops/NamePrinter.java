/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forloops;

import javax.swing.*;

/**
 *
 *
 * @author sebastianh
 */
public class NamePrinter {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("what is your name");
        int name_length = name.length();

        int name_num = 0;

        for (int i = 0; i < name_length; i++) {
            System.out.println(name.charAt(name_num));
            name_num += 1;

        }

    }

}
