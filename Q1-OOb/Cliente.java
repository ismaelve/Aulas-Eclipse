package javaEclipse;//Questão 1- Orientação a objetos

public class Cliente {

	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.*/
		
	//apresentar atributos
	//apresentar métodos construtor
	
	private String nome;
	private String sexo;
	private String endereco;
	private int idade;
	private double altura;
	
	public Cliente(String nome,String sexo,String endereco, int idade, double altura) {
		
		this.nome=nome;
		this.sexo=sexo;
		this.endereco=endereco;
		this.idade=idade;
		this.altura=altura;
		}
	
	public void exibirInf(){
		System.out.println("\nNome Cliente: "+getNome());
		System.out.println("\nSexo Cliente: "+getSexo());
		System.out.println("\nEndereço Cliente: "+getEndereco());
		System.out.println("\nIdade Cliente: "+getIdade());
		System.out.println("\nAltura Cliente: "+getAltura());
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
}
