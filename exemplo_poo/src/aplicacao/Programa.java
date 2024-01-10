package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto(); 
		
		System.out.println("Digite as informações do produto:");
		
		System.out.println("Produto: ");
		produto.nome = teclado.next();
		
		System.out.println("Preço: ");
		produto.preco = teclado.nextDouble();
		
		System.out.println("Quantidade: ");
		produto.quantidade = teclado.nextDouble();
		
		System.out.println("Confirma Produto: "+produto.nome+", o preço é R$"+produto.preco+" estoque atual é "+produto.quantidade+" .O total em estoque é R$");
		System.out.printf("%.2f",produto.quantidade*produto.preco);
		System.out.println();
		
		System.out.println("Deseja adicionar mais produtos ao estoque?");
		int quantidade = teclado.nextInt();
		produto.addProduto(quantidade);
		System.out.printf("%.2f",produto.quantidade*produto.preco);
		System.out.println();
		
		System.out.println("Estoque Atual: "+produto.nome+", o preço é R$"+produto.preco+" e o estoque atual é "+produto.quantidade+" .O total em estoque é R$");
		
		System.out.println("Deseja remover produtos do estoque?");
		quantidade = teclado.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println("Estoque Atual: "+produto.nome+", o preço é R$"+produto.preco+" e o estoque atual é "+produto.quantidade+" .O total em estoque é R$");
		System.out.printf("%.2f",produto.quantidade*produto.preco);
		System.out.println();
		teclado.close();
	}

}
