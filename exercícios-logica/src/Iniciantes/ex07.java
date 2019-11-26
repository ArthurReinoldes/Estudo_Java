package Iniciantes;
import java.util.Scanner;

public class ex07 {
	
	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		int a,b,c,d,diferenca;
		
		a = read.nextInt();
		b = read.nextInt();
		c = read.nextInt();
		d = read.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d\n",diferenca);
	}
}
