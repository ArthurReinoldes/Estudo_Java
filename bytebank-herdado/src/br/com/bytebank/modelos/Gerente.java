package br.com.bytebank.modelos;


public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		return super.getSalario() * 0.1 + super.getSalario();
	}
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}	
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
