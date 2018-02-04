import java.io.*;

public class Kodutoo1 {

	//Argumendid a ja b on algsed t2isarvud.
	//Arv c on protsent, mille v6rra m6lemat arvu muudetakse.
	//Suuremat arvu v2hendatakse ja v2iksemat arvu suurendatakse 
	//c protsendi v6rra (kui arvud on v6rdsed, siis esimest suurendatakse 
	//ja teist v2hendatakse).

	public static double[] arvudeMuutmine(double a, double b, int c){   		
		double esimene_arv;
		double teine_arv;
		
		if(a>b){
		esimene_arv=a-a*c/100;
		teine_arv=b+b*c/100;
		}else{
		esimene_arv=a+a*c/100;
		teine_arv=b-b*c/100;
		}
		
		return new double[] {esimene_arv, teine_arv};
	}

	//Kysin kasutajalt kaks arvu ja nende arvude muutmise protsendi ja prindin yhes lauses v2lja 
	//m6lemad arvud ning lisaks ka tulemused, milleks need arvud muudeti.

	public static void main(String[] argumendid) throws IOException{
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Sisesta esimene arv:");
		String Arv1=sisse.readLine();
		double arv1=Double.parseDouble(Arv1);

		System.out.println("Sisesta teine arv:");
		String Arv2=sisse.readLine();
		double arv2=Double.parseDouble(Arv2);

		System.out.println("Mitu protsenti arve muuta soovite?");
		String Muutus=sisse.readLine();
		int muutus=Integer.parseInt(Muutus);

		double result[] = arvudeMuutmine(arv1, arv2, muutus);

		System.out.println("Arv " +arv1+ " muudeti arvuks " +result[0]+ 
		" ja arv " +arv2+ " muudeti arvuks " +result[1]+ ".");
	}

}

