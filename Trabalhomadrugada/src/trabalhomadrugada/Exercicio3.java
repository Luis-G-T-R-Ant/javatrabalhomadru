package trabalhomadrugada;

import java.util.Scanner; //Importa Scanner

public class Exercicio3 {
	
	public static void main (String[]Args) {
		
		//coleta de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Seu Nome:");
		String nome = teclado.nextLine();
		
		System.out.println ("Nota 1:");
		int nota1 = teclado.nextInt();
		
		System.out.println ("Nota 2:");
		int nota2 = teclado.nextInt();
		
		//calculo média
		double media = (nota1+nota2)/2.0;
				
		if (media >= 7) {
            System.out.println("Parabens! " + nome + " você está aprovado(a)!");
        } 
        else if (media >= 5) {  
            System.out.println(nome + ", você está de recuperação");
        }
        else {
            System.out.println(nome + ", você está reprovado(a)");
        }
	}
}
