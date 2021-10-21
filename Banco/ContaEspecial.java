package Banco;

public class ContaEspecial extends ContaBancaria{
	
	
	private double limiteespecial;
	
	public boolean sacarContaEspecial(double saque){
		if((super.saldo - saque)>= limiteespecial){
			super.saldo -= saque;
			System.out.println("Saque Especial de " + saque + " Efetuado com Sucesso!");
			return true;}
		else{
			System.out.println("Saque Especial de "+saque+ " Nao Efetuado! Saldo Insuficiente!");
			return false;
			}
		}

	public double getLimiteespecial() {
		return limiteespecial;
	}

	public void setLimiteespecial(double limiteespecial) {
		this.limiteespecial = limiteespecial;
	}
	

	
	
	
	
	
	

}
