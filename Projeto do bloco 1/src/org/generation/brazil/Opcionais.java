package org.generation.brazil;

import java.util.Scanner;

public class Opcionais {
	
	public void EscolherOpcoes() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		int opcionais, quant1 = 0, quant2 = 0, totalop = 0;
		
		do {
		System.out.println(" =========OPCIONAIS=========");
		System.out.println();
		
		System.out.println("1. Borda recheada");
		System.out.println("2. Catupiry Extra");
		Thread.sleep(1500);
		System.out.println(" =====ESCOLHA UMA OP��O=====");
		Thread.sleep(800);
		
		opcionais = sc.nextInt();
		
		switch(opcionais) {
		case 1:
			System.out.println("Voc� escolheu borda recheada!");
			Thread.sleep(1500);
		break;
		case 2:
			System.out.println("Voc� escolheu catupiry extra!");
			Thread.sleep(1500);
		break;
		default:
			System.out.println("Op��o inv�lida!");
			Thread.sleep(1500);
		}
		
		totalop = quant1 + quant2;
		
		
		System.out.println("Deseja outra opcional? [s,n]-->");
		Thread.sleep(1000);
		}
		while(sc.next().equals("s".toLowerCase()));	

		System.out.println("Voc� escolheu " + totalop + " opcional");
		

	}

}
