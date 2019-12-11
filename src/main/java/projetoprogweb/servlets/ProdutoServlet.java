package projetoprogweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetoprogweb.dao.ProdutoDAO;
import projetoprogweb.entities.Produto;

/**
 * Servlet implementation class ProdutoServlet
 */
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nomeproduto");
		Double preco = Double.parseDouble(request.getParameter("precoproduto"));
		String medida = request.getParameter("medidaproduto");
		int quantidadeDisp = Integer.parseInt(request.getParameter("quantidadeproduto"));
		
		Produto prod = new Produto(medida, preco, quantidadeDisp, nome);
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.salvarProduto(prod);
		
		ProdutoDAO dao2 = new ProdutoDAO();
		
		List<Produto> listaProdutos = dao2.preencherListaProdutos();
		
		request.setAttribute("lista_produtos", listaProdutos);
		
		RequestDispatcher dp = request.getRequestDispatcher("/listaprodutos.jsp");
		
		dp.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
