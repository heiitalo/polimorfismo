package br.com.polimorfismo;

public class Cachorro extends Animal implements Animais {

	
	public void som() {
		System.out.println("O cachorro late muito!! 'AU AU'");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro corre rápido, mas não como o cavalo");
		
		
	}

	@Override
	public void subirArvore() {
		
		
	}

}
