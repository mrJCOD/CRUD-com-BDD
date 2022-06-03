package Agenda.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Agenda.Modelo.jogadores;
import Fabrica.De.Conexoes.FabricaDeConexao;

public class JogadorDAO {
	
	//criar um CRUD (create, ready, update, delete)
	
	
	public void salvarUsuario(jogadores jogador) {
		
		String sql = "INSERT INTO jogadores(NomeJogador, SobreNomeJogador, nickName, Senha, Email) VALUES (?, ?, ?, ?, ?)";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			//criar uma conexao com o banco de dados
			conn = FabricaDeConexao.criarConexaoComMYSQL();
			//criado uma PreparedStatement, para executar uma requisicao
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, jogador.getNomeJogador());
			pstm.setString(2, jogador.getSobreNomeJogador());
			pstm.setString(3, jogador.getNickName());
			pstm.setString(4, jogador.getSenha());
			pstm.setString(5, jogador.getEmail());
			
			//executar a requisicao
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//fechar as conexoes
			try {
				if(pstm!=null) {
					
					pstm.close();
				}
				
				if(conn!=null) {
					
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
