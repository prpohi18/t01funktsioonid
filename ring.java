import java.util.Scanner;
public class ring{
	public static final double pi = 3.14;
	public static void main(String args[]) 
    {   
		Scanner r= new Scanner(System.in);
        
        System.out.println("Sisesta ringi raadius:");
        double raadius= r.nextDouble();
 
		double S=raadius*raadius*pi;
		System.out.println("Ringi pindala on: " + S); 
		
		double U=pi*pi*raadius;
		System.out.println("Ringi ümbermõõt on: " + U);

		
   }
}

