package projetoprogweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import projetoprogweb.entities.Usuario;

public class UsuarioDAO {
	
	Connection conn = null;
	

	public void salvarUsuario(Usuario user) {

		try {
			if (conn == null || conn.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				String usuario = "root";
			    String password = "Marco021995";
				String url = "jdbc:mysql://localhost:3306/projetofinalprogweb";
				conn = DriverManager.getConnection(url, usuario, password);
			}
		} catch (SQLException e1 ) {
			e1.printStackTrace();
			
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		try {
			PreparedStatement st = null;
			st = conn.prepareStatement("INSERT INTO Usuario (email, senha, estado, cidade, bairro, endereco, cep, sexo, nome) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

			st.setString(1, user.getEmail());
			st.setString(2, user.getSenha());
			st.setString(3, user.getEstado());
			st.setString(4, user.getCidade());
			st.setString(5, user.getBairro());
			st.setString(6, user.getEndereco());
			st.setString(7, user.getCep());
			st.setString(8, user.getSexo());
			st.setString(9, user.getNome());
			

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
	
	public boolean validarLogin(String email, String senha) {

		try {
			if (conn == null || conn.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				String usuario = "root";
			    String password = "Marco021995";
				String url = "jdbc:mysql://localhost:3306/projetofinalprogweb";
				conn = DriverManager.getConnection(url, usuario, password);
			}
		} catch (SQLException e1 ) {
			e1.printStackTrace();
			
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		try {
			PreparedStatement st = null;
			ResultSet rs = null;
			st = conn.prepareStatement("SELECT * FROM Usuario WHERE email = ? AND senha = ?");

			st.setString(1, email);
			st.setString(2, senha);
			
			rs = st.executeQuery();
			
			if (rs.next() == true) {
				return true;
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
		return false;
	}

//	public void excluiContato(Contato cont) {
//
//		try {
//			if (conn == null || conn.isClosed()) {
//				conn = DB.getConnection();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		try {
//			PreparedStatement st = null;
//			ResultSet rs = null;
//			st = conn.prepareStatement("SELECT * FROM contato WHERE nome = ? AND dataNasc = ?");
//			st.setString(1, cont.getNome());
//			st.setDate(2, cont.getDataNasc());
//
//			rs = st.executeQuery();
//
//			if (rs.next() == false) {
//
//				JOptionPane.showMessageDialog(null, "Dados inexistentes!", "Cadastro no Banco de Dados",
//						JOptionPane.INFORMATION_MESSAGE);
//			} else {
//				JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!", "Cadastro no Banco de Dados",
//						JOptionPane.INFORMATION_MESSAGE);
//			}
//
//			st = conn.prepareStatement("DELETE FROM contato WHERE nome = ? AND dataNasc = ?");
//			st.setString(1, cont.getNome());
//			st.setDate(2, cont.getDataNasc());
//			st.executeUpdate();
//
//			DB.closeStatement(st);
//			DB.closeResultSet(rs);
//
//		} catch (SQLException e1) {
//
//			JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente!",
//					"Campos incorretos", JOptionPane.WARNING_MESSAGE);
//		}
//
//	}

}
