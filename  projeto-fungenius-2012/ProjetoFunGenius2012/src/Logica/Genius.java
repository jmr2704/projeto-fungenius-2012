package Logica;

/**
 * 
 * @author Emanuel Carlos
 *
 */

public interface Genius {
	
	/**
	 * Retorna a sequencia do jogo
	 * @return String que representa a sequencia
	 */
	public String getSequencia();
	
	/**
	 * Retorna o apontador que indica em qual posicao esta o proximo valor a ser comparado da sequencia
	 * @return int - inteiro que representa a posicao
	 */
	
	public int getApontador();

	/**
	 * Verifica se o parametro entradaJogador corresponde ao proximo valor da sequencia
	 * @param entradaJogador
	 * @return true se o parametro entradaJogador corresponder ao valor da sequencia,
	 * 			false caso contrario. 
	 */
	
	public boolean verificaEntrada(String entradaJogador);
	
	/**
	 * Gera um proximo valor randomicamento para a sequencia
	 * @return
	 */
	
	public String gerarValor();
	
	

}
