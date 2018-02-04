public class funkt{
	public static int[] arvudeks(String[] andmed){
		int[] kaatetid=new int[2];
		for(int i=0; i<2; i++){
			kaatetid[i]=Integer.parseInt(andmed[i]);
		}
		return kaatetid;
	}
    public static double hupotenuus(int[] kaatetid) {
		int kaatet1 = kaatetid[0];
		int kaatet2 = kaatetid[1];
		double hupotenuus = 0;
		if(kaatetid[0] > 0 && kaatetid[1] > 0){
			hupotenuus = (kaatet1 * kaatet1) + (kaatet2 * kaatet2);
		}
		return hupotenuus;
	}
   public static void main(String[] arg){
		int[] a=arvudeks(arg);
		System.out.println(Math.sqrt(hupotenuus(a)));
	}
}