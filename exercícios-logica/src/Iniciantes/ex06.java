package Iniciantes;
import java.util.Scanner;

public class ex06 {

	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		double a = read.nextDouble();
		double b = read.nextDouble();
		double c = read.nextDouble();
		
		double media = a * 0.2 + b * 0.3 + c * 0.5;
		
		System.out.printf("MEDIA = %.1f\n", media);
				
	}
}
