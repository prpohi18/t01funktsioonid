/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodutoo;

/**
 *
 * @author Krislyn
 */
public class Kodutoo{
 	public static String kellaaeg(int kell){
 		if(kell>=8 && kell<=11){return "Kool";}
 		else if(kell>=12 && kell<=13){return "Lõuna";}
 		else if(kell>=14 && kell<=15){return "Õpi";}
                else if(kell>=16 && kell<=21){return "Tööle";}
                else if(kell>=22 && kell<=24){return "Uneaeg";}
 		return "Ebasobilik kellaaeg!";
 	}	
 
   public static String õpi(int kell){
     if(kell>=14 && kell<=15){
       String[] ained={"Programmeeri", "Testi", "Vigadeparandus"};
       return ained[(int)(Math.random()*ained.length)];
 		}
     else if(kell>=22 && kell<=24) {
        String[] tegevused={"Loe", "Mediteeri", "Lama"};
         return tegevused[(int)(Math.random()*tegevused.length)];
   }
 		return "Tee kõike korralikult!";
   }
 	public static void main(String[] arg){
 		int kell=10;
 		try{
 			if(arg.length>0){kell=Integer.parseInt(arg[0]);}
 		} catch(NumberFormatException e){
 				System.out.println(
 				 "Näiteks Kodutoo [kell] ");
 				System.out.println("Kodutoo 12"); 
 				return;            
 		}
 		System.out.println(kellaaeg(kell));
 		System.out.println(õpi(kell));
 	}
        
}