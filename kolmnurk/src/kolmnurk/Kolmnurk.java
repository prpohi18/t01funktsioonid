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
 	System.out.print("Sisesta kolmnurga esimene kulg [cm]: ");
 	a = scan.nextFloat();
 	System.out.print("Sisesta kolmnurga teine kulg [cm]: ");
 	b = scan.nextFloat();
 	System.out.print("Sisesta kolmnurga kolmas kulg [cm]: ");
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
