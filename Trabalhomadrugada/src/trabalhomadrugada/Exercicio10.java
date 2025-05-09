package trabalhomadrugada;

import java.util.Scanner; //Importa Scanner

public class Exercicio10 {
 
	public static void main (String[]Args) {
		
		Scanner teclado = new Scanner(System.in); //Cria um objeto Scanner
		
		System.out.println ("Ultimo digito da sua placa:");
		double placa = teclado.nextDouble(); //le o input
		String dia = "";
		
		if (placa==1 || placa==2) {
			 dia = ("Segunda");
		}
		else if (placa==3 || placa==4) {
			 dia = ("Terça");
		}
		else if (placa==5 || placa==6) {
			 dia = ("Quarta");
		}
		else if (placa==7 || placa==8) {
			 dia = ("Quinta");
		}
		else if (placa==9 || placa==0) {
			 dia = ("Sexta");
		}
		System.out.println("Dia da semana: " +dia);
		
	}
	
}
