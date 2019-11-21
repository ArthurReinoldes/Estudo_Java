package Iniciantes;
import java.util.Scanner;

public class ex01 {
	public static void main(String[]args) {
		int a;
		int b;
		int X;
	
		Scanner read = new Scanner(System.in);
		
		a = read.nextInt();
		b = read.nextInt();
		X = a+b;
		
		System.out.println("X = " + X);
	}
}
