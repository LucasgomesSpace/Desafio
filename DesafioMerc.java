package desafiomerc;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class DesafioMerc {

	public static void main(String[] args) {
		ArrayList<String> merc = new ArrayList<String>();
		Scanner ler = new Scanner (System.in);

		int  op , valor = 0;

		do {
			try {
				System.out.println("Produtos da loja ");
				System.out.println("Digite o código dos produtos, para adicionar ao carrinho.");

				System.out.println("1 - Arroz  ......................R$ 8,00");
				System.out.println("2 - Feijão ......................R$ 5,00");
				System.out.println("3 - Carne  ......................R$ 20,00");
				System.out.println("4 - Batata ...................... R$ 4,00");
				System.out.println("5 - Alface  ......................R$ 3,00");
				System.out.println("6 - Bolacha  ......................R$ 6,00");
				System.out.println("");
				System.out.println("0 - Para sair ");
				System.out.println("Qual deseja comprar? ");
				op = ler.nextInt();

				System.out.println("numero não reconhecido");

				if(op == 1) {
					valor += 8;
					merc.add("Arroz");

				}
				if(op == 2) {
					valor += 5;
					merc.add("Feijão");

				}	
				if(op == 3) {
					valor += 20;
					merc.add("Carne");

				}	
				if(op == 4) {
					valor += 4;
					merc.add("Batata");

				}
				if(op == 5) {
					valor += 3;
					merc.add("Alface");

				}
				if(op == 6) {
					valor += 6;
					merc.add("Bolacha");

				}
				else {
					valor += 0;
				}
//Problema 
			}
			while (op != 0 ) ;
		

		}catch (InputMismatchException erro) {
			System.out.println("Digite um numero legivel!!!");

		}

//problema 
		System.out.println("Sua lista de produtos é: ");

		for (String p : merc) {
			System.out.println("["+p +"]");
		}
		System.out.println("Sua compra tem o total de R$ " + valor);



		ler.close();
	}
}
