import java.util.Scanner;

public class T01funktsioonid{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        
        System.out.println("Kaatet number 1 on (cm):");
        double a= s.nextDouble();
 
        System.out.println("Kaatet number 2 on (cm):");
        double b= s.nextDouble();
 
                //hüpotenuus
		double c=(Math.pow(a, 2) + Math.pow(b, 2));
	  
		//ümardamine + ruutjuur
		double r = Math.round(Math.sqrt(c)*100.0)/100.0;
	  
		System.out.println("Kolmnurga hüpotenuus on: " + r + " cm");      
   }
}