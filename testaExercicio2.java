package herancaEpolimorfismo;

public class testaExercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exercicio2Gerente conta1 = new exercicio2Gerente("Maria",27,"Vendas","Gerente", 5000, "Gerenciar", 8);
		exercicio2Vendedor conta2 = new exercicio2Vendedor("Caio",30,"Vendas","Vendedor",1500,2500,"12:00");
				
		
		System.out.println("Gerente: ");
		conta1.visualizar();
		System.out.println("\n\nVendedor: ");
		conta2.visualizar();
	}

}


	
