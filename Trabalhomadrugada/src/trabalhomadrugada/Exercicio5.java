package trabalhomadrugada;

import java.util.Scanner; //Importa Scanner

public class Exercicio5 {

public static void main (String[]Args) {
		
		Scanner teclado = new Scanner(System.in); //Cria um objeto Scanner
		
		System.out.println ("Insira seu salario mensal:");
		double salario = teclado.nextDouble(); //le o input
		
		System.out.println ("Insira o valor do emprestimo:");
		double emprestimo = teclado.nextDouble();
		
		System.out.println ("Insira o numero de parcelas de 1 a 12:");
		int parcelas = teclado.nextInt(); 
		
		double valorParcelas = emprestimo / parcelas;
		
		if (parcelas >(salario*0.30)){
			System.out.println("Emprestimo reprovado");
		}
		else {
			System.out.println ("Valor da parcela: R$" +valorParcelas);
			System.out.println ("Emprestimo Aprovado");
		}
	}
}