public class tankimine{
    public static String paagiSeis(int kütus){
        if(kütus<30){return "kütust on alla poole paagi, palun tangi";}
        return "ei pea tankima";
    }
    
  
    public static void main(String[] arg){
        int kütus=20;
        try{
          if(arg.length>0){kütus=Integer.parseInt(arg[0]);}
		  
		} catch(Exception e){
            System.out.println(
             "töötab ainult kujul: java tankimine [kütus]");
            System.out.println("java tankimine 40"); 
            return;        
        }
        System.out.println(paagiSeis(kütus));
    }
	
	
}
