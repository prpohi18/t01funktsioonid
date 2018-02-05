public class Faktoriaal{
    //Koosta funktsioon arvude summa leidmiseks, katseta
    public static int fakto(int[] arvud){
        int tulemus=0;
        for(int arv: arvud){
			tulemus = arv;
			int x = arv - 1;
			System.out.println(arv);
			for(int i = x; i > 0; i--){    
				tulemus *= i;    
				}   
		}
		return tulemus;
	}
		public static int[] arvudeks(String[] andmed){
        int[] arvud=new int[andmed.length];
        for(int i=0; i<andmed.length; i++){
            arvud[i]=Integer.parseInt(andmed[i]);
        }
        return arvud;
    }
    public static void main(String[] arg){
        int[] a=arvudeks(arg);
        System.out.println(fakto(a));
    }
}