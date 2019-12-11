function limparCampos() {
	document.getElementById('inputSenhaLogin').value = '';
	document.getElementById('inputEmailLogin').value = '';
}

function entrar() {
	
	if (document.getElementById('senhaLogin').value == '123' && document.getElementById('emailLogin').value != '') {
	location.replace("https://google.com");
	} else {
		alert('senha incorreta');
	}
}