/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author SebastianH
 */
public class EpicGaming2 {

    public static int totalEggs = 25;
    public static int dailyPower = 0;
    public static int highPower = 0;
    public static int highDay = 0;
    public static int numEggs = 0;

    public static int generateRandNum(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static void oneDay() {
        int numEggs = generateRandNum(2, 9);
        if (numEggs > totalEggs) {
            numEggs = totalEggs;
        }

        totalEggs -= numEggs;
        System.out.println("Total Eggs;" + totalEggs + "\n" + " Eggs hatched for the day " + numEggs);
        int i = numEggs;
        int totalPower = 0;
        for (int j = 1; j < numEggs; j++) {
            int randnum = generateRandNum(1, 4);
            int eggPower = 0;
            String eggType = "";

            if (randnum == 1) {
                eggType = "Elf";
                eggPower = 430;
            }
            if (randnum == 2) {
                eggType = "Vampire";
                eggPower = 320;
            }
            if (randnum == 3) {
                eggType = "Zombie";
                eggPower = 175;

            }
            totalPower += eggPower;
            dailyPower = totalPower;

            System.out.println("Egg " + j + "  Type  " + eggType + " EggPower: " + eggPower);

        }
        System.out.println("Total power for the day  " + totalPower + "\n");

    }

    public static void main(String[] args) {

        int day = 0;
        for (int l = 1; l < 8; l++) {
            day += 1;
            System.out.println(" Day: " + day);
            oneDay();
            if (highPower < dailyPower) {
                highPower = dailyPower;
                highDay = day;
            }

            if (totalEggs == 0) {
                System.out.println("No eggs");
                break;

            }

        }
        System.out.println("highest power is " + highPower + ' ' + "on Day:  " + highDay);

    }

}
