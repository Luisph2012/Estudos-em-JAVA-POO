package Banco;

public class TesteContas {
	
	public static void main(String[] args) {
		//CONTA 1
		System.out.println("====================CONTA 1=====================");
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setCliente("Luis Philipe Vilara Ribeiro");
		conta1.setAgencia(9988);
		conta1.setNumConta(34558);
		conta1.setTipoConta(1);
		System.out.println("Tipo de Conta: " +conta1.TipoDeContaString());
		System.out.println("Nome do Cliente: "+conta1.getCliente());
		System.out.println("Agencia: "+conta1.getAgencia()+"-"+conta1.getTipoConta());
		System.out.println("Conta: "+conta1.getNumConta()+"-"+conta1.getTipoConta());
		//OPERACOES 1
		System.out.println("===================OPERACOES:===================");
		System.out.println("Saldo Atual: " + conta1.getSaldo() + "\n");
		conta1.depositar(7000);
		System.out.println("Saldo Atual: " + conta1.getSaldo() + "\n");
		conta1.sacar(500);
		System.out.println("Saldo Atual: " + conta1.getSaldo()+ "\n");
		conta1.depositar(12000);
		System.out.println("Saldo Atual: " + conta1.getSaldo()+ "\n");
		conta1.sacar(5600);
		System.out.println("Saldo Atual: " + conta1.getSaldo()+ "\n");
		conta1.depositar(24000);
		System.out.println("Saldo Atual: " + conta1.getSaldo()+ "\n");
		conta1.sacar(170000);
		System.out.println("Saldo Atual: " + conta1.getSaldo()+ "\n");
		
		//CONTA 2
		System.out.println("====================CONTA 2=====================");
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.setCliente("Ezequias Lira dos Santos");
		conta2.setAgencia(7534);
		conta2.setNumConta(86445);
		conta2.setTipoConta(2);
		conta2.setDiaHoje(8);
		System.out.println("Tipo de Conta: " +conta2.TipoDeContaString());
		System.out.println("Nome do Cliente: " +conta2.getCliente());
		System.out.println("Agencia: "+conta2.getAgencia()+"-"+conta2.getTipoConta());
		System.out.println("Conta: "+conta2.getNumConta()+"-"+conta2.getTipoConta());
		System.out.println("Data do Rendimento da Poupanca: " + conta2.getDiaRendimente());
		System.out.println("Dia: " + conta2.getDiaHoje());
		//OPERACOES 2
		System.out.println("===================OPERACOES:===================");
		conta2.setSaldo(10000);
		System.out.println("Saldo Atual: " + conta2.getSaldo() + "\n");
		System.out.println("Taxa Da Poupanca " +conta2.TaxaPol());
		conta2.calcularNovoSaldo();
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.depositar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.depositar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(1050);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(1050);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(7950);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.setDiaHoje(1);
		System.out.println("Dia de Hoje: " + conta2.getDiaHoje());
		System.out.println("Taxa Da Poupanca " +conta2.TaxaPol());
		conta2.setSaldo(10000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.calcularNovoSaldo();
		conta2.depositar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.depositar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(5000);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		conta2.sacar(10500);
		System.out.println("Novo Saldo: " + conta2.getSaldo()+ "\n");
		
		//CONTA 3
		System.out.println("====================CONTA 3=====================");	
		ContaEspecial conta3 = new ContaEspecial();
		conta3.setCliente("Matheus Salles");
		conta3.setAgencia(8754);
		conta3.setNumConta(18654);
		conta3.setTipoConta(3);
		System.out.println("Tipo de Conta: " +conta3.TipoDeContaString());
		System.out.println("Nome do Cliente: "+conta3.getCliente());
		System.out.println("Agencia: "+conta3.getAgencia()+"-"+conta3.getTipoConta());
		System.out.println("Conta: "+conta3.getNumConta()+"-"+conta3.getTipoConta());
		//OPERACOES 3
		System.out.println("===================OPERACOES:===================");
		conta3.setLimiteespecial(-2000);
		System.out.println("Limite da Conta Especial: " + (0 - conta3.getLimiteespecial())+ "\n");
		conta3.depositar(7000);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");
		conta3.sacarContaEspecial(7500);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");
		conta3.sacarContaEspecial(300);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");	
		conta3.sacarContaEspecial(1300);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");
		conta3.depositar(800);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");
		conta3.sacarContaEspecial(2000);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");
		conta3.sacarContaEspecial(1);
		System.out.println("Novo Saldo: " + conta3.getSaldo()+ "\n");	
	}
}
