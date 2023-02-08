package pencionato;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[11];

		System.out.print("Quantos quartos serão alugados?");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nAluguel # " + i + " :");
			ler.nextLine();
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("email: ");
			String email = ler.next();
			System.out.print("Quarto: ");
			int quarto = ler.nextInt();
			vect[quarto] = new Aluguel(nome, email);
		}

		System.out.println("\nQuartos Ocupados:");
		System.out.println();
		for (int i = 0; i < 11; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		ler.close();
	}

}
