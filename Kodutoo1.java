public class Kodutoo1{
	static int L2VEND = 50;
	
	public static String arvuta_vastus(int sisseastumiskatse, int eksam){
		double tulemus = sisseastumiskatse * 0.75 + eksam * 0.25; 
		
		System.out.println(tulemus);

		if (tulemus >  L2VEND){
			String vastus = "Saite sisse";
			return vastus;
		}
		else{
			String vastus = "proovige j2rgmine aasta uuesti";
			return vastus;
		}
		
	}
	
	public static void main(String[] arg){
		
	System.out.println("Sisesta sisseastumiskatse tulem");
	String sisend1 = System.console().readLine();
	int n1 = Integer.parseInt(sisend1);
	
	System.out.println("Sisesta eestikeele eksami tulem");
	String sisend2 = System.console().readLine();
	int n2 = Integer.parseInt(sisend2);
	
	String vastus = arvuta_vastus(n1, n2);
	System.out.println(vastus);
		
	}
}


[palokatr@greeny t01funktsioonid]$ javac Kodutoo1.java
[palokatr@greeny t01funktsioonid]$ java Kodutoo1
Sisesta sisseastumiskatse tulem
55
Sisesta eestikeele eksami tulem
65
57.5
Saite sisse
[palokatr@greeny t01funktsioonid]$ java Kodutoo1
Sisesta sisseastumiskatse tulem
2
Sisesta eestikeele eksami tulem
4
2.5
proovige j2rgmine aasta uuesti
[palokatr@greeny t01funktsioonid]$
