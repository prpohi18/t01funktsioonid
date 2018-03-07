package homework1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        //int raadius = 5;
        System.out.println("Sisesta raadius sentimeetrites: ");
        Scanner input = new Scanner(System.in);
        double raadius = input.nextInt();
        
        double diameeter = 2 * raadius;
        double ymbermoot = 2 * 3.14 * raadius;
        System.out.println("Kui ringi raadius on " + raadius + " cm siis diameeter on " + diameeter + " cm ning ümbermõõt on " + ymbermoot + " cm.");
    }
}
/*run:
Sisesta raadius sentimeetrites: 
4
Kui ringi raadius on 4.0 cm siis diameeter on 8.0 cm ning ümbermõõt on 25.12 cm.
BUILD SUCCESSFUL (total time: 10 seconds)*/
