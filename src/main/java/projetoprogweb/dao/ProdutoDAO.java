package projetoprogweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projetoprogweb.entities.Produto;

public class ProdutoDAO {

	Connection conn = null;
	ArrayList<Produto> listaProdutos = new ArrayList<>();

	public void salvarProduto(Produto prod) {

		try {
			if (conn == null || conn.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				String usuario = "root";
				String password = "Marco021995";
				String url = "jdbc:mysql://localhost:3306/projetofinalprogweb";
				conn = DriverManager.getConnection(url, usuario, password);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}

		try {
			PreparedStatement st = null;
			st = conn.prepareStatement("INSERT INTO Produto (medida, preco, quantidadeDisp, nome) VALUES (?, ?, ?, ?)");

			st.setString(1, prod.getMedida());
			st.setDouble(2, prod.getPreco());
			st.setInt(3, prod.getQuantidadeDisp());
			st.setString(4, prod.getNome());

			st.executeUpdate();

			System.out.println("Inclusão realizada com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro no banco!");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public ArrayList<Produto> preencherListaProdutos() {

		try {
			if (conn == null || conn.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				String usuario = "root";
				String password = "Marco021995";
				String url = "jdbc:mysql://localhost:3306/projetofinalprogweb";
				conn = DriverManager.getConnection(url, usuario, password);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();

		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}

		try {
			PreparedStatement st = null;
			ResultSet rs = null;
			st = conn.prepareStatement("SELECT * FROM Produto");
			rs = st.executeQuery();

			while (rs.next()) {
				Produto prod = new Produto(rs.getString("medida"), rs.getDouble("preco"), rs.getInt("quantidadeDisp"), rs.getString("nome"));

				listaProdutos.add(prod);
			}

		} catch (SQLException e) {
			System.out.println("Erro no banco!");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listaProdutos;
	}
}
