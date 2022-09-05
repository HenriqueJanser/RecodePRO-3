package modelo;

import java.time.LocalDate;

public class passagem {
	
	public int id_passagem;
	public String nome_passageiro;
	public int agencia;
	public LocalDate data_passagem;
	
	public passagem(int id_passagem, String nome_passageiro, int agencia, LocalDate data_passagem) {
		super();
		this.id_passagem = id_passagem;
		this.nome_passageiro = nome_passageiro;
		this.agencia = agencia;
		this.data_passagem = data_passagem;
	}

	public int getId_passagem() {
		return id_passagem;
	}

	public void setId_passagem(int id_passagem) {
		this.id_passagem = id_passagem;
	}

	public String getNome_passageiro() {
		return nome_passageiro;
	}

	public void setNome_passageiro(String nome_passageiro) {
		this.nome_passageiro = nome_passageiro;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public LocalDate getData_passagem() {
		return data_passagem;
	}

	public void setData_passagem(LocalDate data_passagem) {
		this.data_passagem = data_passagem;
	}
	
	
	

}
