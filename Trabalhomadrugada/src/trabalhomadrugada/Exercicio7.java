package trabalhomadrugada;

import java.util.Scanner;

public class Exercicio7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); //Objeto
	        
	        //Dados
	        System.out.print("Digite seu nome: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite sua idade: ");
	        int idade = scanner.nextInt();
	        
	        //calculo
	        double valor;
	        if (idade < 12) {
	        	valor = 10.00;
	        }
	        else if (idade <=17) {
	        	valor = 15.00;
	        }
	        else if (idade <=64) {
	        	valor = 20.00;
	        }
	        else {
	        	valor = 12.00;
	        }
	        System.out.println ("nome: " +nome);
	        System.out.println ("Idade: " +idade);
	        System.out.println ("Valor: " +valor);
	 }
}
