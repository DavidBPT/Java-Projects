
public class Pessoa extends Agenda{
	
	private String nome, email, telefone;
	
	public Pessoa (String n, String e, String t) {
		
		n=nome;
		e=email;
		t=telefone;
	}

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
	
	public String getPessoa(){
		return "Nome:  "+nome+ " Email: " +email+ " Telefone: "+ telefone;
	}
	//Métodos
	public boolean equals (Pessoa p){
		
		if(p != null){
			
			return (nome == p.getNome() && email == p.getEmail() && telefone == p.getEmail());
		}
		
		else {
			return false;
		}
	}
	public Pessoa Clone(){
		
		return new Pessoa(nome, email, telefone);
	}
	
}
