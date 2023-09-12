package herancaEpolimorfismo;

public class exercicio1 {

	private String nome;
	private String sexo;
	private int idade;
	private String estadocivil;
	private String escolaridade;
	
		
	public exercicio1(String nome, String sexo, int idade, String estadocivil, String escolaridade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.estadocivil = estadocivil;
		this.escolaridade = escolaridade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEstadocivil() {
		return estadocivil;
	}


	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}


	public String getEscolaridade() {
		return escolaridade;
	}


	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Estado civil: " + estadocivil);
        System.out.println("Escolaridade: " + escolaridade);

}
}


