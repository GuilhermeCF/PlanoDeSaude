package com.guilherme.cassiano;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCliente extends TestCase {

    public static Test suite() {
        return new TestSuite( TestCliente.class );
    }

    public void testClientValido()
    {
    	Cliente novoCliente = new Cliente("Ana",20);
		assertEquals("Ana", novoCliente.getNome());
		assertEquals(20, novoCliente.getIdade());
    }

}
