package seguradora.cesusc;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaClientePF {
	private ClientePF cliente;
	
	public ClientePF getCliente() {
		return cliente;
	}
		
	public void leDadosCliente() {
		Scanner meuLeitor = new Scanner(System.in);					
		cliente = new ClientePF();
		System.out.println("Menu de Cliente PF \n");
		System.out.println("Nome: ");
		cliente.setNome(meuLeitor.next());
		System.out.println("E-mail: ");
		cliente.setEmail(meuLeitor.next());
		System.out.println("Telefone: ");
		cliente.setTelefone(meuLeitor.next());
		System.out.println("CPF: ");
		cliente.setCpf(meuLeitor.next());		
	}
	
	
	public void listarClientes(ArrayList<Cliente> listaClientes) {
		int contador =0;
		System.out.println("Lista de Clientes PF \n");
		for (Cliente cliente : listaClientes) {
			if (cliente instanceof ClientePF ) {
			    //type cast 
				ClientePF clipf = (ClientePF) cliente; 				
				contador ++;
				System.out.println("\nCliente " + contador);
				System.out.println("Nome: " + clipf.getNome());
				System.out.println("E-mail: " + clipf.getEmail());
				System.out.println("Telefone: "+ clipf.getTelefone());
				System.out.println("CPF: " + clipf.getCpf());
			}
		}
			
	}
	
}
