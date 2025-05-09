package trabalhomadrugada;

import java.util.Scanner; //Importa Scanner

public class Exercicio4 {
	
public static void main (String[]Args) {
		
		//coleta de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do saque (10-1000): ");
        int valor = teclado.nextInt();
        
     // Verifica se o valor está dentro dos limites permitidos
        if (valor < 10 || valor > 1000) {
            System.out.println("Valor inválido. Deve ser entre 10 e 1000.");
            return;
        }
        
        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int resto = valor;
        
        // Cálculo das notas de 100
        if (resto >= 100) {
            notas100 = resto / 100;
            resto = resto - (notas100 * 100);
        }
        
        // Cálculo das notas de 50
        if (resto >= 50) {
            notas50 = 1;
            resto = resto - 50;
        }
        
        // Cálculo das notas de 20
        if (resto >= 20) {
            notas20 = resto / 20;
            resto = resto - (notas20 * 20);
        }
        
        // Cálculo das notas de 10
        if (resto >= 10) {
            notas10 = resto / 10;
            resto = resto - (notas10 * 10);
        }
        
        // Exibe o resultado
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
	}
}
