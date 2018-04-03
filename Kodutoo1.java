import java.util.Scanner;

public class Kodutoo1 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.println(n + " squared is " + n*n);
		reader.close();
    }
}