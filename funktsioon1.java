import java.util.Scanner;
public class funktsioon1
{
    public static void main(String[] args) 
      {
        int a, b, c;
        float d;
		
        Scanner s = new Scanner(System.in);
        System.out.println("Funktsioon arvutab ruutvõrrandi.");
		
        System.out.print("Sisestage a:");
        a = s.nextInt();
        System.out.print("Sisestage b:");
        b = s.nextInt();
        System.out.print("Sisestage c:");
        c = s.nextInt();
        
        if(a == 0)
        {
            System.out.println("VIGA!");
        }
        else {
			d = b * 2 - 4 * a * c;
            System.out.println("Ruutvõrrandi lahend on: " + d);
        }
    }
}

/*
Funktsioon arvutab ruutvõrrandi.
Sisestage a:3
Sisestage b:4
Sisestage c:5
Ruutvõrrandi lahend on: -52.0
*/

