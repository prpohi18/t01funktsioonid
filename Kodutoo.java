import java.util.Scanner;

public class Kodutoo{
	public static void main(String[] arg){
		Scanner s= new Scanner(System.in);
        
        System.out.println("Sisesta esimene kaatet");
        double kaatet1= s.nextDouble();
 
        System.out.println("Sisesta teine kaatet");
        double kaatet2= s.nextDouble();
 
		//hupotenuus
		double hupotenuus=Math.sqrt(Math.pow(kaatet1, 2) + Math.pow(kaatet2, 2));
		
		System.out.println("Hupotenuus on " + hupotenuus);    

		//pindala
		
		double pindala=((kaatet1*kaatet2)/2);
		System.out.println("Pindala on " + pindala);    

	}	
}		

/*
Sisesta esimene kaatet
5
Sisesta teine kaatet
5
Hupotenuus on 7.0710678118654755
Pindala on 12.5
*/