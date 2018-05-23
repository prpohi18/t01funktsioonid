package kodune;
import java.util.Scanner;
            /*
            *  Programm mis arvutab ringi raadiuse ja ümbermõõdu
            */
public class Kodune {
    
        public static void main(String args[]){
            
            //küsib raadiuse
            Scanner scan = new Scanner(System.in);
            System.out.print("Sisesta ringi raadius: ");
            double r = scan.nextFloat();
            
            //pindala arvutus
            double S = Math.PI * (r * r);
            
            
            //ringi ümbermõõdu arvutamine
            double C = Math.PI * 2 * r;
            
            
            //kotrollib, raadius ei oleks negatiivne
            if(r<=0){
                System.out.println("Raadius peab olema suurem kui 0!");
            } else {
                System.out.println("Ringi pindala on: " + Math.round(S));
                System.out.println("Ringi ümbermõõt on: " + Math.round(C));
            }
        }
 
    
}
