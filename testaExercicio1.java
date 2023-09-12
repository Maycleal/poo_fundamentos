package herancaEpolimorfismo;


public class testaExercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		exercicio1PessoaFisica conta1 = new exercicio1PessoaFisica("Maria","Fem",30,"Solteira","Superior", 1567867854, 10000);
		exercicio1PessoaJuridica conta2 = new exercicio1PessoaJuridica("Caio","Masc",45,"Casado","Médio", 12345,"CaioModal");
				
		
		System.out.println("Pessoa fisica: ");
		conta1.visualizar();
		System.out.println("\n\nPessoa jurídica: ");
		conta2.visualizar();
	}

}
