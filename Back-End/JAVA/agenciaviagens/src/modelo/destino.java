package modelo;

public class destino {
	
	public int id_destino;
	public int cidade_destino;

	
	public destino(int id_destino, int cidade_destino) {
		super();
		this.id_destino = id_destino;
		this.cidade_destino = cidade_destino;
	}


	public int getId_destino() {
		return id_destino;
	}


	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}


	public int getCidade_destino() {
		return cidade_destino;
	}


	public void setCidade_destino(int cidade_destino) {
		this.cidade_destino = cidade_destino;
	}
	

}
