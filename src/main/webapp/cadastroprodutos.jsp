<html>
<head>
<title>Cadastro de Produto</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<!--  jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />

<!-- Bootstrap Date-Picker Plugin -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
	
<link href="css/cadastro.css" rel="stylesheet" type="text/css">
<link rel="icon" href="images/logo.png">
<script src="js/cadastro.js"></script>
</head>
<body>

	<div class="text-center">
		<h2>Faça o cadastro do seu Produto abaixo!</h2>

	</div>
	<div class="formulario">
		<form action="ProdutoServlet" method="GET">


			<div class="form-row mx-auto">
				<div class="form-group col-md-4">
					<label for="nome">Nome *</label> <input type="text"
						class="form-control" id="nomeproduto" name="nomeproduto" placeholder="Nome" required>
				</div>
				<div class="form-group col-md-4">
					<label for="nome">Preco *</label> <input type="number" step="0.01"
						class="form-control" id="precoproduto" name="precoproduto" placeholder="Preco" required>
				</div>
				<div class="form-group col-md-4">
					<label for="nome">Medida *</label> <input type="text"
						class="form-control" id="medidaproduto" name="medidaproduto" placeholder="Medida" required>
				</div>
				<div class="form-group col-md-4">
					<label for="nome">Quantidade Disponivel *</label> <input type="number"
						class="form-control" id="quantidadeproduto" name="quantidadeproduto" placeholder="Quantidade" required>
				</div>

			</div>

			
			<div class="text-center mt-4">
				<button id="botaoCadastrar" type="submit" class="btn btn-md btn-dark">Cadastrar Produto</button>
				<a id="botaoCadastrar" type="submit" href="/projetoprogweb/LoginServlet" class="btn btn-md btn-dark">Sair</a>
			</div>
				
		</form>
		
	</div>


</body>
</html>