import java.util.Scanner;

public class kodutoo1 {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		double kaal = 0.0;
		double pikkus = 0.0;
		double bmi = 0.0;
	
		System.out.print("Sisestage enda kaal: ");
		kaal = input.nextInt();
	
		System.out.print("Sisestage enda pikkus: ");
		pikkus	 = input.nextInt();
	
		bmi = ((kaal)/(pikkus/100 * pikkus/100));
	
		System.out.printf("Sinu kehamassiindeks on %f\n", bmi);
	
		System.out.println("Kehamassi tulemused");
		System.out.println("Alakaal: > 18.5");
		System.out.println("Normaalkaal: 18.5 - 24.9");
		System.out.println("Ülekaal: 25 - 29.9");
		System.out.println("Rasvunud: < 30");
	}
}