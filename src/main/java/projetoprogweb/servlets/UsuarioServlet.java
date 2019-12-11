package projetoprogweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetoprogweb.dao.UsuarioDAO;
import projetoprogweb.entities.Usuario;


public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sexo = request.getParameter("sexo");
		String nome = request.getParameter("nome");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String cep = request.getParameter("cep");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String estado = request.getParameter("estado");
		
		Usuario user = new Usuario(nome, sexo, cep, endereco, bairro, cidade, estado, email, senha);
		
		UsuarioDAO dao = new UsuarioDAO();
		
		dao.salvarUsuario(user);
		
		response.sendRedirect("/projetoprogweb");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
