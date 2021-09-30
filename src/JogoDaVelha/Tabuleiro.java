package JogoDaVelha;

public class Tabuleiro {
	
	char tab[][] = new char[3][3];
	int verficaVez;
	
	//constructor tabuleiro, ele começa vazio:
	Tabuleiro() {
		for(int lin = 0; lin < 3; ++lin) {
			for(int col = 0; col < 3; ++col) {
				tab[lin][col] = ' ' ;
			}
		}
		
		this.verficaVez = 1;
	}
	
	
	//Setters e getters 
	public int getVerficaVez() {
		return verficaVez;
	}

	public void setVerficaVez(int verficaVez) {
		this.verficaVez = verficaVez;
	}
	
	
	/*
	 *metodos auxiliares para nao mexer diretamente 
	 *com a variavel e fazer besteira
     */
	
	public void addVerficaVez(int verficaVez) {
		this.verficaVez += verficaVez;
	}


	//Imprime estado mais atual do tabuleiro no momento da verificaçao
	public void imprimeTabuleiro() {
		
		System.out.println();
		System.out.println("     0 | 1 | 2");
		System.out.println("---------------------");
		System.out.println(" 0|  " + this.tab[0][0] + " | " + this.tab[0][1] + " | " + this.tab[0][2]);
		System.out.print("  | ___|___|___\n");
		System.out.println(" 1|  " + this.tab[1][0] + " | " + this.tab[1][1] + " | " + this.tab[1][2]);
		System.out.print("  | ___|___|___\n");
		System.out.println(" 2|  " + this.tab[2][0] + " | " + this.tab[2][1] + " | " + this.tab[2][2]);
		System.out.println("  |    |   |   \n");
		System.out.println();
	
	}
	
	//Verifica se é possivel jogar na posicao desejada:
	public boolean verificaJogada(int linha, int coluna) {
		
		if(tab[linha][coluna] == ' ') {
		 return true;
		}
		
		System.out.println("Não é possivel jogar nesta posição!");
		return false;	
	}

	public boolean verificaVitoria() {
		//se alguns dos metodos de verificação returnar true aqui tbm retorna true e o jogo é finalizado 
		//se não se todas as posicçao forem diferentes de ' ' retorne a menssagem de empate
		if(this.verificaVitoriaLinha() || this.verificaVitoriaColuna() || this.verificaVitoriaDiagonal()) {
			
			/*
			 * depois arranjar um jeito de especificar o jagador
			 * que ganhou a partida.
			 */
			//System.out.println("Há um ganhador");		
			return true;
		}
		
		/*
		 * esse bicho aqui vai dar bem errado!
		 */
		//System.out.println("Deu velha, EMPATE!!!");
		return false;
	}

	
	public boolean verificaVitoriaLinha() {
		
		/*
		 *  0 0  0 1  0 2 -> forem iguais retorna true 
		 *  se não 
		 *  se 1 0  1 1  1 2 -> forem iguais retorna true
		 *  se não 
		 *  se 2 0  2 1  2 2 -> forem iguais retorna true
		 *  se não ->retorna falso
		 */
		
		if(this.tab[0][0] == this.tab[0][1] && this.tab[0][0] == this.tab[0][2]) {
			
			return true;
		}
		else if (this.tab[1][0] == this.tab[1][1] && this.tab[0][0] == this.tab[1][2]) {
			
			return true;
		} else if(this.tab[2][0] == this.tab[2][1] && this.tab[2][0] == this.tab[2][2]) {
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificaVitoriaColuna() {
		
		/*
		 *  0 0  1 0  2 0-> forem iguais retorna true 
		 *  se não 
		 *  se 1 0  1 1  1 2 -> forem iguais retorna true
		 *  se não 
		 *  se 2 0  2 1  2 2 -> forem iguais retorna true
		 *  se não ->retorna falso
		 */
		
		if(this.tab[0][0] == this.tab[1][0] && this.tab[0][0] == this.tab[2][0]) {
			
			return true;
		}
		else if (this.tab[0][1] == this.tab[1][1] && this.tab[0][1] == this.tab[2][1]) {
			
			return true;
		} else if(this.tab[0][2] == this.tab[1][2] && this.tab[0][2] == this.tab[2][2]) {
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificaVitoriaDiagonal() {
		/*
		 * para verificar as diagonais fica
		 * se 00 == 11 e 00 == 22 -> retorna true
		 * se não 
		 * se 20 == 11 e 20 == 02 -> retorna true
		 * se não 
		 * retorna false
		 */
		if(this.tab[0][0] == this.tab[1][1] && this.tab[0][0] == this.tab[2][2] ){
			
			return true;
		}
		else if( this.tab[2][0] == this.tab[1][1] && this.tab[2][0] == this.tab[0][2] ) {
			
			return true;
		}
		
		/*
		 * poderia ser escrito em apenas um unico if porem
		 * por motivos de gastos computacionais preferi dividir em 
		 * varios ifs a ponto de se na primeira verificação 
		 * já for verdade então não será necessario fazer outra consulta 
		 * de custo 1 para as comparações
		 */
		
		return false;
	}
}
