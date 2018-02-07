package kodutoo1;
import java.util.Arrays;

public class Kodutoo1 {
    // Funktsioon arvutab massiivis olevate paarisarvude summa
    public static void parvude_summa(int[] arvud) {
        int summa = 0;
        for (int arv: arvud) {
            if (arv % 2 == 0) {
                summa += arv;
            } 
        }
        if (summa == 0) {
            System.out.println("Massiivis polnud ühtegi paarisarvu!");
        } else {
            System.out.println("Sain kokku: " + summa);
        }
    }
    
    public static void main(String[] args) {
        int[] suvaArvud = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] veelArve = {1, 3, 33, 55, 21, 9};
        parvude_summa(suvaArvud);
        parvude_summa(veelArve);
    }
}
/* --Väljund--
Sain kokku: 30
Massiivis pold ühtegi paarisarvu!
*/

