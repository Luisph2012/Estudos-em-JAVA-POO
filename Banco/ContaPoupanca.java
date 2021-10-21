package Banco;

public class ContaPoupanca extends ContaBancaria{
	private int DiaRendimente = 5;
	private int DiaHoje;
	
public double TaxaPol() {
	if(this.DiaHoje >= this.DiaRendimente ) {
		return super.saldo * 0.005;
	}else { 
		return 0;}
	}
	
public double calcularNovoSaldo() {
	double taxa = super.saldo * 0.005;
	if(this.DiaHoje >= this.DiaRendimente ) {
		super.saldo += taxa;
		return super.saldo;
	}else {
		return super.saldo;
	}
}


	
//GET=SET
	public int getDiaRendimente() {
		return DiaRendimente;
	}
	public int getDiaHoje() {
		return DiaHoje;
	}
	public void setDiaHoje(int diaHoje) {
		this.DiaHoje = diaHoje;
	}
	
		
	
	
	
	
	
	

}
