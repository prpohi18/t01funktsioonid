import java.util.Scanner;
public class kodutoo1{
	public static String eksamiHinne(int punktid){
		if(punktid<=50){return "Kahjuks ei läbinud eksamit!";}
		return "Väga hea, said läbi.";
	}

	public static String eksamiPunktid(double punktid){
			String hinne = "";
		if (punktid >= 90){
			hinne = "Hinne on A";
		}
		else if (punktid >= 80){
			hinne = "Hinne on B";
		}
		else if (punktid >= 70){
			hinne = "Hinne on C";
		}
		else if (punktid >= 60){
			hinne = "Hinne on D";
		}
		else if (punktid >= 51){
			hinne = "Hinne on E";
		}
		return hinne;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int punktid;
		punktid = input.nextInt();
		System.out.println(eksamiHinne(punktid));
			System.out.println(eksamiPunktid(punktid));
	}
}

//javac kodutoo1.java
//java kodutoo1
//69
//Väga hea, said läbi.
//Hinne on D

//49
//Kahjuks ei läbinud eksamit!
		