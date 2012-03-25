package Testes;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Logica.Genius;

/**
 * 
 * @author carlos
 *
 */

public class TesteGeniusClassico {
	
	private Genius geniusClassico;
	
	@Before
	public void criarGenius(){
		geniusClassico = new Genius();
		
	}
	
	@Test
	public void testeSequencia(){
		Assert.assertEquals("",this.geniusClassico.getSequencia());
		this.geniusClassico.aumentarSequencia();
		this.geniusClassico.aumentarSequencia();
		Assert.assertEquals(2, this.geniusClassico.getSequencia().length());
		this.geniusClassico.zerarSequencia();
		Assert.assertEquals("",this.geniusClassico.getSequencia());
	}
	
	@Test
	public void testeApontador(){
		Assert.assertEquals(-1, this.geniusClassico.getApontador());
		this.geniusClassico.aumentarSequencia();
		this.geniusClassico.aumentarSequencia();
		Assert.assertEquals(0, this.geniusClassico.getApontador());
		try {
			this.geniusClassico.verificaEntrada(this.geniusClassico.getSequencia().substring(this.geniusClassico.tamanhoSequencia() - 1));
		} catch (Exception e) {
			Assert.fail();
		}
		Assert.assertEquals(1, this.geniusClassico.getApontador());
		this.geniusClassico.zerarSequencia();
		Assert.assertEquals(-1, this.geniusClassico.getApontador());
	}
	
	@Test
	public void testeEntrada(){
		try{
			this.geniusClassico.verificaEntrada("0");
			Assert.fail();
		}catch (Exception e) {
			this.geniusClassico.aumentarSequencia();
			this.geniusClassico.aumentarSequencia();
			try {
				Assert.assertFalse(this.geniusClassico.verificaEntrada("5"));
				Assert.assertEquals(0, this.geniusClassico.getApontador());
			} catch (Exception e1) {
				Assert.fail();
			}
			try {
				this.geniusClassico.verificaEntrada(this.geniusClassico.getSequencia().substring(this.geniusClassico.tamanhoSequencia() - 1));
				Assert.assertEquals(1, this.geniusClassico.getApontador());
			} catch (Exception e2) {
				Assert.fail();				
			}
			try {
				this.geniusClassico.verificaEntrada(this.geniusClassico.getSequencia().substring(this.geniusClassico.tamanhoSequencia() - 1));
				Assert.assertEquals(2, this.geniusClassico.getApontador());
			} catch (Exception e2) {
				Assert.fail();				
			}
			this.geniusClassico.aumentarSequencia();
			try {
				this.geniusClassico.verificaEntrada(this.geniusClassico.getSequencia().substring(this.geniusClassico.tamanhoSequencia() - 1));
				Assert.assertEquals(1, this.geniusClassico.getApontador());
			} catch (Exception e2) {
				Assert.fail();				
			}
			this.geniusClassico.zerarSequencia();
			try {
				this.geniusClassico.verificaEntrada("0");
				Assert.fail();
			} catch (Exception e3) {				
			}
			
			
		}	
	}
	

}
