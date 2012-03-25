package Testes;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Logica.Invertido;
import Logica.Genius;


public class TesteGeniusInvertido {
	
private Genius geniusInvertido;
	
	@Before
	public void criarGenius(){
		geniusInvertido = new Invertido();
		
	}
	
	@Test
	public void testeSequencia(){
		Assert.assertEquals("",this.geniusInvertido.getSequencia());
		this.geniusInvertido.aumentarSequencia();
		this.geniusInvertido.aumentarSequencia();
		Assert.assertEquals(2, this.geniusInvertido.getSequencia().length());
		this.geniusInvertido.zerarSequencia();
		Assert.assertEquals("",this.geniusInvertido.getSequencia());
	}
	
	@Test
	public void testeApontador(){
		Assert.assertEquals(-1, this.geniusInvertido.getApontador());
		this.geniusInvertido.aumentarSequencia();
		this.geniusInvertido.aumentarSequencia();
		Assert.assertEquals(1, this.geniusInvertido.getApontador());
		try {
			this.geniusInvertido.verificaEntrada(this.geniusInvertido.getSequencia().substring(this.geniusInvertido.tamanhoSequencia() - 1));
		} catch (Exception e) {
			Assert.fail();
		}
		Assert.assertEquals(0, this.geniusInvertido.getApontador()); 
		this.geniusInvertido.zerarSequencia();
		Assert.assertEquals(-1, this.geniusInvertido.getApontador()); 
	}
	
	@Test
	public void testeEntrada(){
		try{
			this.geniusInvertido.verificaEntrada("0");
			Assert.fail();
		}catch (Exception e) {
			this.geniusInvertido.aumentarSequencia();
			this.geniusInvertido.aumentarSequencia();
			try {
				Assert.assertFalse(this.geniusInvertido.verificaEntrada("5"));
				Assert.assertEquals(1, this.geniusInvertido.getApontador()); //0
			} catch (Exception e1) {
				Assert.fail();
			}
			try {
				this.geniusInvertido.verificaEntrada(this.geniusInvertido.getSequencia().substring(this.geniusInvertido.tamanhoSequencia() - 1));
				Assert.assertEquals(0, this.geniusInvertido.getApontador()); //1
			} catch (Exception e2) {
				Assert.fail();				
			}
			try {
				this.geniusInvertido.verificaEntrada(this.geniusInvertido.getSequencia().substring(this.geniusInvertido.tamanhoSequencia() - 1));
				Assert.assertEquals(-1, this.geniusInvertido.getApontador()); //2
			} catch (Exception e2) {
				Assert.fail();				
			}
			this.geniusInvertido.aumentarSequencia();
			try {
				this.geniusInvertido.verificaEntrada(this.geniusInvertido.getSequencia().substring(this.geniusInvertido.tamanhoSequencia() - 1));
				Assert.assertEquals(1, this.geniusInvertido.getApontador());
			} catch (Exception e2) {
				Assert.fail();				
			}
			this.geniusInvertido.zerarSequencia();
			try {
				this.geniusInvertido.verificaEntrada("0");
				Assert.fail();
			} catch (Exception e3) {				
			}
			
			
		}	
	}

}
