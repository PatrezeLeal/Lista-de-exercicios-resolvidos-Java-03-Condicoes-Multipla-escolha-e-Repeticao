package listajava03_multiplaescolha_switchcase;

import java.util.Scanner;

public class listajava03_05 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*05. Fa�a um programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra, imprimir: "F - Feminino", "M - Masculino", "Sexo Inv�lido". */

	System.out.println("Informe 'F' para feminino ou 'M' para masculino: ");
	String foum = teclado.next();
	
	
	switch (foum.toUpperCase())
	{
	case "F": System.out.println("Feminino.");
	break;
	case "M": System.out.println("Masculino.");
	break;
	default: System.out.println("Sexo inv�lido.");
	}

			
teclado.close();		
		
	}

}
