package herancaEpolimorfismo;

public class exercicio2Vendedor extends exercicio2 {
	
	
	private float comissao;
	private String almoco;
	
	public exercicio2Vendedor (String nome,int idade, String setor, String cargo, float salario, float comissao, String almoco) {
          super(nome, idade, setor, cargo, salario);
           this.comissao = comissao;
           this.almoco = almoco;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public String getAlmoco() {
		return almoco;
	}
	public void setAlmoco(String almoco) {
		this.almoco = almoco;
	}


	@Override
	 public void visualizar() {
		 super.visualizar();
		 System.out.println("Comissão: " + this.comissao);
		 System.out.println("Horario de almoço: " + this.almoco);
           
	
}
	}

