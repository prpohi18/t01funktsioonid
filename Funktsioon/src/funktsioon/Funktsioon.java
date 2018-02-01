package funktsioon;


public class Funktsioon {

    public static double convert(double kmh_speed){
        double result = kmh_speed/3.6;
        return result;
    }
    
    public static double[] speed_table(int initial){
       
       
       double []result={convert(initial+5),convert(initial+10), 
           convert(initial+15), convert(initial+20)};
       
       return result;
    }
    
    public static void main(String[] args) {
        int kmh = 45;
        System.out.println(kmh+" km/h = "+convert(kmh)+" m/s");
        double[] speed_table_print = speed_table(kmh);
        
        for(int i=0; i<speed_table_print.length; i++){
           System.out.println((kmh+5+5*i)+" km/h = "+speed_table_print[i]+" m/s"); 
        }
    }
    /*
    
    90 km/h = 25.0 m/s
    95 km/h = 26.38888888888889 m/s
    100 km/h = 27.77777777777778 m/s
    105 km/h = 29.166666666666664 m/s
    110 km/h = 30.555555555555554 m/s
    
    45 km/h = 12.5 m/s
    50 km/h = 13.88888888888889 m/s
    55 km/h = 15.277777777777777 m/s
    60 km/h = 16.666666666666668 m/s
    65 km/h = 18.055555555555554 m/s
    
    
    
    */
   
}
