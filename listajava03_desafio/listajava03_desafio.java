package listajava03_desafio;

import java.util.Scanner;

public class listajava03_desafio {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*DESAFIO
 * Escreva um programa que leia os n�meros de 1999 para 100 e:
 * a) Mostre quais s�o divis�veis por 11: 
 *    quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares;
 * b) Mostre quais n�o s�o divis�veis por 11 cujo m�dulo da divis�o por 11 seja 5: 
 *    quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares;
 * c) Informe a quantidade de n�meros de 1999 a 100;
 * d) Informe a soma dos n�meros de 1999 a 100.*/


/*a) Mostre quais s�o divis�veis por 11: 
quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares; */

int contadorgeralA = 0;
int contadorparesA = 0;
int contadorimparesA = 0;

int somaA = 0;

	for (int numeroA = 1999; numeroA >= 100; numeroA--)
	{
		
		if (numeroA %11 == 0)
		{
			contadorgeralA++;
			
			System.out.println(numeroA);
			
			somaA = somaA + numeroA;
			
			if (numeroA %2 == 0) contadorparesA++;
			else contadorimparesA++;
			
		}
				
	}
	
	System.out.println("Quantos n�meros divis�veis por 11 de 1999 a 100: " + contadorgeralA);
	System.out.println("A soma dos n�meros divis�veis por 11 de 1999 a 100: " + somaA);
	System.out.println("Quantos n�meros pares divis�veis por 11 de 1999 a 100: " + contadorparesA);
	System.out.println("Quantos n�meros �mpares divis�veis por 11 de 1999 a 100: " + contadorimparesA);


/*b) Mostre quais n�o s�o divis�veis por 11 cujo m�dulo da divis�o por 11 seja 5: 
quantos s�o, qual o resultado da soma entre esses n�meros, quantos s�o pares e quantos s�o �mpares; */
	
int contadorgeralB = 0;
int contadorparesB = 0;
int contadorimparesB = 0;

int somaB = 0;

	for (int numeroB = 1999; numeroB >= 100; numeroB--)
	{
		
		if (numeroB %11 == 5)
		{
			
			contadorgeralB++;
			
			System.out.println(numeroB);
			
			somaB = somaB + numeroB;
			
			if (numeroB %2 == 0) contadorparesB++;
			else contadorimparesB++;
				
		}
		
	}
	
	System.out.println("Quantos n�meros n�o divis�veis por 11 com m�dulo 5 de 1999 a 100: " + contadorgeralB);
	System.out.println("A soma dos n�meros n�o divis�veis por 11 com m�dulos 5 de 1999 a 100: " + somaB);
	System.out.println("Quantos n�meros pares n�o divis�veis por 11 com m�dulo 5 de 1999 a 100: " + contadorparesB);
	System.out.println("Quantos n�meros �mpares divis�veis por 11 com m�dulo 5 de 1999 a 100: " + contadorimparesB);
	
	
/*c) Informe a quantidade de n�meros de 1999 a 100; */
	
int contadorgeralC = 0;

	for (int numeroC = 1999; numeroC >= 100; numeroC--)
	{
		
		contadorgeralC++;
		
	}
	
	System.out.println("Quantidade de n�meros de 1999 a 100: " + contadorgeralC);
	
	
/*d) d) Informe a soma dos n�meros de 1999 a 100.*/
	
int somaD = 0;

	for (int numeroD = 1999; numeroD >= 100; numeroD--)
	{
		somaD = somaD + numeroD;
	}
	
	System.out.println("Soma dos n�meros de 1999 a 100: " + somaD);
	
teclado.close();		
		
	}

}
