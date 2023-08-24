//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;
import javax.swing.JOptionPane;


public class Insere{

	//metodos para inserção de dados, de modo que verifique erros de negativo
	//-----------------------------------------------------------------
	public static double verNegativoDb(Double val) throws NegatException{
		if(val < 0.0){
			throw new NegatException();
		}else{
			return val;
		}
	}

	//-----------------------------------------------------------------
	public static int verNegativoInt(int val) throws NegatException{
		if(val < 0){
			throw new NegatException();
		}else{
			return val;
		}
	}
	//----------------------------------------------------------------
	public static double insDb(){
		Double val = 0.0;
		try{
			val = Insere.verNegativoDb(Double.parseDouble(JOptionPane.showInputDialog(null,"Valores negativos nao sao aceitos, digite novamente: ","ERRO",JOptionPane.PLAIN_MESSAGE)));
		}catch(NegatException ne){
			val = ne.correctDb(val);	
		}catch(NumberFormatException nfe){
			System.out.println("\nERRO - Insercao somente de numeros flutuantes");
		}
		return val;
	}

	//----------------------------------------------------------------
	public static int insInt(){
		int val = 0;
		try{
			val = Insere.verNegativoInt(Integer.parseInt(JOptionPane.showInputDialog(null,"Valores negativos nao sao aceitos, digite novamente: ","ERRO",JOptionPane.PLAIN_MESSAGE)));
		}catch(NegatException ne){
			val = ne.correctInt(val);	
		}catch(NumberFormatException nfe){
			System.out.println("\nERRO - Insercao somente de numeros inteiros");
		}
		return val;	
	}


}