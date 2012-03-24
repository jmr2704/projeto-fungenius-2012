package Logica;
import java.util.*;

/**
 * 
 * @author carlos
 *
 */

public class Classico implements Genius{
	
	private String sequencia;
	private int apontador;
	private Random geradorAleatorio;
	
	public Classico(){
		this.sequencia = "";
		this.apontador = -1;
	}

	@Override
	public String getSequencia() {
		return this.sequencia;
	}

	@Override
	public int getApontador() {
		return this.apontador;
	}

	@Override
	public boolean verificaEntrada(String entradaJogador) throws Exception {
		if(apontador == -1){
			throw new Exception("Sequencia vazia");
		}else{
			if(this.sequencia.valueOf(this.apontador) == entradaJogador){
				return true;
			}
			return false;
		}
	}

	@Override
	public void aumentarSequencia() {
		this.sequencia = this.sequencia + this.geradorAleatorio.nextInt(4);
	}
	
}

	
/*
    public static Random gerador;
    public static String sequenciaCorreta;
    public static Scanner sc;
    public static boolean naoErrou; 
    
    public static final String VEMELHO = "1",
                               AZUL = "2",
                               VERDE = "3",
                               AMARELO = "4";
    
    
    public Classico() {
        sequenciaCorreta = ""; 
        gerador = new Random();
        sc = new Scanner(System.in);
        naoErrou = true;
    }
    
    protected String getSequenciaCorreta() {
        return sequenciaCorreta;
    }
    
    private String sorteio(){        
        return String.valueOf(gerador.nextInt(4) + 1);        
    }
    
    private void addSorteado(String sorteado) {
        sequenciaCorreta += sorteado;
    }
    
    private boolean sequenciaCorreta(String respostaJogador) {
        return getSequenciaCorreta().equalsIgnoreCase(respostaJogador);
    }
    
    public static void main(String[] args) {
        Classico classico = new Classico();
        
        
        while (naoErrou){
            String respostaJogador = "";
            
            String sorteado = classico.sorteio();
            System.out.println(sorteado);
            classico.addSorteado(sorteado);
            
            for (int i = 0; i < classico.getSequenciaCorreta().length(); i++) {
                System.out.print("\nDigite: ");
                respostaJogador += sc.next();                
            }
            
            naoErrou = classico.sequenciaCorreta(respostaJogador);
            
            
        }
    }


    
    
    

}*/