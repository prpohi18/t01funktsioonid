/*public class kodutöö1{
	public static void main(String[] arg){
		int vanus=20;
		if (vanus>17){
			System.out.println("Täis");
		}
		else System.out.println("Alakas");
	}
}
		
*/
import java.util.Scanner;
public class kodutöö1{
	public static void main(String[] args){
		String name;
		int arv1, arv2, arv3;
		double average;
		
		Scanner input= new Scanner (System.in);
		
		System.out.println ("Sisesta kolm arvu ja leitakse nende keskmine");
		arv1= input.nextInt();
		arv2= input.nextInt();
		arv3= input.nextInt();
		
		input.close();
		
		average= (double) (arv1+arv2+arv3)/3;
		System.out.println("Arvude keskmine on" + average);
	}
}
		
		
	