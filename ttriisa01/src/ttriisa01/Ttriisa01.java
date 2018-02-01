/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttriisa01;

import java.util.Arrays;

/**
 *
 * @author zeus
 */
public class Ttriisa01 {

    /**
     * @param args the command line arguments
     */
    public static int[] sorteerimine(int[] arvud) {
        boolean sorted = false;
        boolean changed = false;
        int buffer;
        while(sorted == false){
            changed = false;
            for(int i=0; i<arvud.length-1; i++) {
                if(arvud[i] > arvud[i+1]) {
                    buffer = arvud[i+1];
                    arvud[i+1] = arvud[i];
                    arvud[i] = buffer;
                    changed = true;
                }
            }
            if (changed == false) {
                sorted = true;
            }
        }
        return arvud;
    }
    
    public static void main(String[] args) {
        int[] arvud = {2,6,5,3,1,4};
        arvud = sorteerimine(arvud);
        System.out.println(Arrays.toString(arvud));
    }
    
}
//run:
//[1, 2, 3, 4, 5, 6]