package projetoprogweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetoprogweb.dao.ProdutoDAO;
import projetoprogweb.dao.UsuarioDAO;
import projetoprogweb.entities.Produto;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String senhaLogin = request.getParameter("senhaLogin");
		String emailLogin = request.getParameter("emailLogin");
		
		UsuarioDAO dao = new UsuarioDAO();
		
		if (dao.validarLogin(emailLogin, senhaLogin) == true) {
			
			ProdutoDAO dao2 = new ProdutoDAO();
			
			List<Produto> listaProdutos = dao2.preencherListaProdutos();
			
			request.setAttribute("lista_produtos", listaProdutos);
			
			RequestDispatcher dp = request.getRequestDispatcher("/listaprodutos.jsp");
			
			dp.forward(request, response);
			
		} else {
			
			response.sendRedirect("/projetoprogweb");
			
		}
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
