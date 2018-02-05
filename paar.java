public class paar{
	public static String paar(int arv){
		if(arv % 2 == 0){return "Arv mida kontrollisid on paaris";}
		return "Arv on paaritu";
	}
	
	public static void main(String[] arg){
		int arv = 0;
		try{
		if(arg.length>0){arv=Integer.parseInt(arg[0]);}
		} catch( Exception e) {
			System.out.println(
			"Sisesta arv mida soovid kontrollida");
			return;
		}
		System.out.println(paar(arv));
	}
}
		