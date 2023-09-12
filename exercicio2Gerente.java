package herancaEpolimorfismo;

public class exercicio2Gerente extends exercicio2 {
	
	private String atribuicao;
	private int cargahoraria;
	
	public exercicio2Gerente (String nome,int idade, String setor, String cargo, float salario, String atribuicao, int cargahoraria) {
          super(nome, idade, setor, cargo, salario);
           this.atribuicao = atribuicao;
           this.cargahoraria = cargahoraria;
	}


	
	public String getAtribuicao() {
		return atribuicao;
	}



	public void setAtribuicao(String atribuicao) {
		this.atribuicao = atribuicao;
	}



	public int getCargahoraria() {
		return cargahoraria;
	}



	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}


	@Override
	 public void visualizar() {
		 super.visualizar();
		 System.out.println("Atribuição: " + this.atribuicao);
		 System.out.println("Carga horaria(em horas): " + this.cargahoraria);
           
	
}
	}



