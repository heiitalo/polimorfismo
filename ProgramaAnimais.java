package br.com.polimorfismo;

import java.util.Scanner;

public class ProgramaAnimais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		
		//CAVALO
		System.out.println("Qual o nome do cavalo? ");
		cavalo1.setNome(entrada.nextLine());
		System.out.println("Quantos anos o " + cavalo1.getNome() + " tem?");
		cavalo1.setIdade(entrada.nextInt());
		
		//CACHORRO
		System.out.println("Qual o nome do cachorro? ");
		cachorro1.setNome(entrada.nextLine());
		System.out.println("Quantos anos o " + cachorro1.getNome() + " tem?");
		cachorro1.setIdade(entrada.nextInt());
		
		//PREGUIÇA
		System.out.println("Qual o nome da preguiça? ");
		preguica1.setNome(entrada.next());
		System.out.println("Quantos anos o " + preguica1.getNome() + " tem?");
		preguica1.setIdade(entrada.nextInt());
		
		System.out.println("=======================================================================================================");
		
		System.out.println("O cavalo se chama: " + cavalo1.getNome() );
		System.out.println("O " + cavalo1.getNome() + " tem " + cavalo1.getIdade() + " anos");
		cavalo1.correr();
		cavalo1.som();
        
		System.out.println("========================================================================================================");
		System.out.println("O cachorro se chama: " + cachorro1.getNome());
		System.out.println("O " + cachorro1.getNome() + " tem " + cachorro1.getIdade() + " anos");
		cachorro1.correr();
		cachorro1.som();
		
		System.out.println("========================================================================================================");
		System.out.println("A preguiça se chama: " + preguica1.getNome());
		System.out.println("O(a) " + preguica1.getNome() + " tem " + preguica1.getIdade() + " anos");
		preguica1.subirArvore();
		preguica1.som();
	
		entrada.close();
	}

}
