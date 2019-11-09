
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 123);
		ContaPoupanca cp = new ContaPoupanca(1234, 1234);
		
		cc.deposita(1000);
		cc.transfere(200, cp);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
