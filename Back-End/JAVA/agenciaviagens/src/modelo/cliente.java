package modelo;

public class cliente {
	
	private static int id_cliente;
	private static String nome_cliente;
	private static String email_cliente;
	private static int cpf;
	
	public cliente(int id_cliente, String nome_cliente, String email_cliente, int cpf) {
		super();
		cliente.id_cliente = id_cliente;
		cliente.nome_cliente = nome_cliente;
		cliente.email_cliente = email_cliente;
		cliente.cpf = cpf;
	}
	

	public static int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		cliente.id_cliente = id_cliente;
	}
	public static String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		cliente.nome_cliente = nome_cliente;
	}
	public static String getEmail_cliente() {
		return email_cliente;
	}
	public void setEmail_cliente(String email_cliente) {
		cliente.email_cliente = email_cliente;
	}
	public static int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		cliente.cpf = cpf;
	}
	
	
	public cliente() {
		// TODO Auto-generated constructor stub
	}


	public void setCpf(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}