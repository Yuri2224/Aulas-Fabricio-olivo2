package Aula0306;

public class Programa {

	
		public static void main(String[] args) {
			 Conta c1 = new Conta("Ana Beatriz", 456, 200.0); // c1 é um objeto
			 Conta paulo = new Conta("Paulo Oliveira", 321, 50.0);
			 
			 c1.depositar(500.0);
			 c1.sacar(401.0);
			 c1.depositar(1000.0);
			 
			 paulo.depositar(500.0);
			 paulo.sacar(100.0);
			 
		
	}

}
