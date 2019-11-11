
public class TesteFunciario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("123456789-9");
		nico.setSalario(2590.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	
	}
}
