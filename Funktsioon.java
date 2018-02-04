import java.lang.Math;
public class Funktsioon {
	public static int ymardaja (double sisend) {
		int b = (int) Math.round(sisend);
		return b;
	}
	public static void main(String[] arg) {
		try{
			if (arg.length > 0) {
				System.out.println(ymardaja(Double.parseDouble(arg[0])));
			}
		}
		catch(Exception e) {
			System.out.println("Sisesta arv mida soovid ümardada");
		}
	}
}