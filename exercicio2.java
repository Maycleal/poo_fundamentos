package herancaEpolimorfismo;

public class exercicio2 {
	
	private String nome;
	private int idade;
	private String setor;
	private String cargo;
	private float salario;
	
	public exercicio2(String nome,int idade, String setor, String cargo, float salario) {
		this.nome = nome;
		this.idade = idade;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
	
}
}



