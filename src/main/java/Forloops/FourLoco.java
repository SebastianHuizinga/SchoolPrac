/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forloops;

/**
 *
 * @author sebastianh
 */
public class FourLoco {

    public static void main(String[] args) {

        int numtotal;
        numtotal = 0;

        for (int i = 12; i >= 1; i--) {
            int num = 3 * i;

            int num2 = num % 5;
            if (num2 == 0) {
                System.out.println(num);

            }

        }

    }

}
}

}
