package com.target.treinamento.orientacaoobjeto;

import com.target.treinamento.orientacaoobjeto.dominio.Turma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Turma turma = new Turma();
    	turma.setNome("Rogerio");
    	    	
    	turma = new Turma("Rafael");
    	
        System.out.println(turma.getNome());
        System.out.println(turma.getNome());
    }
}
