/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class Details {

    public static void main(String[] args) {

        String details = JOptionPane.showInputDialog("Please enter name,ID, height (in m) and whether you smoke or not (true/false)");
        Scanner sc = new Scanner(details);
        sc.useDelimiter(" ");

        String name = sc.next();
        int id_num = sc.nextInt();
        double height = sc.nextDouble();
        String smoke = sc.next();

        System.out.println("Name: " + name + "\n ID: " + id_num + "\n height: " + height + "m \n smokes: " + smoke);

    }
}
