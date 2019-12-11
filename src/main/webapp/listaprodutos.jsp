<%@ page import="java.util.*, projetoprogweb.entities.Produto" %>
<html>
<head>
<title>Lista de Produtos</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link href="css/listaprodutos.css" rel="stylesheet" type="text/css">
<link rel="icon" href="images/logo.png">
<script src="js/login.js"></script>
</head>
<body>
	<%
	
		List<Produto> produtos = (List<Produto>) request.getAttribute("lista_produtos");
	%>

	<table class="table table-striped mx-auto" id="tabelaProdutos">
		<thead>
			<tr>
				<th scope="col">Nome</th>
				<th scope="col">Medida</th>
				<th scope="col">Quantidade Disponivel</th>
				<th scope="col">Preco</th>
			</tr>
		</thead>
		<tbody>
		
				<% for (Produto prod : produtos) { %>
			
					<tr>
						<td> <%= prod.getNome() %> </td>
						<td> <%= prod.getMedida() %> </td>
						<td> <%= prod.getQuantidadeDisp() %> </td>
						<td> <%= prod.getPreco() %> </td>
					</tr>
	
				<% } %>
		
			
			
		</tbody>
	</table>
	

	<div class="text-center mt-4">
		<a id="botaoCadastrar" class="btn btn-md btn-dark" href="/projetoprogweb/cadastroprodutos.jsp" role="button">
			  Cadastrar novo Produto
		</a>
		
		<a id="botaoVoltar" class="btn btn-md btn-dark" href="/projetoprogweb" role="button">
			  Sair
		</a>
	</div>
	
</body>
</html>