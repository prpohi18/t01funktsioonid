import java.util.Scanner;

public class kodutoo {
	public static void main(String[] args){
		
	Scanner input= new Scanner(System.in);
    
	double kaal = 0.0;
	double pikkus = 0.0;
	double bmi = 0.0;
	
	System.out.print("Sisesta kaal: ");
	kaal = input.nextInt(); 
	
	System.out.print("Sisesta pikkus: ");
	pikkus = input.nextInt(); 

	bmi = ((kaal/pikkus/pikkus)*10000);
	
	System.out.println("Sinu kehamassi indeks on: "+bmi);
	
	}
}