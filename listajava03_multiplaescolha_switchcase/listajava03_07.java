package listajava03_multiplaescolha_switchcase;

import java.util.Scanner;

public class listajava03_07 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 03 - Escolha, tern�rio, repeti��o
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*07. Escreva um programa para imprimir o menu abaixo:
 * 1 - Solteiro(a)
 * 2 - Desquitado(a)
 * 3 - Casado(a)
 * 4 - Divorciado(a)
 * 5 - Vi�vo(a)
 * O usu�rio dever� selecionar uma das op��es do menu. O programa dever� imprimir o estado civil de acordo com a op��o selecionada pelo usu�rio.
 * Uma mensagem de erro dever� ser emitida caso seja selecionada uma op��o inexistente. */

	System.out.println("Informe o n�mero para escolher uma das op��es de estado civil: \n");
	System.out.println("1 - Solteiro(a)");
	System.out.println("2 - Desquitado(a)");
	System.out.println("3 - Casado(a)");
	System.out.println("4 - Divorciado(a)");
	System.out.println("5 - Vi�vo(a)");
	
	
	int estadocivil = teclado.nextInt();
	
	
	switch (estadocivil)
	{
	case 1: System.out.println("Voc� � solteiro(a).");
	break;
	case 2: System.out.println("Voc� � desquitado(a)");
	break;
	case 3: System.out.println("Voc� � casado(a)");
	break;
	case 4: System.out.println("Voc� � Divorciado(a)");
	break;
	case 5: System.out.println("Voc� � vi�vo(a)");
	break;
	default: System.out.println("Op��o inv�lida");
	}

			
teclado.close();		
		
	}

}
