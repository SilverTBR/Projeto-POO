//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

public class Cartas extends Jogos{

	//ATRIBUTOS GLOBAIS
	private int qntCartas;

	//----------------------------------------------
	//Metodo construtor e polimorfismo de sobrecarga
	public Cartas(){
		qntCartas = 0;

	}

	public Cartas(int qntCartas){
		this.qntCartas = qntCartas;
	}

	
	//--------------------------
	//GETTERS
	public int getQntCartas(){
		return qntCartas;
	}

	
	//---------------------------------
	//SETTERS
	public void setQntCartas(int qntCartas){
		this.qntCartas = qntCartas;
	}



}