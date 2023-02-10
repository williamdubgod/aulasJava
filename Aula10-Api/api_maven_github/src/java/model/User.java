package model;

public class User {
	
	private String usuario;
	private String name;
	private String public_repos;
	private String followers;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getRepositorios() {
		return public_repos;
	}
	public void setRepositorios(String public_repos) {
		this.public_repos = public_repos;
	}
	public String getSeguidores() {
		return followers;
	}
	public void setSeguidores(String followers) {
		this.followers = followers;
	}
	
	@Override
	
    public String toString() {
        return "Nome [nome=" +name + ", Quantidade de repositorios=" + public_repos + ", seguidores=" + followers + "]";
    }

	
}
