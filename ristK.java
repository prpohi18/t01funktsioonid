import java.util.Scanner;

public class ristK{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		/*pikkus = */System.out.println("Sisesta ristK pikkus: ");
		double pikkus = scanner.nextDouble();
		/*if (pikkus == "P"){
		System.out.println("Sisesta ristK diagonaal: ")
		}else{
		}*/
		System.out.println("Sisesta ristK laius: ");
		double laius = scanner.nextDouble();
		double pindala = pikkus*laius;
		System.out.println("Ristküliku pindala on "+pindala);
	}
}
		 
		  
		    