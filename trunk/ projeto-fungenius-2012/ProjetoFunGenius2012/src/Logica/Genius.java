package Logica;

import java.util.Random;

/**
 * 
 * @author Emanuel Carlos
 *
 */

public class Genius {
	
	protected String sequencia;
	protected int apontador;
	protected Random geradorAleatorio;
	
	public Genius(){
		this.sequencia = "";
		this.apontador = -1;
		this.geradorAleatorio = new Random();
	}
	
	/**
	 * Retorna a sequencia do jogo
	 * @return String que representa a sequencia
	 */
	public String getSequencia(){
		return this.sequencia;
	}
	
	/**
	 * Retorna o apontador que indica em qual posicao esta o proximo valor a ser comparado da sequencia
	 * @return int - inteiro que representa a posicao
	 */
	
	public int getApontador(){
		return this.apontador;
	}

	
	/**
	 * Verifica se o parametro entradaJogador corresponde ao proximo valor da sequencia
	 * @param entradaJogador
	 * @return true se o parametro entradaJogador corresponder ao valor da sequencia,
	 * 			false caso contrario.
	 * * @throws Exception - excecao lancada devido a sequencia estar vazia 
	 */

	public boolean verificaEntrada(String entradaJogador) throws Exception{
		if(apontador == -1){
			throw new Exception("Sequencia vazia");
		}else{
			if(this.sequencia.substring(this.sequencia.length() -1).equals(entradaJogador)){
				this.apontador += (1);
				return true;
			}
			return false;
		}
	}
	

	/**
	 * Adiciona um novo elemento randomicamente na sequencia
	 * 
	 */
	
	
	public void aumentarSequencia() { 
		this.sequencia = this.sequencia  + this.geradorAleatorio.nextInt(4);
		this.apontador = 0;
	}	
	
	/**
	 * Zera a sequencia
	 */
	
	public void zerarSequencia(){
		this.sequencia = "";
		this.apontador = -1;
	}
	
	/**
	 * Recupera o tamanho da sequencia
	 * @return int - valor que representa o tamanho da sequencia
	 */
	public int tamanhoSequencia(){
		return this.sequencia.length();
	}

}
