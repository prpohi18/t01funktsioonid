/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodune.töö1;

import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author ketuo
 */
public class KoduneTöö1 {
    
    
    public static float[] väärtused(int[] arvud){
     float[] vastus=new float[2];
     if(arvud== null){
      throw new RuntimeException("parameetri väärtus null");  
    } 
    float x1 ;
    float x2 ;
    if(arvud[0] == 0){
      throw new RuntimeException("Tegemist ei ole ruutvõrrandiga");  
    } else {
        x1 = (float) (double) ((-arvud[1]+ sqrt((arvud[1] * arvud[1]) - 4 * arvud[0] * arvud[2]))/ 2 * arvud[0]);
        x2 = (float) (double) ((-arvud[1]- sqrt((arvud[1] * arvud[1]) - 4 * arvud[0] * arvud[2]))/ 2 * arvud[0]);
        vastus[0] = x1;
        vastus[1] = x2;
    }  return vastus; 
     
    }
    
    public static void main(String[] args) {
        int[] muutujad={ 2, 5, 2 };
        float[] t = väärtused(muutujad);
        System.out.println("Ruutvõrrandi väärtused on: "+Arrays.toString(t));
    }
   
}
/* 2       5       2      -0.5     -2 */ 
