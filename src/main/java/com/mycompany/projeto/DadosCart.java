//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.List;
public final class DadosCart{

	//Declaração e instanciação
	private Cartas J1 = new Cartas();	

	//Definindo a lista de informações
	private final List <Cartas> lista = new ArrayList<Cartas>();
	//----------------------------------------------
        
        public List<Cartas> getList(){
            return lista;
        }
	
	//Metodo para inserção, sendo a mesma final
	public final void insere(){

		J1 = new Cartas();
		J1.setNome("Pokemon TCG");
		J1.setDescricao("O Pokemon TCG e um jogo em que cada um dos jogadores usam um baralho (deck) com 60 cartas (cards) para batalhar e ver quem e o vencedor, seguindo determinadas regras. O foco do combate sao os Pokemon, representados por diversas cartas. Para ajuda-los na batalha contra o oponente, ha tambem cartas de Itens, Estadios, Apoiadores (treinadores) e Energias. Todos as cartas sao ilustradas, contando com a contribuicao de diversos artistas. Apesar de o foco do TCG ser centrado no jogo, ha quem colecione as cartas simplesmente por suas artes. Ate o final de marco de 2020, foram vendidas 30.4 bilhoes de cartas, em 77 paises e regioes diferentes e traduzidas em 13 idiomas. \n As cartas do jogo sao vendidas em booster, pequenos pacotes com pequena quantidadede cartas que deve ir comprando para formar seu deck");
		J1.setPrecoMin(4.74);
		J1.setPrecoMax(389.75);
		J1.setPrecoMedia(55.25);
		J1.setQntCartas(10);
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(2);
		J1.getDt().setQntMaxJogadores(2);
		J1.getDt().setIdadeMinima(7);
		J1.getDt().setDuracaoMin(18);
		
		//Transfere todas as informações para a array
		lista.add(J1);

		J1 = new Cartas();
		J1.setNome("Magic: the Gathering");
		J1.setDescricao("Magic: The gathering e um jogo de cartas colecionaveis, ou TCG, em que  os jogadores utilizam um baralho de cartas construido de acordo com o seu modo individual de jogo para tentar vencer o baralho adversario.\n As cartas do jogo sao vendidas em booster, pequenos pacotes com pequena quantidadede cartas que deve ir comprando para formar seu deck");
		J1.setPrecoMin(13.50);
		J1.setPrecoMax(44.89);
		J1.setPrecoMedia(20.00);
		J1.setQntCartas(16);
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(2);
		J1.getDt().setQntMaxJogadores(4);
		J1.getDt().setIdadeMinima(13);
		J1.getDt().setDuracaoMin(20);
		
		//Transfere todas as informações para a array
		lista.add(J1);

		J1 = new Cartas();
		J1.setNome("Munchkin");
		J1.setDescricao("Abra portas secretas e mate todos os monstros que cruzarem seu caminho. Trapaceie seus colegas, pegue todos os tesouros e saia correndo!\nMunchkin e um jogo de cartas divertido e estrategico, perfeito para amantes de RPG que gostam de aventura e intrigas.\nPara quem nunca jogou RPG ele e simples de explicar e jogar alem de garantir muitas risadas. Munchkin e um jogo otimo para jogar com os amigos, mas talvez a amizade seja desfeita no decorrer da aventura.\nO jogo base tem um tematica RPG medieval com satiras e ironias e a cada expansao conta com cartas exclusivas que adicionam novas Racas e Monstros.");
		J1.setPrecoMin(55.71);
		J1.setPrecoMax(609.90);
		J1.setPrecoMedia(70.00);
		J1.setQntCartas(168);
		J1.getDt().setLingua("Portugues - Brasil e Ingles");
		J1.getDt().setQntMinJogadores(3);
		J1.getDt().setQntMaxJogadores(6);
		J1.getDt().setIdadeMinima(10);
		J1.getDt().setDuracaoMin(60);
		
		lista.add(J1);


		J1 = new Cartas();
		J1.setNome("The Binding of Isaac: Four Souls");
		J1.setDescricao("The Binding of Isaac: Four Souls foi projetado por Edmund McMillen. O objetivo do jogo de cartas Binding of Isaac e combinar o espirito aventureiro do jogo de videogame Binding of Isaac com uma solucao facil de pegar e jogar. Basta puxar o jogo das prateleiras e voce tem 30 minutos de diversao estrategica e competitiva ao alcance dos seus dedos.");
		J1.setPrecoMin(109.06);
		J1.setPrecoMax(784.91);
		J1.setPrecoMedia(190.99);
		J1.setQntCartas(340);
		J1.getDt().setLingua("Ingles");
		J1.getDt().setQntMinJogadores(2);
		J1.getDt().setQntMaxJogadores(4);
		J1.getDt().setIdadeMinima(13);
		J1.getDt().setDuracaoMin(60);
		
		lista.add(J1);

		J1 = new Cartas();
		J1.setNome("Yu-Gi-Oh");
		J1.setDescricao("O jogo de cartas - cujo nome original e Yu-Gi-Oh! Trading Card Game em japones, e baseado em batalhas de monstros e ativacao de efeitos bonus e armadilhas num duelo entre 2 oponentes, cada um possuindo 8000 LPs (Life Points, ou Pontos de Vida) e usando Decks (baralhos) de 40 a 60 cartas.");
		J1.setPrecoMin(4.20);
		J1.setPrecoMax(889.90);
		J1.setPrecoMedia(50.50);
		J1.setQntCartas(60);
		J1.getDt().setLingua("Portugues");
		J1.getDt().setQntMinJogadores(2);
		J1.getDt().setQntMaxJogadores(2);
		J1.getDt().setIdadeMinima(13);
		J1.getDt().setDuracaoMin(30);
		
		lista.add(J1);
	}



}