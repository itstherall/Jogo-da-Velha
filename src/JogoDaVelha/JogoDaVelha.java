package JogoDaVelha;
import java.util.*;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		//Inicializando Jogadores:
		Jogador playerUm = new Jogador("Player 1", 'X');
		Jogador playerDois = new Jogador("Player 2", 'O');

		//incializando tabuleiro
		Tabuleiro tab = new Tabuleiro();
		tab.imprimeTabuleiro();
		
		
		/*LOGICA PRINCIPAL DO JOGO DEVE SER FEITA AQUI A PARTE DO MAIN NO CASO 
		* MAS VOU FAZER TESTE AQUI DE VERIFICAO DE FUNCIONAMENTO DE ALGUMAS COISAS
		*
		* 1 - o que falta? ordenada as jogadas de formar correta e indicar a vitoria
		* 2 - fazer com que se a vitoria é verdade então o jogo finalize!
		* lembrar q o state inicial vai retornar true em vitoria ja q todos os espaços tem 
		* o mesmo valor
		*/
		
		//o da jagoda funcionou
		while(tab.getVerficaVez() < 10) {
			playerUm.Jogada(tab);
			playerDois.Jogada(tab);
		}
		
		
		
	}

}
