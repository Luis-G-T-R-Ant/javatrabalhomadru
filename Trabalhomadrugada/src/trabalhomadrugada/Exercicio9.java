package trabalhomadrugada;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
     //dados
        System.out.print("Digite a temperatura: ");
        double temperatura = teclado.nextDouble();
        
        System.out.print("Digite a unidade de origem (C para Celsius, F para Fahrenheit): ");
        char unidade = teclado.next().charAt(0);
        		
        double temperaturaConvertida =0;
        char unidadeDestino =0;
        
        if (unidade == 'C' || unidade == 'c') {
            // Conversão C para F
            temperaturaConvertida = (temperatura * 9/5) + 32;
            unidadeDestino = 'F';
        } else if (unidade == 'F' || unidade == 'f') {
            // Conversão de F para C
            temperaturaConvertida = (temperatura - 32) * 5/9;
            unidadeDestino = 'C';
        } else {
        }
        System.out.println("Temperatura convertida:" + temperaturaConvertida + unidadeDestino);
    }
}