public class CriaConta {
	
	public static void main (String [] args) {
		Conta ContaCorrente = new Conta();
		ContaCorrente.saldo = 200;
		System.out.println(ContaCorrente.saldo);
		
		ContaCorrente.saldo += 100;
		System.out.println(ContaCorrente.saldo);
		
		Conta cc = new Conta();
		cc.saldo = 50;
		
		System.out.println("Primeira conta tem " + ContaCorrente.saldo);
		System.out.println("Segunda conta tem " + cc.saldo);
	}

}
