package kodutöö;
import static java.lang.Math.sqrt;

public class Kodutöö_nr1 {
    
    
    public static float[] ruutvõrrand(int[] numb){
        float[] lahend=new float[2]; //uus masiiv 
        float x1;
        float x2;
        if(numb[0]==0){ //0-ga jagada ei saa
            throw new RuntimeException("See ei ole ruutvõrrand");
        } else {
           x1=(float)(((-numb[1])+ sqrt((Math.pow(numb[1],2)) - (4 * numb[0] * numb[2])))/ (2 * numb[0]));
           x2=(float)(((-numb[1])- sqrt((Math.pow(numb[1],2)) - (4 * numb[0] * numb[2])))/ (2 * numb[0]));
           lahend[0]=x1;
           lahend[1]=x2;       
    }
    return lahend;
    }
    
 public static void main(String[] args) {
        int[] arvud={ 3, 2, -5};
        float[] l = ruutvõrrand(arvud);
        System.out.println("Vastused on: "+ l[0] +" ja "+ l[1]);
        }
 
 
}
// Vastused on: 1.0 ja -1.6666666