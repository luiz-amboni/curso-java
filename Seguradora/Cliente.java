package seguradora.cesusc;

public abstract class Cliente {
	//encapsulando os atributos
	private String nome;
	private String email;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public abstract Double calculaImposto(Double valorSeguro);
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
	
}
