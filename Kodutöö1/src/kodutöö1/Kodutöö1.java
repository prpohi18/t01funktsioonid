/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodutöö1;

/**
 *
 * @author if17
 */
public class Kodutöö1 {
    static double pindala(double a, double b){
        return a*b;
    }
    
    static int square(int a){
        return a*a;
    }
    static double pythagoras(double a, double b){
        double c = 0;
        c = Math.sqrt(a*a + b*b);
        return c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(pindala(6, 4));
        System.out.println(square(5));
        System.out.println(pythagoras(2,4));
    }
    
}
