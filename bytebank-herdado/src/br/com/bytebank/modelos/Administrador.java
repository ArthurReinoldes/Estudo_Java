package br.com.bytebank.modelos;


public class Administrador implements Autenticavel {

	private int senha;

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
