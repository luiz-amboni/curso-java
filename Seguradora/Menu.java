package seguradora.cesusc;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		//Como ler algo do teclado
		int opcaoSelecionada = -1;
		ControleCliente controleCliente = new ControleCliente();
		
		while ((opcaoSelecionada < 0) || (opcaoSelecionada > 6)) {

			System.out.println("Menu Principal \n");
			System.out.println("1-Cadastro de Cliente Pessoa Fisica");
			System.out.println("2-Cadastro de Cliente Pessoa Juridica");
			System.out.println("3-Cadastro de Casa");
			System.out.println("4-Cadastro de Veiculo");
			System.out.println("5-Registra Seguro");
			System.out.println("6-Lista Clientes");
			System.out.println("0 -Sair");		

			Scanner meuLeitor = new Scanner(System.in);			
			opcaoSelecionada = meuLeitor.nextInt();		
			
			
			switch (opcaoSelecionada) {
			case 1 : {
				TelaClientePF minhaTelaPF = new TelaClientePF();
				minhaTelaPF.leDadosCliente();
				System.out.println("\n \n CLIENTE PF Cadastrado");
				System.out.println(minhaTelaPF.getCliente().toString() + "\n\n");
				
				controleCliente.getListaClientes().add(minhaTelaPF.getCliente());
				opcaoSelecionada = -1;
			}		
			continue;
			case 2 : System.out.println("Abre Cadastro Cliente juridica"); break;
			case 3 : System.out.println("Abre Cadastro Casa"); break;
			case 4 : System.out.println("Abre Cadastro Veiculo"); break;
			case 5 : System.out.println("Abre Registro Seguro"); break;
			case 6 : {
				TelaClientePF minhaTelaPF = new TelaClientePF();
				minhaTelaPF.listarClientes(controleCliente.getListaClientes());
				opcaoSelecionada = -1;
				continue;
			}
     		case 0 : System.exit(0);									
	
		}
	
		}




	}

}
