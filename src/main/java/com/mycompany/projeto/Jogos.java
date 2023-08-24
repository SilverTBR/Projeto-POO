//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

//Classe abstrata
public abstract class Jogos{

	//ATRIBUTOS GLOBAIS
	private String nome;
	private String descricao;
	private double precoMin;
	private double precoMax;
	private double precoMedia;
	private Detalhes dt;

	//----------------------------------------------
	//Metodo construtor e polimorfismo de sobrecarga
	public Jogos(){
		nome = "";
		descricao = "";
		precoMin = 0;
		precoMax = 0;
		precoMedia = 0;
		dt = new Detalhes();
	}

	public Jogos(String nome, String descricao, double precoMin, double precoMax, double precoMedia, Detalhes dt){
		this.nome = nome;
		this.descricao = descricao;
		this.precoMin = precoMin;
		this.precoMax = precoMax;
		this.dt = dt;
	}

	//--------------------------
	//ESPELHAMENTO
	public Detalhes getDt(){
		return dt;
	}

	public void setDt(Detalhes dt){
		this.dt = dt;
	}

	//--------------------------
	//GETTERS
	public String getNome(){
		return nome;
	}

	public String getDescricao(){
		return descricao;
	}

	public double getPrecoMin(){
		return precoMin;
	}
	
	public double getPrecoMax(){
		return precoMax;
	}

	public double getPrecoMedia(){
		return precoMedia;
	}
	
	//---------------------------------
	//SETTERS
	public void setNome(String nome){
		this.nome = nome;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public void setPrecoMin(double precoMin){
		this.precoMin = precoMin;
	}


	public void setPrecoMax(double precoMax){
		this.precoMax = precoMax;
	}


	public void setPrecoMedia(double precoMedia){
		this.precoMedia = precoMedia;
	}

}