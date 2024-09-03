package aplication;
import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("digite dados do produto: ");
		System.out.print("Nome: ");

		produto.nome = sc.nextLine();
		
		System.out.print("quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.print("preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.println();

		System.out.print("Produto " + produto);
		System.out.println();

		
		System.out.print("adicione item: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println();

		
		System.out.print("produto atualizado " + produto);
		System.out.println();

		System.out.print("remova item: ");
		quantidade = sc.nextInt();
		produto.remProduto(quantidade);
		System.out.println();

		
		System.out.print("produto atualizado " + produto);
		
		
		
		
		
		
		
		sc.close();
	
	
	}

}
