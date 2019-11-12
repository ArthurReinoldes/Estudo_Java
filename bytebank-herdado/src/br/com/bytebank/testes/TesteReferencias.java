package br.com.bytebank.testes;

import br.com.bytebank.modelos.*;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		EditordeVideo ev = new EditordeVideo();
		Designer d1 = new Designer();
		
		g1.setSalario(1000);
		ev.setSalario(500);
		d1.setSalario(400);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}

}
