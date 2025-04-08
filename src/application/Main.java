package application;


public class Main {

	public static void main(String[] args) {
		

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf("060.045.825-30");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.valorEmprestimo(400);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
