package Iniciantes;
import java.util.Scanner;

public class ex09 {

	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		String nome = read.next();
		double salario = read.nextDouble();
		double totalVenda = read.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f\n", salario + totalVenda * 0.15 );
	}
}
