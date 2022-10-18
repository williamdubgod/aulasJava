package POO;

public class Cliente {
	   
    private int id;
    private String nome;
    private int idade;
    private String email;
    private ContaBancaria conta;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ContaBancaria getConta() {
        return conta;
    }
    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }
   
    Cliente(){
       
    }
   
    Cliente(int id,String nome,int idade,String email,ContaBancaria conta){
        this.id=id;
        this.nome=nome;
        this.idade=idade;
        this.email=email;
        this.conta=conta;
    }
   
    public void atualizarEmail(String novoEmail){
        this.email=novoEmail;
    }
   
    public String exibirCliente() {
        return("ID: "+this.id+ " - Nome: " + this.nome + " - Idade: " + this.idade + " - Email: " + this.email);
    }
   
    public String exibirDadosConta() {
        return("Agencia: "+this.conta.getAgencia()+" - Numero: "+this.conta.getNumero()+" - Saldo: "+this.conta.getSaldo());
    }
}
