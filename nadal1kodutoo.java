public class kodutoo{
	public static String keskminehinnang(float hinne){
		if(hinne<1){return "???";}
		if(hinne<2){return "Võta kokku end";}
		if(hinne<3){return "Täitsa normaalne";}
		if(hinne<4){return "Hakkab looma";}
		if(hinne<5){return "Paremaks väga minna ei saa";}
	}
	
	public static String keskmisearvutamine(n0, n1, n2, n3, n4 ,n5){
		keskmine=(n0+n1+n2+n3+n4+n5)/6;
		return keskmine;
	}

	public static void main(String[] arg){
		float hin0=1;
		float hin1=2;
		float hin2=3;
		float hin3=4;
		float hin4=5;
		float hin5=4;
		
		try
		{
		if(arg.length>0)
		{hin0=Integer.parseInt(arg[0]);}
		
		if(arg.length>1)
		{hin1=Integer.parseInt(arg[1]);}
	
		if(arg.length>1)
		{hin2=Integer.parseInt(arg[2]);}
		
		if(arg.length>1)
		{hin3=Integer.parseInt(arg[3]);}
		
		if(arg.length>1)
		{hin4=Integer.parseInt(arg[4]);}
	
		if(arg.length>1)
		{hin5=Integer.parseInt(arg[5]);}
		}
		catch(Exception e)
		{
			System.out.println("Kirjuta 6 hinnet, et arvutada keskmist");
			System.out.println("java kodutoo 1 2 3 4 5 3");
		}
		System.out.println(keskmisearvutamine(hin0, hin1, hin2, hin3, hin4, hin5));
		System.out.println(keskminehinnang(keskmine));
	}
}