package JogoDaVelha;
import java.util.Scanner;

public class InicializandoInfo {
	
	String Jogador1;
	String Jogador2;
	
	
	public InicializandoInfo() {
		super();
		Scanner pl1 = new Scanner(System.in);
		Jogador1 = "Jogador 1 "+pl1;
		
		Scanner pl2 = new Scanner(System.in);
		Jogador2 = "jogador 2 "+pl2;
	}


	public String getJogador1() {
		return Jogador1;
	}


	public String getJogador2() {
		return Jogador2;
	}
	
	
}
