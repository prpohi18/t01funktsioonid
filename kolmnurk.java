

import java.util.Scanner;

public class kolmnurk {

	public static void main(String[] args) {
		Scanner kolmnurgasisend = new Scanner(System.in);
		kolmnurgaS kolmnurk = new kolmnurgaS();
		double a, h, S = 0;
		
		System.out.println("Sisesta kolmnurga alus sentimeetrites: ");
		a = kolmnurgasisend.nextDouble();
		System.out.println("Sisesta kolmnurga k6rgus sentimeetrites: ");
		h = kolmnurgasisend.nextDouble();
		
		kolmnurk.pindala(a, h, S);
	}

}
