package Iniciantes;
import java.util.Scanner;

public class ex08 {

	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		int NumeroFuncionario;
		double Horas, ValorPorHora;
		
		NumeroFuncionario = read.nextInt();
		Horas = read.nextDouble();
		ValorPorHora = read.nextDouble();
		
		System.out.printf("NUMBER = %d\n", NumeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", Horas * ValorPorHora);
	}

}
