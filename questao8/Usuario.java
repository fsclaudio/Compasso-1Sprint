package questao8;

public class Usuario {

	private String usario;
	private String senha;

	public Usuario(String usario, String senha) {
		this.usario = usario;
		this.senha = senha;
	}

	public String getUsario() {
		return usario;
	}

	public void setUsario(String usario) {
		this.usario = usario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
