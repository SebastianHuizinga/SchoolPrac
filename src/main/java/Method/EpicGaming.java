/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author sebastianh
 */
public class EpicGaming {

    public static int generateRandNum(int low, int high) {
        return (int) (Math.random() * high - low + low);

    }

    public static int getBossHP(int multiplier, int level) {
        return 50 + level * multiplier * 10;

    }

    public static int getTotalAtk(int bossMaxHp) {
        int total_atk = 0;

        for (int i = 1; i <= 4; i++) {

            int atk_type = generateRandNum(1, 6);
            int atk_dmg = 0;
            String atk_type_str = "";

            if (atk_type == 1) {
                atk_type_str = "Miss";
                atk_dmg = 0;
            } else if (atk_type == 2) {
                atk_type_str = "Normal";
                atk_dmg = 2 * 15;
            } else if (atk_type == 3) {
                atk_type_str = "Normal";
                atk_dmg = 3 * 15;
            } else if (atk_type == 4) {
                atk_type_str = "Normal";
                atk_dmg = 4 * 15;
            } else if (atk_type == 5) {
                atk_type_str = "CRIT";
                atk_dmg = bossMaxHp / 2;

                total_atk = +atk_dmg;

            }
            System.out.println("Attack number " + i + " was a " + atk_type_str + " hit and did " + atk_dmg + " damage");
            total_atk += atk_dmg;

        }

        return total_atk;
    }

    public static void main(String[] args) {

        for (int level = 1; level < 11; level++) {

            int multi = generateRandNum(1, 4);

            int hp = getBossHP(multi, level);
            int max_hp = hp;

            int total_atk = getTotalAtk(max_hp);

            hp = hp - total_atk;

            System.out.println(" You did " + total_atk + " damage.  WOW! ");

            if (hp <= 0) {
                System.out.println(" You killed that guy! ");
                System.out.println(" Bossman has 0 remaining");

            } else if (hp > 0) {
                System.out.println(" Awww man you lost ");
                System.out.println(" Bossman has " + hp + " remaining");
            }

            System.out.println("");
            System.out.println("");

        }

    }
}
// \\
//   \\
//-_-\\
//  O  \\
//-------\\
//--||--\\
//   ||    \\

//spaceship
