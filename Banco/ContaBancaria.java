package Banco;

public class ContaBancaria {
	
	private String cliente;
	private int agencia;
	private int numConta;
	public int TipoConta; 
		//1 = Conta Corrente 
		//2 = Conta Poupanca 
		//3 = Conta Especial
	
	protected double saldo;
	
	
	//METODOS
	
	
	
	public void depositar(double deposito){
		this.saldo += deposito;
		System.out.println("Deposito de " + deposito + " Efetuado com Sucesso!");
	}public boolean sacar(double saque){
		if((this.saldo-saque)>=0){
			this.saldo -= saque;
			System.out.println("Saque de " + saque + " Efetuado com Sucesso!");
			return true;}
		else{
			System.out.println("Saque de "+saque+ " Nao Efetuado! Saldo Insuficiente!");
			return false;
			}
		}
	
	//METODOS
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getTipoConta() {
		return TipoConta;
	}
	public void setTipoConta(int tipoConta) {
		TipoConta = tipoConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String TipoDeContaString() {
	if(this.TipoConta == 1) {
		return "Conta Corrente";
	}else if (this.TipoConta == 2) {
		return "Conta Poupanca";
	}else {
		return "Conta Especial";
		}
	}
	
	
}



