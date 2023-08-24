//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

public class Tabuleiro extends Jogos implements conpTab{

	//ATRIBUTOS GLOBAIS
	private String componentes;
	private String complexidade;

	//----------------------------------------------
	//Metodo construtor e polimorfismo de sobrecarga
	public Tabuleiro(){
		componentes = "";
		complexidade = "";
	}

	public Tabuleiro(String componentes, String complexidade){
		this.componentes = componentes;
		this.complexidade = complexidade;
	}

	
	//--------------------------
	//GETTERS
	public String getComponentes(){
		return componentes;
	}

	public String getComplexidade(){
		return complexidade;
	}

	
	//---------------------------------
	//SETTERS
	public void setComponentes(String componentes){
		this.componentes = componentes;
	}

	public void setComplexidade(String complexidade){
		this.complexidade = complexidade;
	}


}