public class Kodu1{
	public static double[] arvudeks(String[] andmed){
        double[] arvud=new double[andmed.length];
        for(int i=0; i<2; i++){
            arvud[i]=Double.parseDouble(andmed[i]);
        }
        return arvud;
	}
	public static double hüpotenuus(double[] arvud){
        double hüpotenuus=0;
        for(double arv: arvud){
			hüpotenuus = Math.sqrt((arvud[0]*arvud[0]) + (arvud[1]*arvud[1]));
		}
        return hüpotenuus;
	}
	public static double pindala(double[] kaatetid){
        double pindala = kaatetid[0]*kaatetid[1] / 2;
        return pindala;
	}
	public static double ümbermõõt(double[] küljed){
        double ümbermõõt = küljed[0] + küljed[1] + küljed[2];
        return ümbermõõt;
	}
	public static void main(String[] arg){
		for(int i=0; i<2; i++){
			if (i==0) {
				System.out.println(i+1+"." +" kaatet: "+arg[i]);
			}
			if (i==1) {
				System.out.println(i+1+"." +" kaatet: "+arg[i]);
			}
		}
		double[] a=arvudeks(arg);
		double[] b=new double[3];
		b[0] = a[0];
		b[1] = a[1];
		b[2] = hüpotenuus(a);
		double ümbermõõt = b[0]+b[1]+b[2];
		//System.out.println("Hüpotenuus: "+ hüpotenuus(a));
		System.out.printf("Hüpotenuus: %.2f %n", hüpotenuus(a));
		System.out.printf("Kolmnurga pindala on: %.2f %n", pindala(a));
		System.out.printf("Kolmnurga ümbermõõt on: %.2f %n", ümbermõõt);
	}
}