package herancaEpolimorfismo;

public class exercicio1PessoaFisica extends exercicio1 {
	
		
	private int CPF;
	private float renda;
	
	public exercicio1PessoaFisica(String nome, String sexo, int idade, String estadocivil, String escolaridade, int CPF, float renda) {
           super(nome, sexo, idade, estadocivil, escolaridade);
           this.CPF = CPF;
           this.renda = renda;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}
	
	@Override
	 public void visualizar() {
		 super.visualizar();
		 System.out.println("CPF: " + this.CPF);
		 System.out.println("Renda: " + this.renda);
           
	
}
	}
