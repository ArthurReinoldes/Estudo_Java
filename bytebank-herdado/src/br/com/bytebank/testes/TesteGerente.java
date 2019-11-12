package br.com.bytebank.testes;

import br.com.bytebank.modelos.*;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Carlinhos");
		g1.setCpf("123123123");
		g1.setSalario(1000);
		g1.setSenha(123);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		boolean autenticou = g1.autentica(123);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
		
	}
}
