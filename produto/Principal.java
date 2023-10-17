package produto;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto(13, "Album 1989 taylor´s Version", 1989.00);
		System.out.println("--------------PRODUTO-------------");
		System.out.println(produto.getId());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		Sorvete sorvete = new Sorvete(14, "Sorvete de Baunilha", 2.50, 0.2);
		System.out.println("--------------SORVETE-------------");
		System.out.println(sorvete.getId());
		System.out.println(sorvete.getNome());
		System.out.println(sorvete.getPreco());
		System.out.println(sorvete.getTempAdequada());
		Camisa camisa = new Camisa(15, "Camiseta new Romantics", 89.95, "Preta", "Algodão", "tamanho P");
		System.out.println("--------------CAMISA-------------");
		System.out.println(camisa.getId());
		System.out.println(camisa.getNome());
		System.out.println(camisa.getPreco());
		System.out.println(camisa.getCor());
		System.out.println(camisa.getTecido());
		System.out.println(camisa.getTamanho());
	}
}
