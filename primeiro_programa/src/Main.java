import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Por favor inisra seu nome: ");
		String cliente = teclado.nextLine();
		
		System.out.print("O X-Bacon custa $29,90. Quantos lanches você quer?");
		int quantidade = teclado.nextInt();
				
		double preco = 29.90;
		
		System.out.print("Pronto "+cliente+" o total do seu pedido é R$");
		System.out.printf("%.2f",quantidade*preco);
		teclado.close();
	}

}
