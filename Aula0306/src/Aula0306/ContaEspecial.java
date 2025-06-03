package Aula0306;

public class ContaEspecial  extends Conta{
	private double limite;

	public ContaEspecial() {
		super();
		this.limite = 0.0;
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	
	public ContaEspecial(String n, int num, double v, double l) {
		super(n, num, v);
		this.limite = l;
	}
	
	public void imprimeDados() {
		System.out.printf("\n\nDADOS DO CLIENTE %s",this.getNome_Titular());
		System.out.printf("\nNumero da conta: %d", this.getNumero());
		System.out.printf("\nSldo: %.2f", this.getSaldo());
		System.out.printf("\nLimite: %.2f", this.getLimite());
	}

	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
