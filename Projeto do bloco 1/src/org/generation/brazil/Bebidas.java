package org.generation.brazil;
import java.util.Scanner;

public class Bebidas {
	
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int bebidas = 0, quant1 = 0, quant2 = 0, quant3 = 0, totalbe = 0;
		String continuar;
		
		do {
		System.out.println(" >>>>>CAT�LOGO<<<<<<");
		System.out.println(">>>>> Escolha a sua bebida! <<<<<<");
		
		System.out.println("1. Refrigerante");
		System.out.println("2. �gua");
		System.out.println("3. Suco");
		System.out.println("==================================");
		bebidas = sc.nextInt();
		
		switch(bebidas) {
		case 1:
			System.out.println("Voc� escolheu Refrigerante!");
			System.out.println("Quantos voc� deseja?");
			quant1 = sc.nextInt();
			System.out.println("Deseja mais alguma bebida? (S ou N)");
		break;
		case 2:
			System.out.println("Voc� escolheu �gua!");
			System.out.println("Quantas voc� deseja?");
			quant2 = sc.nextInt();
			System.out.println("Deseja mais alguma bebida? (S ou N)");
		break;
		case 3:
			System.out.println("Voc� escolheu Suco!");
			System.out.println("Quantas voc� deseja?");
			quant3 = sc.nextInt();
			System.out.println("Deseja mais alguma bebida? (S ou N)");
		break;
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		continuar = sc.next();
		totalbe = quant1 + quant2 + quant3;
		
		}
		while(continuar.equals("s") || continuar.equals("S"));
		
		System.out.println("Voc� escolheu " + totalbe + " bebidas");
	

	}

	
}