public class k1{

  public static int[] arvudeks(String[] andmed){
		int[] arvud=new int[3];
		for(int i=0; i<3; i++){
			arvud[i]=Integer.parseInt(andmed[i]);
		}
		return arvud;
  }

  public static String kontroll(int[] arvud){
    int s1 = arvud[2];
    int s2 = arvud[0];
    int s3 = arvud[1];
    String vastus = "";
    if (arvud[0]+arvud[1]>s1 && arvud[1]+arvud[2]>s2 && arvud[2]+arvud[0]>s3) {
      vastus = "Tegemist on kolmnurgaga";
    }else{
      vastus = "Tegemist ei ole kolmnurgaga";
    }

    return vastus;
  }


  public static void main(String[] args) {
      int[] a=arvudeks(args);
      System.out.println(kontroll(a));
  }

}
