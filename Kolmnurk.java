import java.util.Scanner;

public class Kolmnurk {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double külg1, külg2, hüpotenuus, pindala, ümbermõõt;
		
		//Sisestame esimese külje
		System.out.print("Sisesta esimese külje väärtus: ");
		külg1 = input.nextDouble();
		
		//Sisestame teise külje
		System.out.print("Sisesta teise külje väärtus: ");
		külg2 = input.nextDouble();
		
		//Leiame hüpotenuusi Pythagorose järgi ruutjuur(külg1^2 + külg2^2)
		hüpotenuus = Math.sqrt(Math.pow(külg1, 2) + Math.pow(külg2, 2));
		
		//leiame ümbermõõdu
		ümbermõõt = külg1 + külg2 + hüpotenuus;
		
		//leiame pindala
		pindala = külg1 * külg2 / 2;
		
		
		System.out.println("Hüpotenuusi pikkus on: " + hüpotenuus);
		System.out.println("Ümbermõõt on: " + ümbermõõt);
		System.out.println("Pindala on: " + pindala);
	}
}