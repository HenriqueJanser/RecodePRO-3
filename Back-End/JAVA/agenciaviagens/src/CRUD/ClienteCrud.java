package CRUD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.clienteDAO;
import modelo.cliente;

public class ClienteCrud {

	public static void main(String[] args) {
		
		clienteDAO usuarioDAO = new clienteDAO();
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		int posicao = 0;
		
		String nome = "";
		
		List<cliente> usuario = new ArrayList<cliente>();
		
		//MENU
		do {
			System.out.println("--- CRUD Clientes ---");
			System.out.println("1 - Cadastro dos clientes");
			System.out.println("2 - Consulta do cliente");
			System.out.println("3 - Deletar cliente");
			System.out.println("4 - Atualizar cliente");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			switch (opcao) { 
			case 1: 
				//CREATE
				System.out.println("**Cadastrar Cliente**");
				System.out.println("Digite o nome: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				new cliente();
				
				((cliente) usuario).setNome_cliente(nome);
				
				Object pessoa = null;
				usuarioDAO.save(pessoa);
				
				System.out.println("\n***Cadastrado**\n");
				break;
			case 2:
				for (Iterator<cliente> iterator = clienteDAO.getcliente().iterator(); iterator.hasNext();) {
					System.out.println("Id: " + cliente.getId_cliente() + "Nome: " 
				+ cliente.getNome_cliente());
				}
				
				System.out.println("*Consulta Finalizada*");
				break;
			case 3:
				System.out.println("Digite o ID para excluir: ");
				posicao = input.nextInt();
				
				usuarioDAO.deleteById(posicao);
				System.out.println("*Cliente excluído*");
				break;
			case 4: 
				System.out.println("Digite o id do cliente: ");
				System.out.println("Digite o novo nome do cliente: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				clienteDAO.update(usuario);
				break;
			default:
				System.out.println(opcao != 0 ? "\n Opção inválida, " + "tente novamente.\n" : "");
				break;
			}
		} while (opcao != 0);
		input.close();
		System.out.println("*Finalizado*");
		
	}
}