package Empresa;

public class TesteSaidaDeDados {
	
	public static void main(String[] args) {
				System.out.println("------------CLIENTES------------\n");
				System.out.println("       -----CLIENTE 1-----");
		Cliente cliente1 = new Cliente ();
				
				cliente1.setNome("Marcos Saldanha Souza");
				cliente1.setIdade(43);
				cliente1.setSexo("Masculino");
				cliente1.setValorDivida(780);
				cliente1.setAnoNascim(1977);
				
				System.out.println("\nCliente: "+ cliente1.getNome());
				System.out.println("Idade: "+ cliente1.getIdade());
				System.out.println("Sexo: "+ cliente1.getSexo());
				System.out.println("Valor da Divida: R$ "+ cliente1.getValorDivida());
				System.out.println("Data de Nascimente: "+ cliente1.getAnoNascim()+"\n");
				
				System.out.println("       -----CLIENTE 2-----");
				Cliente cliente2 = new Cliente ();
						
						cliente2.setNome("Silvano Andrade Baltar");
						cliente2.setIdade(68);
						cliente2.setSexo("Masculino");
						cliente2.setValorDivida(3510);
						cliente2.setAnoNascim(1952);
						
						System.out.println("\nCliente: "+ cliente2.getNome());
						System.out.println("Idade: "+ cliente2.getIdade());
						System.out.println("Sexo: "+ cliente2.getSexo());
						System.out.println("Valor da Divida: R$ "+ cliente2.getValorDivida());
						System.out.println("Data de Nascimente: "+ cliente2.getAnoNascim()+"\n");
						
						System.out.println("       -----CLIENTE 3-----");
						Cliente cliente3 = new Cliente ();
								
								cliente3.setNome("Leandro Souza de Matos");
								cliente3.setIdade(37);
								cliente3.setSexo("Masculino");
								cliente3.setValorDivida(6891);
								cliente3.setAnoNascim(1983);
								
								System.out.println("\nCliente: "+ cliente3.getNome());
								System.out.println("Idade: "+ cliente3.getIdade());
								System.out.println("Sexo: "+ cliente3.getSexo());
								System.out.println("Valor da Divida: R$ "+ cliente3.getValorDivida());
								System.out.println("Data de Nascimente: "+ cliente3.getAnoNascim()+"\n");		
				
				
				System.out.println("------------GERENTE-------------\n");
				System.out.println("       -----GERENTE 1-----");
		Gerente gerente1 = new Gerente();
				
				gerente1.setNome("Gilberto Carvalho Alcantra");
				gerente1.setSalario(5950);
				gerente1.setValorVendas(105000);
				gerente1.setQntVendas(621);
				
				System.out.println("\nGerente: "+ gerente1.getNome());
				System.out.println("Salario: R$ "+ gerente1.getSalario());
				System.out.println("Total de Vendas: "+ gerente1.getQntVendas());
				System.out.println("Valor Das Vendas: R$ "+ gerente1.getValorVendas()+"\n");
				
				
				System.out.println("------------DIRETOR-------------\n");
				System.out.println("       -----DIRETOR 1-----");
		Diretor diretor1 = new Diretor(); 
				
				diretor1.setNome("Andre Avelar Dantas");
				diretor1.setIdade(61);
				diretor1.setMatricula("2780651-32");
				diretor1.setNomeDiretoria("Setor Comercial");
				diretor1.setSalario(13547);
				
				System.out.println("\nDiretor: " + diretor1.getNome());
				System.out.println("Idade: "+diretor1.getIdade());
				System.out.println("Matricula: "+diretor1.getMatricula());
				System.out.println("Nome da Diretoria: "+diretor1.getNomeDiretoria());
				System.out.println("Valor do Inss do Diretor: "+diretor1.valorInss()+"\n");
				
				System.out.println("       -----DIRETOR 2-----");
				Diretor diretor2 = new Diretor(); 
						
						diretor2.setNome("Carlos Saldanha Ribeiro");
						diretor2.setIdade(65);
						diretor2.setMatricula("1532158-14");
						diretor2.setNomeDiretoria("Setor Administrativo");
						diretor2.setSalario(15874);
						
						System.out.println("\nDiretor: " + diretor2.getNome());
						System.out.println("Idade: "+diretor2.getIdade());
						System.out.println("Matricula: "+diretor2.getMatricula());
						System.out.println("Nome da Diretoria: "+diretor2.getNomeDiretoria());
						System.out.println("Valor do Inss do Diretor: "+diretor2.valorInss());
		
				
				
		
		
	
		
		
		
		
		
		
		
	}
}
