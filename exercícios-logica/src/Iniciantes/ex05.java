package Iniciantes;
import java.util.Scanner;

public class ex05 {

	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		double a = read.nextDouble();
		double b = read.nextDouble();
		
		double media = (a*3.5 + b*7.5)/11;
		
		System.out.printf("MEDIA = %.5f\n", media);
	
	}
}
