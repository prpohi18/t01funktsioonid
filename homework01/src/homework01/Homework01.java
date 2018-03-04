package homework01;
public class Homework01 {
    public static void main(String[] args) {
        // int side1, side2;
        int side1 = 5;
        int side2 = 6;
        System.out.println("Külgede pikkused on " + side1 + " ja " + side2);
        double area = side1*side2;
        //System.out.println(area);
        double perimeter = 2*(side1+side2);
        //System.out.println(perimeter);
        System.out.println("Kujundi pindala on: " + area + " ja perimeeter on: " + perimeter);
    }
}
