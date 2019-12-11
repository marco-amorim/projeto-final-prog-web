<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link href="css/login.css" rel="stylesheet" type="text/css">
<link rel="icon" href="images/logo.png">
<script src="js/login.js"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-md-12 col-lg-5 mx-auto">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h4 class="card-title text-center">Login</h4>
						<form class="form-signin">
							<div class="form-label-group">
								<label for="emailLogin">E-mail</label> <input type="email"
									id="emailLogin" class="form-control" placeholder="E-mail"
									name="emailLogin" required autofocus> <br>

							</div>

							<div class="form-label-group">
								<label for="senhaLogin">Senha</label> <input
									type="password" id="senhaLogin" class="form-control"
									name="senhaLogin" placeholder="Senha" required>

							</div>

							<!-- 							<div class="custom-control custom-checkbox mb-3"> -->
							<!-- 								<br> <input type="checkbox" class="custom-control-input" -->
							<!-- 									id="customCheck1"> <label class="custom-control-label" -->
							<!-- 									for="customCheck1">Lembrar de mim</label> -->
							<!-- 							</div> -->
							<br> <br>
							
							<div class="text-center">
							
								<button id="botaoEntrar"
									class="btn btn-md btn-dark" type="submit"
									onclick="entrar()">Entrar</button>
									
								<button id="botaoLimpar"
									class="btn btn-md btn-dark" type="submit"
									onclick="limparCampos()">Limpar</button>
							</div>

							<hr class="my-4">
							<div class="text-center">
								<a href="/projetoprogweb/cadastro.jsp"> Ainda não tem cadastro? Cadastre-se aqui! </a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
