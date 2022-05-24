package listajava03_multiplaescolha_switchcase;

import java.util.Scanner;

public class listajava03_08 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*08. Implemente um programa que realize uma das quatro opera��es (+), (-), (*) ou (/) entre duas vari�veis
 * a partir da escolha do usu�rio.*/

	System.out.println("Digite '+', '-', '*' ou '/' para escolher qual opera��o matem�tica deseja realizar: \n");
	System.out.println("+ - Adi��o");
	System.out.println("- - Subtra��o");
	System.out.println("* - Multiplica��o");
	System.out.println("/ - Divis�o \n");
	
	String operacao = teclado.next();
	
	System.out.println("Escolha o primeiro n�mero da opera��o: ");
	double num1 = teclado.nextDouble();
	System.out.println("Escolha o segundo n�mero da opera��o: ");
	double num2 = teclado.nextDouble();
		

	switch (operacao)
	{
	case "+": 
		{
			double adicao = num1 + num2;
			
			System.out.println(num1 + " + " + num2 + " = " + adicao);
		}
	break;
	
	case "-": 
		{
			double subtra��o = num1 - num2;
			
			System.out.println(num1 + " - " + num2 + " = " + subtra��o);
		}
	break;
	
	case "*": 
		{
			double multiplicacao = num1 * num2;
			
			System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
		}
	break;
	
	case "/": 
		{
			double divisao = num1 / num2;
			
			System.out.println(num1 + " / " + num2 + " = " + divisao);
		}
	break;
	
	default: System.out.println("Op��o inv�lida");
	}

			
teclado.close();		
		
	}

}
