package herancaEpolimorfismo;

public class exercicio1PessoaJuridica extends exercicio1 {
	
	private int CNPJ;
	private String nomemarca;
	
	public exercicio1PessoaJuridica(String nome, String sexo, int idade, String estadocivil, String escolaridade, int CNPJ,  String nomemarca) {
           super(nome, sexo, idade, estadocivil, escolaridade);
           this.CNPJ = CNPJ;
           this.nomemarca = nomemarca;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}

	public String getnomemarca() {
		return nomemarca;
	}

	public void setnomemarca(String nomemarca) {
		this.nomemarca = nomemarca;
	}
	
	@Override
	 public void visualizar() {
		 super.visualizar();
		 System.out.println("CNPJ: " + this.CNPJ);
		 System.out.println("Nome da marca: " + this.nomemarca);
           
	
}
	}
