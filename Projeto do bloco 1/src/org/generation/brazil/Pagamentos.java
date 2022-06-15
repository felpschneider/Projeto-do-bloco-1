package org.generation.brazil;

import java.util.Scanner;

public class Pagamentos {

	public Scanner entrada = new Scanner(System.in);
	
	private double valorPizzas = 144;

	@SuppressWarnings("unused")
	private double valorPago;

	public void telaInicialPagamentos() throws InterruptedException {
		System.out.println("O valor total foi de R$" + valorPizzas);
		Thread.sleep(1000);
		escolhaDoPagamento();
	}

	public void escolhaDoPagamento() throws InterruptedException {
		System.out.println("\nEscolha o meio de pagamento:\n\n1. Cart�o de Cr�dito/D�bito/VR."
				+ "\n2. Dinheiro.\n3. Pix.");
		Thread.sleep(1000);
		System.out.println("\nDigite o n�mero do meio escolhido: ");
		Thread.sleep(1000);
		byte meioDePagamento = entrada.nextByte();
		Thread.sleep(1000);

		switch (meioDePagamento) {
		case 1:
			pagamentoPorCartao();
			break;
		case 2:
			pagamentoDinheiro();
			break;
		case 3:
			pagamentoEmPix();
			break;
		default:
			do {
				System.out.println("Escolha uma op��o v�lida. Digite 1 para voltar a tela de escolha: ");
				meioDePagamento = entrada.nextByte();
			} while (meioDePagamento != 1 && meioDePagamento != 2 && meioDePagamento != 3);
			escolhaDoPagamento();
		}

	}

	public void pagamentoDinheiro() throws InterruptedException {
		System.out.println("Pagamento em Dinheiro selecionado.\nPrecisa de troco?\n1. Sim.\n2. N�o.");
		Thread.sleep(1500);
		byte troco = entrada.nextByte();
		Thread.sleep(500);
		
		if (troco == 1) {
			sistemaDeTroco();
		} else if (troco == 2) {

		} else {
			do {
				System.out.println("Op��o inv�lida. Digite 1 para tentar novamente.");
				troco = entrada.nextByte();
			} while (troco != 1 && troco != 2);

			pagamentoDinheiro();
		}
	}

	public void sistemaDeTroco() throws InterruptedException {
		System.out.println("Para quanto?");
		valorPago = entrada.nextDouble();
		Thread.sleep(500);

		double troco = valorPago - valorPizzas;
		System.out.printf("Levaremos seu troco de R$" + troco);
	}

	public void pagamentoEmPix() throws InterruptedException {
		System.out.println(
				"Pagamento por PIX selecionando.\nPara efetuar o pagamento copie e cole o c�digo abaixo na aba PIX do aplicativo do seu banco.");
		Thread.sleep(1500);
		System.out.println("\n7163e29e-bdaf-4f02-b492-90e161b9ede7");
		Thread.sleep(10000);
		System.out.println("\nPagamento confirmado.");
		Thread.sleep(1500);
	}

	public void pagamentoPorCartao() throws InterruptedException {
		System.out.println("Pagamento por cart�o selecionado.\nSelecione a op��o: ");
		Thread.sleep(500);
		
		System.out.println("\n1- D�bito.\n2- Cr�dito (n�o parcelamos)\n3- Vale Refei��o (VR).");
		byte opcaoDePagamento = entrada.nextByte();
		Thread.sleep(500);

		if (opcaoDePagamento == 1) {
			System.out.println("Cart�o de D�bito selecionado.");
			Thread.sleep(500);
			System.out.println("Escolha a bandeira referente ao seu cart�o: ");
			Thread.sleep(500);
			System.out.println("1- Visa.\n2- MasterCard.\n3- Elo\n4- American Express\n5- Nenhuma das op��es acima.");
			byte bandeiraCartaoDebito = entrada.nextByte();
			Thread.sleep(500);

			switch (bandeiraCartaoDebito) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("O motoboy levar� a m�quininha.");
				Thread.sleep(500);
				break;
			case 5:
				System.out.println(
						"N�o temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
				Thread.sleep(500);
				mudarPagamento();
			default: do {
				System.out.println("Escolha uma op��o v�lida. Digite 1 para voltar a tela de escolha: ");
				Thread.sleep(500);
				bandeiraCartaoDebito = entrada.nextByte();
				} while(bandeiraCartaoDebito != 1);
				escolhaDoPagamento();		
			}
		} else if (opcaoDePagamento == 2) {
			System.out.println("Cart�o de Cr�dito selecionado.");
			Thread.sleep(500);
			System.out.println("Escolha a bandeira referente ao seu cart�o: ");
			Thread.sleep(500);
			System.out.println("1- Visa.\n2- MasterCard.\n3- Elo\n4- American Express\n5- Nenhuma das op��es acima.");
			byte bandeiraCartaoCredito = entrada.nextByte();
			Thread.sleep(500);

			switch (bandeiraCartaoCredito) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("O motoboy levar� a m�quininha.");
				Thread.sleep(500);
				break;
			case 5:
				System.out.println(
						"N�o temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
				Thread.sleep(500);
				mudarPagamento();
			default:
				do {
					System.out.println("Escolha uma op��o v�lida. Digite 1 para voltar a tela de escolha: ");
					bandeiraCartaoCredito = entrada.nextByte();
					Thread.sleep(500);
				} while (bandeiraCartaoCredito != 1);
				escolhaDoPagamento();
			}

		} else if (opcaoDePagamento == 3) {
			System.out.println("Cart�o Vale-Refei��o selecionado.");
			Thread.sleep(500);
			System.out.println("Escolha a bandeira referente ao seu cart�o: ");
			Thread.sleep(500);
			System.out.println("1- Alelo.\n2- Sodexo.\n3- Visa\n4- MasterCard\n5- Elo\n6- Nenhuma das op��es acima.");
			byte bandeiraValeRefeicao = entrada.nextByte();
			Thread.sleep(500);

			switch (bandeiraValeRefeicao) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("O motoboy levar� a m�quininha.");
				Thread.sleep(500);
				break;
			case 6:
				System.out.println(
						"N�o temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
				Thread.sleep(500);
				mudarPagamento();
			default:
				do {
					System.out.println("Escolha uma op��o v�lida. Digite 1 para voltar a tela de escolha: ");
					bandeiraValeRefeicao = entrada.nextByte();
					Thread.sleep(500);
				} while (bandeiraValeRefeicao != 1);
				escolhaDoPagamento();
			}

		} else if (opcaoDePagamento > 3 || opcaoDePagamento < 1) {
			do {
				System.out.println("Op��o inv�lida. Digite 1 para tentar novamente.");
				opcaoDePagamento = entrada.nextByte();
				Thread.sleep(500);
			} while (opcaoDePagamento != 1 && opcaoDePagamento != 2 && opcaoDePagamento != 3);

			pagamentoPorCartao();
		}

	}

	public void mudarPagamento() throws InterruptedException {
		escolhaDoPagamento();
	}

}