#language: pt

@PREENCHE_FORMULARIO
Funcionalidade: Formulario Register

  Cenario: Cadastro de Registro
    Dado que estou na pagina register "Register"
    Quando preencho o campo firstname com "Romulo"
    E preencho o campo lastname com "lacerda"
    E preencho o campo adress com "Rua Maria Alice Gomes Dias"
    E preencho o campo email com "romulolacerda9@hotmail.com"
    E preencho o campo phone com "1136865933"
    E clico em "Male" do campo gender
    E seleciono os hobbies
    	|hobbie|
    	|Movies|
    	|Hockey|
    E seleciono as linguagens
    	|Portuguese|
    	|English|
    E envio o arquivo "teste.jpg"
    E seleciono a skill "Java"
    E seleciono o primeiro country com "Brazil" e o segundo country com "Australia"
    E seleciono o ano "1994" e o mes "August" e o dia "23"
    E preencho o campo password com "Teste123" e o confirma password com "Teste123"
    E clico em cadastrar
    
