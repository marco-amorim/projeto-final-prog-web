package projetoprogweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import projetoprogweb.db.DB;
import projetoprogweb.entities.Usuario;

public class UsuarioDAO {
	
	Connection conn = null;
	boolean existeNoBanco = false;
	boolean alteracaoFeita = false;
	String usuario = "root";
    String password = "Marco021995";
	String url = "jdbc:mysql://localhost:3306/projetofinalprogweb";
	

	public void salvarUsuario(Usuario user) {

		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(url, usuario, password);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			PreparedStatement st = null;
			st = conn.prepareStatement("INSERT INTO Usuario (email, senha, estado, cidade, bairro, endereco, cep, sexo, nome)"
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");

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

			DB.closeStatement(st);

		} catch (SQLException e) {
			System.out.println("Erro no banco!");
		}
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
