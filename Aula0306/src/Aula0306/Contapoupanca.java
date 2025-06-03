package Aula0306;

public class Contapoupanca extends Conta {

	public Contapoupanca() {
		super();
	}

	public Contapoupanca(String n, int num, double v) {
		super(n, num, v);
	
	}
	public void reajustar(double percent) {
		double reajuste = this.getSaldo() * percent;
		this.depositar(reajuste);
		
	}
	
}
