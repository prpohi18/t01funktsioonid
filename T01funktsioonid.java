import java.util.Scanner;

public class T01funktsioonid{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        
        System.out.println("Sisesta kolmnurga 1. kaatet (cm):");
        double a= s.nextDouble();
 
        System.out.println("Sisesta kolmnurga 2. kaatet (cm):");
        double b= s.nextDouble();
 
        //hüpotenuusi arvutamine
		double c=(Math.pow(a, 2) + Math.pow(b, 2));
	  
		//ümardamine
		double r = Math.round(Math.sqrt(c)*100.0)/100.0;
	  
		System.out.println("Kolmnurga hüpotenuus on: " + r + " cm");      
   }
}

/*
[magimihk@greeny homework]$ java T01funktsioonid
Sisesta kolmnurga 1. kaatet (cm):
7.5
Sisesta kolmnurga 2. kaatet (cm):
4.8
Kolmnurga hüpotenuus on: 8.9 cm

[magimihk@greeny homework]$ java T01funktsioonid
Sisesta kolmnurga 1. kaatet (cm):
10
Sisesta kolmnurga 2. kaatet (cm):
10
Kolmnurga hüpotenuus on: 14.14 cm

*/