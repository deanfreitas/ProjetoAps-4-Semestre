package br.com.jogoaps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {
	public static Connection getConexaoMySQL() {
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			String serverName = "localhost";
			String mydatabase = "";
			String url = "jdbc:mysql://" + serverName + ":3306/" + mydatabase;
			String username = "root";
			String password = "";
			Connection connection = DriverManager.getConnection(url, username,
					password);
			return connection;
		} catch (ClassNotFoundException e) {
			System.out.println("\n O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out
					.println("\n Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}

	public void SalvaJogador(String nomeJogador, double pontuacao) {
		try {

			String sql = "INSERT INTO jogoAPS (nome, pontuacao)"
					+ "VALUES(?, ?)";

			PreparedStatement st = getConexaoMySQL().prepareStatement(sql);

			st.setString(1, nomeJogador);
			st.setDouble(2, pontuacao);

			st.executeUpdate();

			st.close();

		} catch (SQLException ex) {
			System.out.println("SQLEception: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		} catch (Exception e) {
			System.out.println("não possivel conexao");
		}
	}

	public List<String> pesquisarNomeJogador() {
		List<String> listaNomes = new ArrayList<String>();
		int i = 0;

		try {
			Statement stmt = getConexaoMySQL().createStatement();
			String sql = "select nome from jogoAPS ORDER BY pontuacao desc";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next() && i < 10) {
				listaNomes.add((rs.getString("nome")));
				i++;
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return listaNomes;
	}

	public List<Double> pesquisarPontuacaoJogador() {
		List<Double> pontuacao = new ArrayList<Double>();
		int i = 0;

		try {
			Statement stmt = getConexaoMySQL().createStatement();
			String sql = "select pontuacao from jogoAPS ORDER BY pontuacao desc";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next() && i < 10) {
				pontuacao.add((rs.getDouble("pontuacao")));
				i++;
			}

		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return pontuacao;
	}
}
