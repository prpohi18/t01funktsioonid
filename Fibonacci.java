/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author erike
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        long fnull, fyks, n, counter, summa;
        
        fnull = 0;
        fyks = 1;
        counter = 0;
        System.out.print("NB! Programm on täpne 91. kohani. \n");
        System.out.print("Mitmenda arvuni soovid jada genereerida?: ");
        n = input.nextLong();
        System.out.println(fnull);
        System.out.println(fyks);
        while(counter < n){
            summa = fnull + fyks;
            if(fnull > fyks){
                fyks = summa;
            } else if(fnull < fyks){
                fnull = summa;
            } else {
                fnull = summa;
            }
            System.out.println(summa);
            counter = counter + 1;
    }   
}
}
