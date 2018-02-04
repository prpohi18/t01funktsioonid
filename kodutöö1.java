import java.util.Scanner;
public class kodutöö1{
	public static void main(String[] args){
		String name;
		int arv1, arv2, arv3;
		double keskmine;
		double summa;
		
		Scanner input= new Scanner (System.in);
		
		System.out.println ("Sisesta kolm arvu ja leitakse nende summa ning keskmine");
		arv1= input.nextInt();
		arv2= input.nextInt();
		arv3= input.nextInt();
		
		input.close();
		
		keskmine= (double) (arv1+arv2+arv3)/3;
		summa= (double) (arv1+arv2+arv3);
		System.out.println("Arvude summa on " + summa);
		System.out.println("Arvude keskmine on " + keskmine);
	}
}
		
		
	