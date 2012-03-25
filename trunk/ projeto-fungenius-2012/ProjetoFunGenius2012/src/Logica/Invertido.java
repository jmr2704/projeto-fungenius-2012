package Logica;

public class Invertido extends Genius{

	@Override
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
	
	@Override
	public void aumentarSequencia() { 
		this.sequencia = this.sequencia  + this.geradorAleatorio.nextInt(4);
		this.apontador = 0;
	}
}
