package kolmnurk;
import java.util.Scanner; 
/**
 * @author Anu
 */
public class Kolmnurk {
    //ümbermõõdu arvutus
    public static float arvutus1(float a, float b, float c){
        float p = a + b + c;
	return p;
    }
    //pindala arvutus
    public static float arvutus2(float a, float b, float c){
        //võtan aluseks Heroni valemi
        float p = a + b + c;
	float t = p/2;
	float s = t*(t-a)*(t-b)*(t-c);
	return s;
    }
    
    public static void main(String[] args) {
        float a, b, c;
        //loeb, mida kasutaja sisestas
 	Scanner scan = new Scanner(System.in);
 	System.out.print("Sisesta kolmnurga esimene külg [cm]: ");
 	a = scan.nextFloat();
 	System.out.print("Sisesta kolmnurga teine külg [cm]: ");
 	b = scan.nextFloat();
 	System.out.print("Sisesta kolmnurga kolmas külg [cm]: ");
 	c = scan.nextFloat();
        
        //rakendab arvutused
        float p = arvutus1(a ,b ,c);
 	float s = arvutus2(a, b, c);
        
        if (s<=0){
            System.out.println("Tegemist pole kolmnurgaga või pole lihtsalt võimalik arvutada...");
        } else {
            System.out.println("Kolmnurga ümbermõõt on "+ (Math.round(p)) + " sentimeetrit.");
            System.out.println("Kolmnurga pindala on "+(Math.round(Math.sqrt(s)))+" ruutsentimeetrit.");
        }
    }   
}
/*
1 VERSIOON:
Sisesta kolmnurga esimene külg [cm]: 6
Sisesta kolmnurga teine külg [cm]: 9
Sisesta kolmnurga kolmas külg [cm]: 4
Kolmnurga ümbermõõt on 19 sentimeetrit.
Kolmnurga pindala on 10 ruutsentimeetrit.
BUILD SUCCESSFUL (total time: 10 seconds)

2 VERSIOON:
Sisesta kolmnurga esimene külg [cm]: 7
Sisesta kolmnurga teine külg [cm]: 4
Sisesta kolmnurga kolmas külg [cm]: 2
Tegemist pole kolmnurgaga või pole lihtsalt võimalik arvutada...
BUILD SUCCESSFUL (total time: 5 seconds)
*/