//Kodutöö 1

public class kodutoo1{
	public static String aeg(int kell){
		if(kell>7 && kell<10){return "Äratus";}
		else if(kell>11 && kell<13){return "Lõunasöögi aeg";}
		else if(kell>21 && kell<24){return "Magama?";}
		return "jms";
	}	

  public static String lounasook(int kell){
    if(kell>11 && kell<13){
      String[] sook={"praad", "supp", "salat"};
      return sook[(int)(Math.random()*sook.length)];
		}
		return "joo vett";
  }
	
	public static void main(String[] arg){
		int kell=22;
		//Kui kell sisestatakse käsurealt,
		//siis arvestatakse neid väärtusi
		try{
			if(arg.length>0){kell=Integer.parseInt(arg[0]);}
		} catch(Exception e){
				System.out.println(
				 "Kasuta kujul java kodutoo1 [kell], nt ");
				System.out.println("java kodutoo1 17"); 
				return;            
		}
		System.out.println(aeg(kell));
		System.out.println(lounasook(kell));
	}
}