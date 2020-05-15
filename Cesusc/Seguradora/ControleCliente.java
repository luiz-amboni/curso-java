package seguradora.cesusc;

import java.util.ArrayList;

public class ControleCliente {
	private ArrayList<Cliente> listaClientes;
	
	public ControleCliente() {
		super();
		setListaClientes(new ArrayList<Cliente>()); 
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
