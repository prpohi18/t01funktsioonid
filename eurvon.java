import java.util.Scanner;
public class eurvon{
    static double voniks(double eurod){
        return eurod*1121.29;
    }

    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);

        System.out.println("Mitu eurot teil on?");
        float eurod = reader.nextInt();
        double pkvon=voniks(eurod);
        System.out.println(eurod+" eurot on "+pkvon+" Põhja-Korea vonni.");

    }

}
/*
Euro -> Põhja Korea vonn rahaühikute konverter.
Mitu eurot teil on?
100
100.0 eurot on 112129.0 Põhja-Korea vonni.
 */