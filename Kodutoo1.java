import java.util.Arrays;
public class Kodutoo1{
	public static int[] arvudeks(String[] tekstid){
		int[] vastus=new int[tekstid.length];
		vastus[0]=Integer.parseInt(tekstid[0]);
		return vastus;
	}
	public static int arvudeSumma(int[] a){
		int esimeneNumber = a[0]/100;
		int teineNumber = a[0]%100/10;
		int kolmasNumber = a[0]%10;
		int summa = esimeneNumber + teineNumber + kolmasNumber;
		return summa;
	}
	public static void main(String[] arg){
		int[] arvud=arvudeks(arg);
		System.out.println(arvudeSumma(arvud));
	}
}

/*
[valevale@greeny t01funktsioonid]$ java Kodutoo1 54
9
[valevale@greeny t01funktsioonid]$ java Kodutoo1 785
20
*/