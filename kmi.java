// Kert Tamm IF17 TA I rühm

// Programm laseb kasutajal sisestada enda kehakaalu kilogrammides ja pikkuse meetrites
// ning arvutab välja kehamassiindeksi.
// Kehamassiindeks on kaal kilogrammides * pikkuse ruuduga meetrites.

public class kmi{
public static void main(String[] arg) {
	double kaal = Double.parseDouble(arg[0]);
	double pikkus = Double.parseDouble(arg[1]);
	double indeks = kaal/(pikkus*pikkus);
	System.out.println("-----------------------------------------------------");
	System.out.println("Sisestatud kaal: "+kaal+"kg\nSisestatud pikkus: "+pikkus+"m");	
	System.out.println("Teie kehamassi indeks on "+Math.round(indeks*100.0)/100.0);
	if(indeks<16){
		System.out.println("Tervisele ohtlik alakaal");
		}
	if(indeks>=16&&indeks<19){
		System.out.println("Alakaal");
		}		
	if(indeks>=19&&indeks<=25){
		System.out.println("Normaalkaal");
		System.out.println("-----------------------------------------------------");
		}		
	if(indeks>25&&indeks<=30){
		System.out.println("Ülekaal");
		}
	if(indeks>30&&indeks<=35){
		System.out.println("Rasvumine");
		}		
	if(indeks>35&&indeks<=40){
		System.out.println("Tugev rasvumine");
		}	
	if(indeks>40){
		System.out.println("Tervisele ohtlik rasvumine");
		}	

//Kui on ülekaalus siis kuvab milline peaks olema suurim kaal, et olla normaalkaalus
	double tulemus = indeks;
	while(tulemus>25){
		kaal=kaal-0.1;
		tulemus=(kaal)/(pikkus*pikkus);
			if(tulemus<=25){
				System.out.println("Teie kaal peaks olema maksimaalselt "+Math.round(kaal*100.0)/100.0+" kilogrammi.");
				System.out.println("-----------------------------------------------------");
				}
			
		}
		
//Kui on alakaalus siis kuvab milline peaks olema vähim kaal, et olla normaalkaalus		
	while(tulemus<19){
		kaal=kaal+0.1;
		tulemus=(kaal)/(pikkus*pikkus);
			if(tulemus>=19){
				System.out.println("Teie kaal peaks olema vähemalt "+Math.round(kaal*100.0)/100.0+" kilogrammi.");
				System.out.println("-----------------------------------------------------");
				}
			
		}			
	
	}//public static void main lõpp
}//public class lõpp

// Tervisele ohtlik alakaal	< 16
// Alakaal 16 - 18.9
// Normaalkaal 19 - 25
// Ülekaal	25.1 - 30
// Rasvumine 30.1 - 35
// Tugev rasvumine 35.1 - 40
// Tervisele ohtlik rasvumine > 40.1