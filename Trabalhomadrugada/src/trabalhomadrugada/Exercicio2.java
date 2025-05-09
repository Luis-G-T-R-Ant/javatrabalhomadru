package trabalhomadrugada;

import java.util.Scanner; //Importa Scanner

public class Exercicio2 {
	
	public static void main (String[]Args) {
		
		Scanner teclado = new Scanner(System.in); //Cria um objeto Scanner
		
		System.out.print("Digite a idade: ");
        int idade = teclado.nextInt();
        
        System.out.print("Está acompanhado? (1-sim/2-não): ");
        int acomp = teclado.nextInt();
        
        System.out.print("Tem autorização especial? (1-sim/2-não): ");
        int autori = teclado.nextInt();
        
        if (idade >= 18) {
            System.out.println("Acesso permitido");
        }
        else if(idade >= 16) {
        	if (acomp == 1 || autori == 1) {
        		 System.out.println("Acesso permitido");
        	}
        	else {
        		 System.out.println("Acesso negado");
        	}
        }
        else {
   		 System.out.println("Acesso negado");
        }
	}

}
