

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author Kaur
 */
public class Homework1 {
   //Programm BTC hinnamuutuse arvutamiseks
    public static void btcHind (double uusHind){
        double vanaHind = 13657.2020;
        if(uusHind>vanaHind){System.out.println("Bitcoini hind on aasta algusest t6usnud "+((uusHind*100/vanaHind)-100)+"% ehk "+(uusHind-vanaHind)+" eurot.");}
        else if(uusHind<vanaHind){System.out.println("Bitcoini hind on aasta algusest langenud "+(100-(uusHind*100/vanaHind))+"% ehk "+(vanaHind-uusHind)+" eurot.");}
        else {System.out.println("Bitcoini hind on j22nud aasta algusega samaks ehk "+vanaHind+" eurot.");}
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sisestan praeguse BTC hinna, et saada teada muutust
        System.out.println("Arvutame BTC hinnamuutuse alates 01.01.2018.");
        btcHind(8205.50);        
    }
    
}

/*

run:
Arvutame BTC hinnamuutuse alates 01.01.2018.
Bitcoini hind on aasta algusest langenud 39.91814721639176% ehk 5451.701999999999 eurot.
BUILD SUCCESSFUL (total time: 0 seconds)

*/