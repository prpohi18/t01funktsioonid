//Kodutööks on igaühel funktsiooni koostamine ning selle töö demonstreerimine näitprogrammi.
//Kodutöö esitatakse siinse repositooriumi pull requestina ning tutvustatakse klassis tahvli ees
//Ideid ja näiteid leiab näidete esimese tunni materjalide alt.
public class Kodutöö1{

    public static String hommikusöögisoovitus(int kellaaeg){

        if(kellaaeg<9){return "Hakka sööma!";}

        return "EI jõua enam suurt süüa";

    }


    public static String söögisoovitus(

      int kellaaeg, int aegkooli){

        if(kellaaeg<8){

            String[] suursöök={

                "Puder", "Baconandeggs", "4coursemeal"};

          return suursöök[(int)(Math.random()*suursöök.length)];

        }
        if(aegkooli>30){

            String[] väikesöök={

				"Helbed", "Võileivad", "Jogurt"};

	  return väikesöök[(int)(Math.random()*väikesöök.length)];

        }
		return "Võta toit kaasa";
}

    public static void main(String[] arg){

        int kellaaeg=-8;

        int aegkooli=25;

        //Kui kellaaeg [ja aegkooli] sisestatakse Käsurealt,

        //siis arvestatakse neid väärtusi

        try{

          if(arg.length>0){kellaaeg=Integer.parseInt(arg[0]);}

          if(arg.length>1){aegkooli=Integer.parseInt(arg[1]);}

        } catch(Exception e){

            System.out.println(

             "Kasuta kujul java Kodutöö1 [kellaaeg] [aegkooli], nt ");

            System.out.println("java Kodutöö1 8 30"); 

            return;            

        }

        System.out.println(hommikusöögisoovitus(kellaaeg));

        System.out.println(söögisoovitus(kellaaeg, aegkooli));

    }

}
//[edgar@greeny t01funktsioonid]$ java Kodutöö1 8 29
//Hakka sööma!
//Võta toit kaasa
//[edgar@greeny t01funktsioonid]$ java Kodutöö1 8 31
//Hakka sööma!
//Võileivad
//[edgar@greeny t01funktsioonid]$ java Kodutöö1 7 29
//Hakka sööma!
//Puder
//[edgar@greeny t01funktsioonid]$ java Kodutöö1 9 30
//EI jõua enam suurt süüa
//Võta toit kaasa
