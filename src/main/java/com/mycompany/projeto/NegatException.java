//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

import javax.swing.JOptionPane;

public class NegatException extends Exception{


	//Tratamento de exceção
	public int correctInt(int info){
		try{
			info = Insere.verNegativoInt(Integer.parseInt(JOptionPane.showInputDialog(null,"Valores negativos nao sao aceitos, digite novamente: ","ERRO",JOptionPane.PLAIN_MESSAGE)));
		}catch(NegatException ne){
			info = ne.correctInt(info);
		}catch(NumberFormatException nfe){
			System.out.println("\nERRO - Somente numeros inteiros são aceitos");

		}
		return info;
	}

	//------------------------------------------------------------------

	public double correctDb(double info){
		try{
			info = Insere.verNegativoDb(Double.parseDouble(JOptionPane.showInputDialog(null,"Valores negativos nao sao aceitos, digite novamente: ","ERRO",JOptionPane.PLAIN_MESSAGE)));
		}catch(NegatException ne){
			info = ne.correctDb(info);
		}catch(NumberFormatException nfe){			
			System.out.println("\nERRO - Somente numeros de ponto flutuante sao aceitos");
		}
		return info;
	}	

}