package Kodutoo;

import java.util.Scanner;

public class Kodutoo {
    
    public static void main(String[] args) {
        
        double height = 0.0;
        double weight = 0.0;
        double bmi = 0.0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("funktsioon aitab arvutada kehamassiineksit.");
        
        System.out.print("Pikkus(cm): ");
        height = s.nextInt();
        System.out.print("Kaal(kg): ");
        weight = s.nextInt();
        
        bmi = ((weight)/(height/100 * height/100));
        
        
        System.out.printf("Sinu kehamassiindeks on %f\n", bmi);
        
        System.out.println("Kehamassiindeksi vahemikud");
        System.out.println("Alakaal > 18.9");
        System.out.println("Normaalkaal 19 - 25 ");
        System.out.println("Ülekaal < 25.1");   
    }
}

/*funktsioon aitab arvutada kehamassiineksit.
Pikkus(cm): 187
Kaal(kg): 76
Sinu kehamassiindeks on 21.733535
Kehamassiindeksi vahemikud
Alakaal > 18.9
Normaalkaal 19 - 25 
Ülekaal < 25.1*/