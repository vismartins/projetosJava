import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente:");
		String nomeCliente = teclado.nextLine();
		
		System.out.println("Digite a renda bruta:");
		double rendaCliente = teclado.nextDouble();
		
		System.out.println("Digite a idade do cliente:");
		int idadeCliente = teclado.nextInt();
		
		if(rendaCliente>=3000 && idadeCliente>=18) {
			System.out.println("Parabéns "+nomeCliente+ " seu crédito foi aprovado!");
		}else {
			System.out.println("Infelizmente sua solicitação de crédito foi recusada.");
		}
		
		teclado.close();

	}

}
