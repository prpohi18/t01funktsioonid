public class Ruutvorrand{
    //Sisesta [a b c] (ax2 + bx + c = 0)
    public static double leiaLahendid(double a, double b, double c){
        double D, x1, x2;
        D=0;
        x1=0;
        x2=0;
        if (a==0) {
		    System.out.println("Pole ruutvõrrand");
    	} else {
    		D = b*b - 4*a*c;
    		if (D<0) {
    			System.out.println("Puuduvad reaalarvulised lahendid");
    		} else {
    			x1 = (-b + Math.sqrt(D)) / (2*a);
    			x2 = (-b - Math.sqrt(D)) / (2*a);
    			System.out.println("X1 on "+ x1);
    			System.out.println("X2 on "+ x2);
    		}
    	}
        return D;
    }

    public static void main(String[] arg){
        if(arg.length>2){
            double a=Integer.parseInt(arg[0]);
            double b=Integer.parseInt(arg[1]);
            double c=Integer.parseInt(arg[2]);
            System.out.println("Determinant on "+leiaLahendid(a, b, c));
        }
        
    }
}
