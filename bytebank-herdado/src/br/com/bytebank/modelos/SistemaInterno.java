package br.com.bytebank.modelos;


public class SistemaInterno {

		private int senha = 123;
		
		public void autentica(Autenticavel fa) {
			
			boolean autenticou = fa.autentica(this.senha);
			
			if(autenticou) {
				System.out.println("SUCESS LOGIN");
			}else {
				System.out.println("AUTENTICATION FAILED");
			}
		}
}
