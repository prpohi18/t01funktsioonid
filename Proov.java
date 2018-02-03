public class Autoaknad{
	public static String nähtavuseHinnang(int nähtavus, int vedelik){
		if(nähtavus<5){return "Oleks vaja kojamehi vahetada";}
		return "Vahetusega kannatab oodata";

		if(vedelik<3){return "Lisa klaasipesuvedelikku juurde";}
		return "Lase vahendit aknale ja proovi siis";
	}
	public static String kulumiseHinnang(int vanus){
		if(vanus>6){
			String[] vastus={"Ega kojamehed just kõige uuemad ole enam.", "Kojamehed tuleks välja vahetada",  "Et parandada nähtavust, alusta kojameeste vahetusest"};
			return vastus[(int)(Math.random()*vastus.length)];
		}
		return (vanus<3) ? "Vahetuse vajadust veel ei ole" : "Tuleks hakata kojameeste vahetusele mõtlema";	
	}
	public static void main(String[] arg){
		int nähtavus=1; 
		int vedelik=1;
		int vanus=1;
		try{
			if(arg.length>0){nähtavus=Integer.parseInt(arg[0]);}
			if(arg.length>0){vedelik=Integer.parseInt(arg[1]);}
			if(arg.length>0){vanus=Integer.parseInt(arg[2]);}
		} catch(Exception e){
			System.out.println("Kasuta kujul java Autoaknad [nähtavus] [vedelik] [vanus]");
			System.out.println("java Autoaknad 10 5 12");
			return;
		}
		System.out.println(nähtavuseHinnang(nähtavus, vedelik));
		System.out.println(kulumiseHinnang(vanus));
	}
}