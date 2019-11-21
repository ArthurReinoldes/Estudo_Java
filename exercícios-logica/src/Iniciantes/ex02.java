package Iniciantes;
import java.util.Scanner;

public class ex02 {
	
	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = read.nextDouble();
		double A = n * Math.pow( raio, 2);
		
		System.out.printf("A=%.4f\n", A);
	}
}
