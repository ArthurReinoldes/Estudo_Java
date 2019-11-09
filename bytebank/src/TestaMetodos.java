public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta cc = new Conta(222,333);
		Conta cc2 = new Conta(444,555);
		
		cc.deposita(100);
		cc2.deposita(200);
		
		cc.transfere(50, cc2);
		
		System.out.println(cc.getSaldo());
		System.out.println(cc2.getSaldo());
		System.out.println(Conta.total);

	}

}
