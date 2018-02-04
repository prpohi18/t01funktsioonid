/*public class kt1{
  public static String sleepingHours( int[] shour){
    if(shour[0]<8){return "Oled unine";}
    return "Saad hakkama";

  }
  public static int[] shours(String[] andmed){
		int[] shour=new int[andmed.length];
		for(int i=0; i<andmed.length; i++){
		shour[i]=Integer.parseInt(andmed[i]);
		}
		return shour;
  }

    public static void main(String[] arg){
  	int[] a=shours(arg);
    System.out.println(sleepingHours(a) );
  }


}*/

public class kt1{
  public static String sleepingHours(int shour){
    String vastus = "";
    if(shour<8){
      vastus = "Oled unine";
    }else{
      vastus = "Saad hakkama";
    }
    return vastus;

  }
  public static int shours(String andmed){
		int shour=new int;
		shour=Integer.parseInt(andmed);

		return shour;
  }

    public static void main(String[] arg){
  	int a=shours(arg);
    System.out.println(sleepingHours(a) );
  }


}
