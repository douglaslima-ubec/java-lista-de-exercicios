public class Carro {
	
	private String modelo;
	private int ano;
	private double preco;

	public Carro(String modelo, int ano, double preco) {
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public double getPreco() {
		return this.preco;
	}
}
