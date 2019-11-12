package br.com.bytebank.testes;

import br.com.bytebank.modelos.*;

public class TesteSistema {
	
	public static void main(String[]args) {
		
		Gerente g = new Gerente();
		g.setSenha(123);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
	}

}
