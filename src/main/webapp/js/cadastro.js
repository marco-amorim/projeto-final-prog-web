function getDadosEnderecoPorCEP(cep) {
				let url = 'https://viacep.com.br/ws/'+cep+'/json/unicode/'

				let xmlHttp = new XMLHttpRequest()
				xmlHttp.open('GET', url)

				xmlHttp.onreadystatechange = () => {
					
					if (xmlHttp.readyState == 4 && xmlHttp.status == 200 ) {
						
						let dadosJSONText = xmlHttp.responseText
						let dadosJSONObj = JSON.parse(dadosJSONText)
						
						if (dadosJSONObj.cep != undefined) {

						document.getElementById('endereco').value = dadosJSONObj.logradouro
						document.getElementById('bairro').value = dadosJSONObj.bairro
						document.getElementById('cidade').value = dadosJSONObj.localidade
						document.getElementById('uf').value = dadosJSONObj.uf
						
						}
						
					}
					
					if (xmlHttp.status != 200 && document.getElementById('cep').value != '') {
						
						document.getElementById('cep').value = '';
						alert('Por favor, insira um CEP valido!');
						
					}
				}

				xmlHttp.send()
}


function validar() {
	
	if (document.getElementById('inputSenha').value != document.getElementById('inputConfirmarSenha').value) {
		
		alert('Os campos de Senha e Confirmar Senha devem ser iguais!');
		return
		
	}
	
	
}











