
public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro("sei lá",2007,60000.00);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.printf("%.2f%n",carro1.getPreco());
		
		carro1.setModelo("fiat uno");
		carro1.setAno(2005);
		carro1.setPreco(23000.00);
		
		System.out.println();
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.printf("%.2f%n",carro1.getPreco());
	}

}
