package JogoDaVelha;
import java.util.*;


/*
 * 
 */


public class Jogador {
	
	String nome;
	char simbolo;
	
	
	//constructor da classe!
	public Jogador(String nome, char simbolo) {
		super();
		this.nome = nome;
		this.simbolo = simbolo;
	}
	
	public void Jogada(Tabuleiro tabuleiro) {
		
		int linha;
		int coluna;
		Scanner posicaoLinha = new Scanner(System.in);
		Scanner posicaoColuna = new Scanner(System.in);
		
		do {
			
			System.out.println("Em qual posição linha você deseja jogar? ");
			
			linha = posicaoLinha.nextInt();
			
			System.out.println("Em qual posição coluna você deseja jogar? ");
			coluna = posicaoColuna.nextInt();
			
		} while (!tabuleiro.verificaJogada(linha, coluna));
		
		tabuleiro.tab[linha][coluna] = this.simbolo;
		
		//Se verifica a vez for > ou = 5 temos que verificar se há vitoria no jogo
		if(tabuleiro.getVerficaVez() >= 5) {
			
			tabuleiro.verificaVitoria();
		}
		
		
		tabuleiro.imprimeTabuleiro();
		tabuleiro.addVerficaVez(1);		
	}
	
	
	
}

