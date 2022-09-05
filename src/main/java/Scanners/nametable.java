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
public class nametable {

    public static void main(String[] args) {

        //john 50 simon 24 pete 66 allen 21
        //initiialise
        File file = new File("nametable.txt");
        Scanner fileSc;
        try {
            fileSc = new Scanner(file).useDelimiter("#");

            //test
            while (fileSc.hasNext()) {

                //get the line string
                //make a line scanner
                //split the line
                Scanner fileLine = new Scanner(fileSc.nextLine()).useDelimiter("#");
                String name = fileLine.next();
                String pass = fileLine.next();
                System.out.println("|name|: " + name + " |password|: " + pass);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Oldest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
