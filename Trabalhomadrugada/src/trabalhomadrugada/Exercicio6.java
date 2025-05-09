package trabalhomadrugada;

import java.util.Scanner; //Scanner

public class Exercicio6 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); //Objeto
	        
	        // Entrada de dados
	        System.out.print("Digite seu nome: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite seu peso (kg): ");
	        double peso = scanner.nextDouble();
	        
	        System.out.print("Digite sua altura (m): ");
	        double altura = scanner.nextDouble();
	        
	        // Cálculo do IMC
	        double imc = peso / (altura * altura);
	        
	        String classificacao;
	        
	        if (imc < 18.5) {
	            classificacao = "Abaixo do peso";
	        } else if (imc <= 24.9) {
	            classificacao = "Normal";
	        } else if (imc <= 29.9) {
	            classificacao = "Sobrepeso";
	        } else {
	            classificacao = "Obesidade";
	        }
	        
	        // Saída dos resultados
	        System.out.println("\nResultado para " + nome + ":");
	        System.out.printf("IMC calculado: %.2f%n", imc);
	        System.out.println("Classificação: " + classificacao);
	 }
}
