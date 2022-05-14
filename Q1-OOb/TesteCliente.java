package javaEclipse;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Marta","Feminino","Rua Montanha n312",21,1.8);
		Cliente cliente2 = new Cliente("Fabio Junior","Maculino","Av Sant Jhon",34,1.7);
		
		cliente1.exibirInf();
		System.out.println("\n************************************************************");
		cliente2.exibirInf();

	}

}
