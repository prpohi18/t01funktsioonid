import java.util.Scanner;
public class kodutoo{
	public static String tasemeHinnang(int punktid){
		if(punktid>=100){return "Oled juba päris hea! Vaatame mis taseme said.";}
		return "Tuleb veel harjutada! Vaatame, mis taseme said.";
	}

   public static String tasemepunktid(double punktid) {
	   String tase = "";
      if (punktid >= 125) {
         tase = "Tase: A1";
      }else if (punktid >= 100) {
         tase = "Tase: A2";
	  }else if (punktid >= 85) {
         tase = "Tase: A3";
		 +
	  }else{
         tase = "Tase: A4";
      }
	  return tase;
   }
   
   public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int punktid;
	  punktid = input.nextInt();
      System.out.println(tasemeHinnang(punktid));
	  System.out.println(tasemepunktid(punktid));
   }
}

/*

[aljarand@greeny harjutus]$ javac kodutoo.java
[aljarand@greeny harjutus]$ java kodutoo
200
Oled juba päris hea! Vaatame mis taseme said.
Tase: A1

*/