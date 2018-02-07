import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        teeValik();

    }
    public static void teeValik() {
        boolean veel = true;
        Scanner vastus = new Scanner(System.in);
        while (veel){
            System.out.printf("Programm muutab mõõtühikud, selleks , et" + '\n' + "KG>Pound sisesta 1" + '\n' + "Pound>KG sisesta 2" + '\n' + "kw>hp sisesta 3" + '\n' + "hp>kw sisesta 4" + '\n' + ": ");
            int v = vastus.nextInt();
            if (v > 4 || v < 1){
                System.out.println("Sellist valiku puudub, proovi veel");
            }
            else{
                System.out.printf("Sisesta konverteeriva arvu: ");
                int s = vastus.nextInt();
                vastus.close();
                if ( v == 1){
                    float t = (float) s * (float) 2.204622;
                    System.out.println(s + " kg on " + t + " naela");
                }
                else if( v == 2 ) {
                    float t = (float) s / (float) 2.204622;
                    System.out.println(s + " naela on " + t + " kg");
                }
                else if( v == 3 ) {
                    float t = (float) s * (float) 1.34102;
                    System.out.println(s + " kw on " + t + " hp");
                }
                else if( v == 4 ) {
                    float t = (float) s / (float) 1.34102;
                    System.out.println(s + " hp on " + t + " kw");
                }
                 veel = false;
            }
        }

    }

}
