package exercicios;

import java.util.Scanner;

public class salario {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double salario, decimo=0, ferias;
		int tipo = 0, meses;


		for (; tipo != 4; tipo = tipo) {

			System.out.print(" \n1. Novo salário\n 2. Férias \n 3. Décimo terceiro \n 4. Sair \n Escolha uma opção: ");
			tipo = sc.nextInt();

			if (tipo != 4) {
				
				System.out.print("Qual é o seu salário: ");
				salario = sc.nextDouble();

				if (tipo == 1) {
					if (salario <= 350) {
						salario += salario * 0.15;

					} else if (salario > 350 && salario <= 600) {
						salario += salario * 0.1;
					} else if (salario > 600) {
						salario += salario * 0.05;
					}

					System.out.println("O salário reajustado será: " + salario);

				} else if (tipo == 2) {

					ferias = salario + (salario / 3);

					System.out.printf("As férias seriam: " + ferias);

				} else if (tipo == 3) {
					System.out.println("Quantos meses está na empresa: ");
					meses = sc.nextInt();

					if (meses > 12) {
						System.out.println("O limite de meses é 12!");
					} else {

						decimo = (meses * salario) / 12;
					}

					System.out.println("O decimo seria: " + decimo);
				}

			}
			decimo = 0;
			ferias = 0;
			meses = 0;

		}

	}
}
