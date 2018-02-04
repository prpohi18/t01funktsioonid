import java.util.Scanner;

public class kodutöö1{
    
	public static int[] arvudeks(String[] andmed){
		int[] kyljed=new int[2];
		for(int i=0; i<2; i++){
   			kyljed[i]=Integer.parseInt(andmed[i]);
   		}
   		return kyljed;
    }

    //Arvuta argumentidest pindala
    public static int pindala(int[] kyljed){
        int pikkus = kyljed[0];
        int laius = kyljed[1];
        return pikkus*laius;
    }
    
    //Kui argumente pole kaasas, lase manuaalselt sisestada
    public static int pindalamanual(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sisesta ristküliku pikkus: ");
        int a = scan.nextInt();
        System.out.print("Sisesta ristküliku laius: ");
        int b = scan.nextInt();
        return a*b;
    }

    public static void main(String[] arg){
        if(arg.length == 0){
            System.out.println("Argumente pole sisestatud!");
            System.out.println(pindalamanual());
        }else if(arg.length == 2){
            int[] a=arvudeks(arg);
            System.out.println(pindala(a));
        }else{
            System.out.println("Sisestasid vale koguse argumente");
        }
    }
}
