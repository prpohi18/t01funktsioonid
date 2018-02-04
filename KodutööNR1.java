public class KodutööNR1{
	public static int[] arvudeks(String[] andmed){
		int[] arvud=new int[2];
		for(int i=0; i<2; i++){
			arvud[i]=Integer.parseInt(andmed[i]);
		}
		return arvud;
	}
	public static double leiaPindala(int[] arvud){
		double pindala = 0;
		int a = arvud[0];
		int h = arvud[1];
		if (a > 0 && h > 0){
			pindala = a * h / 2;
		}else{
			System.out.println("Tegu pole kolmnurgaga!");
		}
		return pindala;
	}
		public static void main(String[] arg){
		int[] a=arvudeks(arg);
		System.out.println(leiaPindala(a));
	}
}