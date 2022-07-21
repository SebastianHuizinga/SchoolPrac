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
public class comparenumchars {

    public static void main(String[] args) {

        String wrd1 = JOptionPane.showInputDialog("eaaaaaaaaaaaaaaaaaaaa");
        String wrd2 = JOptionPane.showInputDialog("eayaaaaaaaaaaaaaaaaah");

        int wrd1_lonk = wrd1.length();
        int wrd2_lonk = wrd2.length();

        if (wrd1_lonk > wrd2_lonk) {

            System.out.println(wrd1 + " then " + wrd2);

        } else if (wrd1_lonk < wrd2_lonk) {
            System.out.println(wrd2 + " then " + wrd1);
        } else {
            System.out.println("they equal lonk");
        }

    }
}
