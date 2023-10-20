package subsistema1.crm;

public class CrmService {
	
	private CrmService() {//private vai consumir os métodos estáticos e não vai ficar estanciando
		super();
	}

	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM");
	}

}
