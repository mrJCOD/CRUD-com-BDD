package Jogador.Aplicacao;

import javax.swing.JOptionPane;

import Agenda.DAO.JogadorDAO;
import Agenda.Modelo.jogadores;

public class Main {

	public static void main(String[] args) {
		JogadorDAO jogadorDao = new JogadorDAO();
		jogadores jogador = new jogadores();
		
		
		jogador.setNomeJogador("Maria");
		jogador.setSobreNomeJogador("Ribeiro Miranda");
		jogador.setNickName("guia");
		jogador.setSenha("senha@teste");
		jogador.setEmail("guia@gmail.com");
		
		jogadorDao.salvarUsuario(jogador);
		//System.out.println("Jogador Salvo com sucesso.");
		
		JOptionPane.showMessageDialog(null, "Jogador " + jogador.getNomeJogador() + " cadastrado com sucesso!!");
		
		

	}

}
