
package ttaevik.tlu.fn;


public class funktsioon{
	
	
	static double kgtopounds(double kilod){
		return kilod*2.20462;
	}
	static double poundstokg(double naelad){
		return naelad*0.453592;
	}
	public static void main(String[] args){
		System.out.println(kgtopounds(20));
		System.out.println(poundstokg(45));
		

	}
	
}