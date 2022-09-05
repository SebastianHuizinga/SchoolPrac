/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class Oldest {

    public static void main(String[] args) {

        //john 50 simon 24 pete 66 allen 21
        //initiialise
        File file = new File("names.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);

            sc.useDelimiter(" ");

            String highest_name = " ";
            int highest_age = 0;

            //test
            while (sc.hasNext()) {
                String name = sc.next();
                int age = sc.nextInt();

                if (age > highest_age) {
                    highest_age = age;
                    highest_name = name;

                }

            }

            System.out.println("the oldest is " + highest_name + " who is " + highest_age);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Oldest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
