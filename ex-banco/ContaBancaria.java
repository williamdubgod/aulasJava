package poo;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	
	 public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	ContaBancaria() {
		
	}
	
	 ContaBancaria(String agencia, String numero) {
		 this.agencia = agencia;
		 this.numero = numero;
		 this.saldo = 0;
	 }
	 
	 void Depositar(double valorDepositado) {
		 this.saldo += valorDepositado;
	 }
	 
	 public void Sacar(double valor) {
	        this.saldo = this.saldo - valor;
	    }

	 
	 public void Transferir(double valorTransf, Cliente destinatario) {
	        Sacar(valorTransf);
	        destinatario.getConta().Depositar(valorTransf);
	 } 
	 
	 double ConsultarSaldo() {	 
		return this.saldo;
	 }
	
}
