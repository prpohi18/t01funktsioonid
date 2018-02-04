//Kodutöö 1
//Keskmise pikkuse arvutamine

public class Kodutoo1{
    public static int[] arvud(String[]pikkus){
        int[] pikkused=new int[pikkus.length];
        for(int i=0; i<pikkus.length; i++){
            pikkused[i]=Integer.parseInt(pikkus[i]);
        }        
        return pikkused;
    }
    public static int pikkusteSumma(int[] a){
        int summa=0;
        for(int arv: a){summa+=arv;}
        return summa;
    }

    public static void main(String[] args){
        int[] pikkusteArv=new int [args.length];
        System.out.println("Sisestatud pikkuseid on: "+args.length);       
        
        int[] pikkusteSum=arvud(args);
        System.out.println("Pikkuste summa on: "+pikkusteSumma(pikkusteSum));
        
        float keskmine= (float)pikkusteSumma(pikkusteSum) / args.length;
        System.out.println("Keskmine pikkus on: "+keskmine);
    }
}

/*[ojavgret@greeny t01funktsioonid]$ java Kodutoo1 167 168 173 185
Sisestatud pikkuseid on: 4
Pikkuste summa on: 693
Keskmine pikkus on: 173.25 
*/