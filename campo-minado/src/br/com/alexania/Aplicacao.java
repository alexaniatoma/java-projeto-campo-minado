package br.com.alexania;

import br.com.alexania.campo.minado.modelo.Tabuleiro;
import br.com.alexania.campo.minado.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);
		
	}

}
