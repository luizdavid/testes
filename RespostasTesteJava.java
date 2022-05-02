//Questão 1

private static boolean isOn () {
    if (isOff()) {
        return false;
    }
    return true;
}	

//Questão 2

private void processarItens(List itens) { 
    for (Item i : itens) { 
        try {
            processar(i); 
        } catch (ItemException e) {            
 	    }
    } 
}

private void processar(Item i) throws ItemException { 
    
}

//Questão 3

Passo 1: Criar um branch a partir da produção
Passo 2: Corrigir o problema nessa nova branch
Passo 3: Fazer o merge com o branch de produção
Passo 4: Criar uma tag indicando o número da nova versão

//Questão 4

select PESSOA.NOME,SALARIO.SALARIO from PESSOA 
			inner join SALARIO on PESSOA.ID_PESSOA = SALARIO.ID_PESSOA
WHERE 
	PESSOA.CPF='123.123.123-12' 
	AND '2018-06-01' BETWEEN SALARIO.DATA_INICIO_VIGENCIA AND SALARIO.DATA_FIM_VIGENCIA
	
//Questão 5
SELECT PESSOA.CD_PESSOA,PESSOA.NOME,SUM(BENEFICIO.VALOR_BENEFICIO) AS total FROM PESSOA 
				INNER JOIN BENEFICIO ON PESSOA.CD_PESSOA = BENEFICIO.CD_PESSOA
GROUP BY PESSOA.CD_PESSOA,PESSOA.NOME



//Questão 6
Alternate Key, também chamada de chave secundária, é qualquer chave candidata e que não é selecionada para ser chave primária. 
	
//Questão 7
O Angular 2+ utiliza Typescript, enquanto que o AngularJS, usa JavaScript.
O Angular agora é feito de componentes. Assim, não tem mais necessidade de criar um controller e trabalhar com $scope.
AngularJS não foi construído considerando o suporte mobile, enquanto o Angular 2+ é totalmente orientado ao mobile.

//Questão 8	
 maven é uma ferramenta de gestão de dependências, que através dela podemos automizar o processo de obter dependências que o nosso projeto executa. 
 Com isso, ganhamos uma melhor distribuição entre programadores no projeto, pois com o maven garatimos que todos tenho as mesmas versões das bibliotecas. 
 
//Questão 9	
Descreva quais são os métodos HTTP e para que são utilizados no protocolo REST.
GET - Solicita um recurso específico, através de com ou sem parâmetros, podendo retornar uma lista ou uma array de objetos.
POST - Utilizado para realizar uma submissão de informações ao endpoint disponibilizado. 
PUT - Utilizado para realizar uma submissão, mas para alterar alguma informação
DELETE - Remoção de uma informação em específico
PATCH - O método PATCH é utilizado para aplicar modificações parciais em um recurso. 

//Questão 10 
1. Job
	Um job é uma aplicação que processa uma quantidade finita de dados sem interação ou interrupção.
2. Step
	Representa uma etapa ou passo na qual uma lógica é executada. 
	Steps são encadeados para obterem o produto final do processamento. 

Observação: Spring batch não conheço, minha resposta foi basicamente busca na internete mesmo.
	
//Questão 11
Maven 					--> 9
Spring MVC 				--> 9 
SVN 					--> 5
Spring Batch 			--> 2
Javascript / JQuery 	--> 9
Git 					--> 9
Spring Data 			--> 9
Ajax / REST 			--> 8
WebSphere 				--> 5
Jenkins 				--> 5
Agular 2 				--> 5
SpringBoot 				--> 9
Enterprise Architect 	--> 2

