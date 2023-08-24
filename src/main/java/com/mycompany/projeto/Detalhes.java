//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

public class Detalhes{

	//ATRIBUTOS GLOBAIS
	private int qntMinJogadores;
	private int qntMaxJogadores;
	private int idadeMinima;
	private int duracaoMin;
	private String lingua;
	
	//----------------------------------------------
	//Metodo construtor e polimorfismo de sobrecarga
	public Detalhes(){
		qntMinJogadores = 0;
		qntMaxJogadores = 0;
		idadeMinima = 0;
		duracaoMin = 0;
		lingua = "";
	}

	public Detalhes(int qntMinJogadores, int qntMaxJogares, int idadeMinima, int duracaoMin, String lingua){
		this.qntMinJogadores = qntMinJogadores;
		this.qntMaxJogadores = qntMaxJogadores;
		this.idadeMinima = idadeMinima;
		this.duracaoMin = duracaoMin;
		this.lingua = lingua;
	}


	//--------------------------
	//GETTERS
	public String getLingua(){
		return lingua;
	}

	public int getQntMinJogadores(){
		return qntMinJogadores;
	}

	public int getQntMaxJogadores(){
		return qntMaxJogadores;
	}
	
	public int getIdadeMinima(){
		return idadeMinima;
	}

	public int getDuracaoMin(){
		return duracaoMin;
	}
	
	//---------------------------------
	//SETTERS
	public void setLingua(String lingua){
		this.lingua = lingua;
	}

	public void setQntMinJogadores(int qntMinJogadores){
		this.qntMinJogadores = qntMinJogadores;
	}

	public void setQntMaxJogadores(int qntMaxJogadores){
		this.qntMaxJogadores = qntMaxJogadores;
	}


	public void setIdadeMinima(int idadeMinima){
		this.idadeMinima = idadeMinima;
	}


	public void setDuracaoMin(int duracaoMin){
		this.duracaoMin = duracaoMin;
	}

}