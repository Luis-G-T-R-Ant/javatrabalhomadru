package trabalhomadrugada;

import java.util.Scanner; //Importa Scanner

public class Exercicio1 {
	public static void main (String[]Args) {
		
		Scanner teclado = new Scanner(System.in); //Cria um objeto Scanner
		
		System.out.println ("Seu Nome:");
		String nome = teclado.nextLine(); //le o input
		
		System.out.println("Digite sua categoria: 1-Normal, 2-Bronze, 3-Prata, 4-Ouro");
		double categoria = teclado.nextDouble();//Le a categoria do cliente
		
		System.out.println("Valor da compra:");
		double valor = teclado.nextDouble(); //Le o valor da compra
		
		double desconto = 0; //desconto base
		String nomecat = ("Normal"); //nome da categoria
		
		if (categoria == 1) { //categoria normal
			desconto = 0;
		}
		else if (categoria == 2) { //categoria Bronze, desconto de 10%
			desconto = 0.10; // atualiza desconto
			nomecat = ("Bronze"); //atualiza nome
		}
		else if (categoria == 3) {
			desconto = 0.15;
			nomecat = ("Prata");
		}
		else if (categoria == 4) {
			desconto = 0.20;
			nomecat = ("Ouro");
		}
		
		double valorFin = valor*(1-desconto);
		
		System.out.println("Nome do cliente: " +nome);
		System.out.println("Categoria: " +nomecat);
		System.out.println("Valor original: R$ " +valor);
		System.out.println("Valor com desconto: R$ " +valorFin);
	}
		}