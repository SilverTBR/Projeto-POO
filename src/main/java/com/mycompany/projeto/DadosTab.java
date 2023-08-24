//Nome: Eduardo Pereira Baratera - RA:2269104
package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.List;
public final class DadosTab{
	
	//Declaração e instanciação
	private Tabuleiro J1 = new Tabuleiro();

	//Definindo a lista de informações
	private List <Tabuleiro> lista = new ArrayList<Tabuleiro>();
	//----------------------------------------------
	
        public List<Tabuleiro> getList(){
            return lista;
        }
        
	//Metodo para inserção, sendo a mesma final
	public final void insere(){

		J1 = new Tabuleiro();
		J1.setNome("Arkham Horror, 3 Edicao");
		J1.setDescricao("Criaturas terriveis vindas de alem do tempo e do espaco ameacam Arkham. Os jogadores tem de unir forcas para afastar a perdicao iminente. Se nao forem contidos, esses males ancestrais ascenderao para destruir nao apenas Arkham, mas todo o mundo.\nArkham Horror e um jogo cooperativo de 1 a 6 jogadores. Todos os participantes estao no mesmo time e ganham ou perdem o jogo juntos. Cada jogador controla um investigador intrepido, um dos poucos que notaram a ameaca crescente ao nosso mundo. Os investigadores exploram a cidade, encontrando locais, pessoas e criaturas tanto mundanas quanto sobrenaturais. Ao longo das aventuras, os investigadores desejam obter as pistas e os recursos necessarios para confrontar e, em ultima instancia, derrotar os Ancioes.");
		J1.setPrecoMin(349.49);
		J1.setPrecoMax(400.00);
		J1.setPrecoMedia(355.50);
                J1.setComponentes("1 Guia de Referencia -  1 Livro de Regras -  12 Pecas de Mapa (5 Vizinhancas e 7 Ruas) -  4 Fichas de Cenario -  12 Fichas de Investigador -  6 Cartas de Referencia -  32 Cartas de Manchete -  40 Cartas de Arquivo -  36 Cartas de Anomalia -  96 Cartas de Evento -  72 Cartas de Encontro -  12 Cartas de Aliado -  28 Cartas de Item -  10 Cartas de Feitico -  26 Cartas Especiais -  37 Cartas Iniciais -  12 Cartas de Condicao -  62 Cartas de Monstro -  48 Fichas de Pista/Perdicao -  42 Fichas de Dano -  42 Fichas de Horror -  38 Fichas de Dinheiro -  5 Fichas de Anomalia -  30 Fichas de Concentracao -  6 Dados -  24 Fichas de Espolio -  18 Fichas do Mito -  10 Fichas de Marcacao -  6 Fichas de Ativacao -  1 Suporte do Baralho de Eventos.");		J1.setComplexidade("Media");
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(1);
		J1.getDt().setQntMaxJogadores(6);
		J1.getDt().setIdadeMinima(14);
		J1.getDt().setDuracaoMin(120);
		lista.add(J1);
		
		J1 = new Tabuleiro();
		J1.setNome("Gloomhaven");
		J1.setDescricao("Gloomhaven e um jogo cooperativo de combate tatico em um mundo de fantasia original e em evolucao. Cada jogador assumira o papel de um mercenario experiente com seus interesses pessoais. Juntos, os jogadores lutarao por uma campanha de cenarios que reagem e mudam de acordo com suas acoes, criando um estado unico de jogo, repleto de tesouros descobertos, aventureiros aposentados e escolhas permanentes.\nCada cenario oferece aos jogadores profundas decisoes taticas, nas quais as cartas de habilidades possuem varias utilidades, e usar a habilidade certa no momento certo pode ser a diferenca entre o sucesso e o fracasso. Gloomhaven oferece um combate eficiente, sem dados, contra inimigos completamente automatizados, cada um deles com seu padrao comportamental especifico.");
		J1.setPrecoMin(800.00);
		J1.setPrecoMax(4482.50);
		J1.setPrecoMedia(2399.00);		
                J1.setComponentes("1 Livro de Regras -  18 Miniaturas de Personagem -  47 Folhas de Atributos do Monstro -  24 Cartas de Objetvo de Batalha -  50 Fichas de Dinheiro -  1 Livro de Cenarios -  17 Tabuleiros de Personagem -  6 Luvas de Atributos de Monstro -  24 Cartas de Missao Pessoal -  46 Fichas de Dano -  1 Livro de Registros da Cidade -  504 Cartas de Habilidade do Personagem -  150 Cartas de Evento -  9 Cartas de Cenario Aleatorias -  10 Fichas de Auxilio de Cenario -  1 Tabuleiro Mapa -  457 Cartas de Modifcador de Ataque -  253 Cartas de Item -  40 Cartas de Masmorra Aleatoria -  4 Mostradores de PV/EXP -  12 Fichas de Objetvo -  4 Cartas de Referencia do Jogador -  30 Pecas de Mapa Frente e Verso -  236 Fichas de Monstro -  6 Discos Elementais de Madeira -  32 Fichas de Invocacao -  17 Blocos de Personagem -  1 Bloco do Grupo -  3 Envelopes Selados -  155 Pecas Sobrepostas Frente e Verso -  232 Cartas de Habilidade do Monstro -  35 Caixas de Personagem -  24 Bases Plastcas -  1 Tabuleiro de Infusao Elemental -  1 Marcador de Rodada -  60 Fichas de Status -  85 Fichas de Personagem -  4 Folhas de adesivo.");		J1.setComplexidade("Alta");
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(1);
		J1.getDt().setQntMaxJogadores(6);
		J1.getDt().setIdadeMinima(14);
		J1.getDt().setDuracaoMin(60);
                
		//Transfere as informações para a array
		lista.add(J1);

		J1 = new Tabuleiro();
		J1.setNome("This War of Mine");
		J1.setDescricao("This War of Mine: Board Game é um jogo totalmente cooperativo, com um sistema de monte e jogue, sendo uma luta pela sobrevivência. Neste desafiante jogo, que desenvolve histórias, para 1 a 6 jogadores, você jogará com um grupo de civis presos em uma cidade devastada por conflitos militares.");
		J1.setPrecoMin(400.00);
		J1.setPrecoMax(830.90);
		J1.setPrecoMedia(420.00);
                J1.setComponentes("Diario -  Livro de Scripts -  Folheto de Cenarios -  Planilhas de Jogo Salvo -  1 Tabuleiro -  4 Aneis de Plastico -  12 Miniaturas de Plastico -  4 Dados de Plastico -  200 Cartas -  186 Fichas Diversas -  33 Marcadores de Plastico.");		J1.setComplexidade("Simples");
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(1);
		J1.getDt().setQntMaxJogadores(4);
		J1.getDt().setIdadeMinima(18);
		J1.getDt().setDuracaoMin(60);
		lista.add(J1);

		J1 = new Tabuleiro();
		J1.setNome("XCOM: The board game");
		J1.setDescricao("Em XCOM: The Board Game, voce e ate tres amigos assumem os papeis de lideres da elite, uma organizacao internacional conhecida como XCOM. E o seu trabalho defender a humanidade, acabar com o panico crescente, e voltar a invasao alienigena.");
		J1.setPrecoMin(193.00);
		J1.setPrecoMax(500.00);
		J1.setPrecoMedia(200.00);
                J1.setComponentes("12 Cartas de Missao -  5 Cartas de Plano de Invasao -  7 Cartas de Reserva -  4 Cartas de Referencia de Cargo -  15 Cartas de Beneficio -  28 Cartas de Tecnologia -  32 Cartas de Crise -  63 Cartas de Inimigo - 29 Fichas de Credito - 8 Fichas de Cientista - 8 Fichas de Satelite - 6 Fichas de Panico - 1 Ficha de Dano na Base - 1 Ficha de Ameaca - 18 Fichas de Sucesso - 1 Ficha de QG da XCOM - 1 Tabuleiro - 1 Manual de Regras - 3 Miniaturas de Infantaria Pesada - 3 MIniaturas de Soldados de Assalto - 3 Miniaturas de Franco-Atiradores - 3 Miniatiuras de Soldados de Suporte - 8 Miniaturas de Interceptadores - 24 Miniaturas de OVNIs - 4 Fichas de Elite - 4 Dados da XCOM (d6) - 1 Dado Alienigena (d8)");		J1.setComplexidade("Alta");
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(1);
		J1.getDt().setQntMaxJogadores(4);
		J1.getDt().setIdadeMinima(14);
		J1.getDt().setDuracaoMin(90);
		lista.add(J1);

		J1 = new Tabuleiro();
		J1.setNome("Fallout");
		J1.setDescricao("Fallout e um jogo de tabuleiro de aventura pos-nuclear para um a quatro jogadores. Com base na serie de videogames de sucesso da Bethesda Softworks, cada cenario Fallout e inspirado em alguma historia da franquia. Os sobreviventes comecam o jogo a beira de um ambiente inexplorado, com as incertezas de um mundo de aventuras no desconhecido. Com apenas um objetivo para guia-los desde o inicio, cada jogador deve explorar o mapa oculto, lutar contra inimigos ferozes e aprimorar as habilidades de seu sobrevivente enquanto tentam completar missoes desafiadoras e equilibrar as faccoes dentro do jogo.");
		J1.setPrecoMin(239.00);
		J1.setPrecoMax(979.90);
		J1.setPrecoMedia(320.00);
                J1.setComponentes("1 Guia de Referencia - 1 Manual Aprenda a Jogar - 21 Pecas de Mapa - 4 Fichas de Cenario - 5 Miniaturas de Plastico - 5 Cartas de Personagem - 5 Marcadores de S.P.E.C.I.A.L. - 75 Cartas de Encontro - 12 Pinos - 4 Tabuleiros de Jogador com 8 Conectores - 100 Cartas de Missao - 14 Cartas de Vantagem - 2 Marcadores de Poder - 54 Marcadores de Tampas - 12 Marcadores de Atributo - 10 Marcadores de Faccao - 8 Marcadores de Missao - 34 Cartas de Espolio - 25 Cartas de Recurso - 11 Cartas de Recurso Unicos - 23 Cartas de Estrategia");		J1.setComplexidade("Simples");
		J1.getDt().setLingua("Portugues - Brasil");
		J1.getDt().setQntMinJogadores(1);
		J1.getDt().setQntMaxJogadores(4);
		J1.getDt().setIdadeMinima(14);
		J1.getDt().setDuracaoMin(120);
		lista.add(J1);
		
	}

}