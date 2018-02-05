public class keskmine{
	//funktsioon, mis laseb sisestada arvud ja seejärel leiab nende arvude keskmise
	public static float leianKeskmise(float[] arvud){
		float summa=0;
		float keskmine=0;
		float num=0;
		for(float arv: arvud){summa+=arv;num++;}
			keskmine=(float) summa/num;
		return keskmine;
	}
	
	public static float[] arvudeks(String[] andmed){
		float[] arvud=new float[andmed.length];
		for(int i=0; i<andmed.length; i++){
			arvud[i]=Integer.parseInt(andmed[i]);
		}
		return arvud;
	}
	public static void main(String[] arg){
		float[] a=arvudeks(arg);	
		System.out.println(leianKeskmise(a));
	}
}
	
