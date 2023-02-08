package model;

public class User {
	
	private String usuario;
	private String nome;
	private String repositorios;
	private String seguidores;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRepositorios() {
		return repositorios;
	}
	public void setRepositorios(String repositorios) {
		this.repositorios = repositorios;
	}
	public String getSeguidores() {
		return seguidores;
	}
	public void setSeguidores(String seguidores) {
		this.seguidores = seguidores;
	}
	
	@Override
	
    public String toString() {
        return "Nome [nome=" + nome + ", Quantidade de repositorios=" + repositorios + ", seguidores=" + seguidores + "]";
    }

	
}
