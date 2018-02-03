// Auto esiklaasi puuduliku nähtavuse põhjuse otsimise programm

public class Autoaknad{
	public static String nähtavuseHinnang(int nähtavus){
		if(nähtavus<5){return "Kui välja ei näe, kasuta kojamehi";}
		return "Nähtavus on hea";
	}
	public static String vedelikuHinnang(int vedelik){
		if(vedelik<3) {return "Lisa klaasipesuvedelikku juurde";}
		return "Lase vahendit aknale ja proovi siis";
	}
	public static String kulumiseHinnang(int vanus){
		if(vanus>6){
			String[] vastus={"Ega kojamehed just kõige uuemad ole enam.", "Kojamehed tuleks välja vahetada",  "Et parandada nähtavust, alusta kojameeste vahetusest"};
			return vastus[(int)(Math.random()*vastus.length)];
		}
		return (vanus<3) ? "Kojameeste vahetuse vajadust veel ei ole" : "Kojameeste vanuses ei tohiks probleem olla";	
	}
	public static void main(String[] arg){
		int nähtavus=0; 
		int vedelik=0;
		int vanus=0;
		try{
			if(arg.length>0){nähtavus=Integer.parseInt(arg[0]);}
			if(arg.length>0){vedelik=Integer.parseInt(arg[1]);}
			if(arg.length>0){vanus=Integer.parseInt(arg[2]);}
		} catch(Exception e){
			System.out.println("Kasuta kujul: java Autoaknad [nähtavus 0-10] [vedeliku tase 0-5] [kojameeste vanus kuudes]");
			System.out.println("näiteks: java Autoaknad 10 5 12");
			return;
		}
		System.out.println(nähtavuseHinnang(nähtavus));
		System.out.println(vedelikuHinnang(vedelik));
		System.out.println(kulumiseHinnang(vanus));
	}
}