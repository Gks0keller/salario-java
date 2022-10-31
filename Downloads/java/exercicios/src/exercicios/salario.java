package exercicios;

import java.util.Scanner;

public class salario {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		double salario,decimo,ferias;
		int tipo,meses;
		
		
		System.out.println("escolha uma opção: \n 1. Novo salário\n 2. Férias \n 3. Décimo terceiro \n 4. Sair  ");
		tipo=sc.nextInt();
		
		
		System.out.print("Qual é o seu salário: ");
		salario=sc.nextDouble();
		
		if(tipo==1) {
			if(salario<=350) {
				salario+=salario*0.15;
				
			} else if(salario>350 && salario<=600) {
				salario+=salario*0.1;
			} else if(salario>600) {
				salario+=salario*0.05;
			}
			
			System.out.println("O salário reajustado será: "+salario);
			
		}else if(tipo==2) {
			
				ferias=salario+(salario/3);
			
				System.out.println("As férias seriam: "+ferias);
				
				
		}else if(tipo==3) {
			System.out.println("Quantos meses está na empresa: ");
			meses=sc.nextInt();
			
			decimo=(meses*salario)/12;
			
			System.out.println("O decimo seria: "+decimo);
		}
			
		
	
		
	}
}
