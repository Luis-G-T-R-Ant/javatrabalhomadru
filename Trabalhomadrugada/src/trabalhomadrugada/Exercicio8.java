package trabalhomadrugada;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		// Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado A: ");
        double ladoA = scanner.nextDouble();
        
        System.out.print("Digite o valor do lado B: ");
        double ladoB = scanner.nextDouble();
        
        System.out.print("Digite o valor do lado C: ");
        double ladoC = scanner.nextDouble();
        
        // Verificação
        boolean oTriangulo = (ladoA + ladoB > ladoC) &&
                              (ladoA + ladoC > ladoB) &&
                              (ladoB + ladoC > ladoA);
        
        // resultado
        if (oTriangulo) {
            System.out.println("Os valores formam um triângulo válido.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo válido.");
        }	
	}
}
