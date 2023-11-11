[Insomnia-arquivo.json](https://github.com/Plusoft-Challenge/TalentScope-backend/files/13326678/Insomnia-arquivo.json)# TalentScope

## Uma api para automatização de leitura de currículo e envio de feedbacks personalizados

<br/>

- > <h2>Usuario</h2>
  - [Cadastrar](#cadastrar-usuario)
  - [Listar todos](#listar-usuarios)
  - [Mostrar detalhes](#detalhar-um-usuario)
  - [Atualizar](#atualizar-usuario)
  - [Apagar](#apagar-usuario)

<br/>

- > <h2>Nivel de Permissao</h2>
  - [Cadastrar](#nivel-de-permissao)
  - [Listar todas](#listar-niveis-de-permissoes)
  - [Mostrar detalhes](#detalhar-um-nivel-de-permissao)
  - [Atualizar](#atualizar-nivel-de-permissao)
  - [Apagar](#apagar-nivel-de-permissao)

<br/>

- > <h2>Vaga</h2>
  - [Cadastrar](#cadastrar-vaga)
  - [Listar todas](#listar-vagas)
  - [Mostrar detalhes](#detalhar-um-vaga)
  - [Atualizar](#atualizar-vaga)
  - [Apagar](#apagar-vaga)

<br/>

- > <h2>Habilidade</h2>
  - [Cadastrar](#cadastrar-habilidade)
  - [Listar todas](#listar-habilidades)
  - [Mostrar detalhes](#detalhar-uma-habilidade)
  - [Atualizar](#atualizar-habilidade)
  - [Apagar](#apagar-habilidade)

<br/>

- > <h2>Curriculo</h2>
  - [Cadastrar](#cadastrar-curriculo)
  - [Listar todos](#listar-curriculos)
  - [Mostrar detalhes](#detalhar-um-curriculo)
  - [Atualizar](#atualizar-curriculo)
  - [Apagar](#apagar-curriculo)
  - [Extrair](#aextrair-curriculo)

<br/>

- > <h2>Feedback</h2>
  - [Cadastrar](#cadastrar-feedback)
  - [Listar todos](#listar-feedback)
  - [Mostrar detalhes](#detalhar-um-feedback)
  - [Atualizar](#atualizar-feedback)
  - [Apagar](#apagar-feedback)

<br/>

- > <h2>ChatGPT</h2>
  - [Criar consulta ChatGPT](#criar-consulta-chatgpt)

<br/>

- > <h2>Deploy Nuvem</h2>
  - [Deploy e testes](#deploy-testes)

<br/>


<details>
<summary>Usuario</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/talentScope/usuarios</summary>

<br/>

### Cadastrar usuario

<br/>

### Requisição:

```json
{
  "nome": "Rafael Ferreira",
  "email": "rafael@plusofit.com",
  "senha": "7894562",
	"status": true,
	"dtCriacao": "2023-05-15 10:08:02",
	"dtAlteracao": "",
	"nivelPermissao": {
		"id": 1
	}
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Rafael Ferreira",
	"email": "rafael@plusofit.com",
	"senha": "7894562",
	"status": true,
	"dtCriacao": "2023-05-15 10:08:02",
	"dtAlteracao": null,
	"nivelPermissao": {
		"id": 1,
		"nome": null,
		"descricao": null
	}
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/usuarios</summary>

<br/>

### Listar usuarios

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"nome": "Rafael Ferreira",
		"email": "rafael@plusofit.com",
		"senha": "7894562",
		"status": true,
		"dtCriacao": "2023-05-15 10:08:02",
		"dtAlteracao": null,
		"nivelPermissao": {
			"id": 1,
			"nome": "Acesso-1",
			"descricao": "Tem permissão somente para leitura dos curriculos e vagas"
		}
	},
	{
		"id": 2,
		"nome": "Isabelle Souza Santos",
		"email": "isabelle.souza@plusofit.com",
		"senha": "123456",
		"status": true,
		"dtCriacao": "2023-05-03 10:08:02",
		"dtAlteracao": null,
		"nivelPermissao": {
			"id": 1,
			"nome": "Acesso-1",
			"descricao": "Tem permissão somente para leitura dos curriculos e vagas"
		}
	}
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há usuarios para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/usuarios/{id}</summary>

<br/>

### Detalhar um usuario

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Rafael Ferreira",
	"email": "rafael@plusofit.com",
	"senha": "7894562",
	"status": true,
	"dtCriacao": "2023-05-15 10:08:02",
	"dtAlteracao": null,
	"nivelPermissao": {
		"id": 1,
		"nome": "Acesso-1",
		"descricao": "Tem permissão somente para leitura dos curriculos e vagas"
	}
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Usuario não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/talentScope/usuarios/{id}</summary>

<br/>

### Atualizar usuario

### Requisição:


```json
{
  "nome": "Rafael Ferreira dos Santos",
  "email": "rafael.santos@plusofit.com",
  "senha": "7894562",
	"status": true,
	"dtCriacao": "2023-05-15 10:08:02",
	"dtAlteracao": "",
	"nivelPermissao": {
		"id": 2
	}
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Rafael Ferreira dos Santos",
	"email": "rafael.santos@plusofit.com",
	"senha": "7894562",
	"status": true,
	"dtCriacao": "2023-05-15 10:08:02",
	"dtAlteracao": null,
	"nivelPermissao": {
		"id": 2,
		"nome": null,
		"descricao": null
	}
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/talentScope/usuarios/{id}</summary>

<br/>

### Apagar usuario

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Usuario apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Usuario não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório | descrição                                                                                                  |
| :---------------: | :---------: | :---------: | ---------------------------------------------------------------------------------------------------------- |
|        id         |    numeric(10)     |     sim     | Id do usuario                                                                                       |
|       nome        |    varchar(80)     |     sim     | Nome do usuario                                                                                     |
|       email       |    varchar(80)     |     sim     | Email do usuario                                                                                    
|       senha       |    varchar(15)     |     sim     | Senha do usuario. Senha deve conter de 8 a 15 caracteres, no min. 1 letra maiuscula e 1 caractere especial|
|  nivelPermissao  | fk_nivel_permissao |     sim     | Nivel de permissão para utilizar a plataforma                                                       |
|       status       | Boolean(1)  |     sim     | Flag para informar se o usuario esta ativo na plataforma                                                   |
|   dtCriacao    |  Datetime   |     sim     | Data da criação do usuario                                                                                 |
| dtAtualizacao  |  Datetime   |     nao     | Data da atualização do usuario                                                                             |

</details>

<details>
<summary>Nivel de Permissão</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/talentScope/nivelPermissao</summary>

<br/>

### Cadastrar nivel de permissao

<br/>

### Requisição:

```json
{
	"nome": "Acesso-1",
	"descricao": "Tem permissão somente para leitura"
}
```

```json
{
  "nome": "Administrador",
  "descricao": "Usuário com permissão master"
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Acesso-1",
	"descricao": "Tem permissão somente para leitura"
}
```

```json
{
	"id": 2,
	"nome": "Administrador",
	"descricao": "Usuário com permissão master"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/nivelPermissao</summary>

<br/>

### Listar niveis de permissoes

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"nome": "Acesso-1",
		"descricao": "Tem permissão somente para leitura"
	},
	{
		"id": 2,
		"nome": "Administrador",
		"descricao": "Usuário com permissão master"
	}
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há nivel de permissao para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/nivelPermissao/{id}</summary>

<br/>

### Detalhar um nivel de permissao

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Acesso-1",
	"descricao": "Tem permissão somente para leitura"
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Nivel de permissao não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/talentScope/nivelPermissao/{id}</summary>

<br/>

### Atualizar nivel de permissao

### Requisição:


```json
{
	"nome": "Acesso-1",
	"descricao": "Tem permissão somente para leitura dos curriculos e vagas"
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Acesso-1",
	"descricao": "Tem permissão somente para leitura dos curriculos e vagas"
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/talentScope/nivelPermissao/{id}</summary>

<br/>

### Apagar nivel de permissao

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Nivel de permissao apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Nivel de permissao não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo     | obrigatório | descrição                         |
| :---------------: | :----------: | :---------: | ----------------------------------|
|        id         | numeric(3)   |     sim     | Id do nivel de permissao          |
|       nome        | varchar(30)  |     sim     | Nome do usuario                   |
|     descricao     | varchar(250) |     sim     | Descrição do nivel de permissão   |


</details>

<details>
<summary>Habilidade</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/talentScope/habilidades</summary>

<br/>

### Cadastrar habilidade

<br/>

### Requisição:

```json
{
	"nome": "Experiência com Banco de Dados Oracle SQL"
}
```
```json
{
	"nome": "Experiência com Java, Spring Boot."
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Experiência com Banco de Dados Oracle SQL"
}
```

```json
{
	"id": 2,
	"nome": "Experiência com Java, Spring Boot."
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/habilidades</summary>

<br/>

### Listar habilidades

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"nome": "Experiência com Banco de Dados Oracle SQL"
	},
	{
		"id": 2,
		"nome": "Experiência com Java, Spring Boot."
	}
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há habilidades para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/habilidades/{id}</summary>

<br/>

### Detalhar uma habilidade
<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 2,
	"nome": "Experiência com Java, Spring Boot."
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
	"timestamp": "2023-09-11T22:45:11.000+00:00",
	"status": 404,
	"error": "Not Found",
	"trace": "br.com.TalentScope.exception.RestNotFoundException......",
	"message": "habilidade não encontrado",
	"path": "/talentScope/habilidades/3"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/talentScope/habilidades/{id}</summary>

<br/>

### Atualizar habilidade

### Requisição:


```json
{
	"nome": "2 anos de experiência em Java com spring, JPA Hibernate"
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 2,
	"nome": "2 anos de experiência em Java com spring, JPA Hibernate"
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/talentScope/habilidade/{id}</summary>

<br/>

### Apagar habilidade

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Habilidade apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Habilidade não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo     | obrigatório | descrição                         |
| :---------------: | :----------: | :---------: | ----------------------------------|
|        id         | numeric(3)   |     sim     | Id da habilidade        |
|       nome        | varchar(50)  |     sim     | Descrição da habiliade                  |

</details>

<details>
<summary>Vaga</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/talentScope/vagas</summary>

<br/>

### Cadastrar vaga

<br/>

### Requisição:

```json
{
	"nome": "Analista de Sistemas I",
	"descricaoCargo": "Desenvolver Java Junior",
	"descricaoVaga": "A vaga de desenvolvedor Java requer habilidades em programação orientada a objetos, uso de frameworks como Spring e Hibernate, experiência em testes e depuração de código, trabalho em equipe e conhecimentos em tecnologias relacionadas a aplicações web e bancos de dados.",
	"dtAbertura": "2023-10-09 14:00:00",
	"dtEncerramento": "2023-07-22 17:00:00",
	"usuario":{
		"id": 1
	},
	"habilidades": [
		{
		"id": 1
		}
	]
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Analista de Sistemas I",
	"descricaoCargo": "Desenvolver Java Junior",
	"descricaoVaga": "A vaga de desenvolvedor Java requer habilidades em programação orientada a objetos, uso de frameworks como Spring e Hibernate, experiência em testes e depuração de código, trabalho em equipe e conhecimentos em tecnologias relacionadas a aplicações web e bancos de dados.",
	"dtAbertura": "2023-10-09 14:00:00",
	"dtEncerramento": "2023-07-22 17:00:00",
	"usuario": {
		"id": 1,
		"nome": null,
		"email": null,
		"senha": null,
		"status": null,
		"dtCriacao": null,
		"dtAlteracao": null,
		"nivelPermissao": null
	},
	"habilidades": [
		{
			"id": 1,
			"nome": null
		}
	]
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócio"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/vagas</summary>

<br/>

### Listar vagas

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"nome": "Analista de Sistemas I",
		"descricaoCargo": "Desenvolver Java Junior",
		"descricaoVaga": "A vaga de desenvolvedor Java requer habilidades em programação orientada a objetos, uso de frameworks como Spring e Hibernate, experiência em testes e depuração de código, trabalho em equipe e conhecimentos em tecnologias relacionadas a aplicações web e bancos de dados.",
		"dtAbertura": "2023-10-09 14:00:00",
		"dtEncerramento": "2023-07-22 17:00:00",
		"usuario": {
			"id": 1,
			"nome": "Rafael Ferreira dos Santos",
			"email": "rafael.santos@plusofit.com",
			"senha": "7894562",
			"status": true,
			"dtCriacao": "2023-05-15 10:08:02",
			"dtAlteracao": null,
			"nivelPermissao": {
				"id": 2,
				"nome": "Administrador",
				"descricao": "Usuário com permissão master"
			}
		},
		"habilidades": [
			{
				"id": 1,
				"nome": "Experiência com Banco de Dados Oracle SQL"
			}
		]
	},
	{
		"id": 2,
		"nome": "Analista de Dados",
		"descricaoCargo": "Analista de dados Senior",
		"descricaoVaga": "Estamos em busca de um Analista de Dados talentoso e apaixonado por números para se juntar à nossa equipe. O candidato ideal será responsável por coletar, analisar e interpretar dados, transformando-os em informações valiosas para orientar a tomada de decisões estratégicas da empresa. Você trabalhará em estreita colaboração com outras equipes para identificar tendências, padrões e insights que impulsionarão nosso negócio.",
		"dtAbertura": "2023-10-15 15:00:00",
		"dtEncerramento": "2023-12-22 17:00:00",
		"usuario": {
			"id": 1,
			"nome": "Rafael Ferreira dos Santos",
			"email": "rafael.santos@plusofit.com",
			"senha": "7894562",
			"status": true,
			"dtCriacao": "2023-05-15 10:08:02",
			"dtAlteracao": null,
			"nivelPermissao": {
				"id": 2,
				"nome": "Administrador",
				"descricao": "Usuário com permissão master"
			}
		},
		"habilidades": [
			{
				"id": 1,
				"nome": "Experiência com Banco de Dados Oracle SQL"
			}
		]
	}
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há vagas para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/vagas/{id}</summary>
<br/>

### Detalhar uma vaga

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Analista de Sistemas I",
	"descricaoCargo": "Desenvolver Java Junior",
	"descricaoVaga": "A vaga de desenvolvedor Java requer habilidades em programação orientada a objetos, uso de frameworks como Spring e Hibernate, experiência em testes e depuração de código, trabalho em equipe e conhecimentos em tecnologias relacionadas a aplicações web e bancos de dados.",
	"dtAbertura": "2023-10-09 14:00:00",
	"dtEncerramento": "2023-07-22 17:00:00",
	"usuario": {
		"id": 1,
		"nome": "Rafael Ferreira dos Santos",
		"email": "rafael.santos@plusofit.com",
		"senha": "7894562",
		"status": true,
		"dtCriacao": "2023-05-15 10:08:02",
		"dtAlteracao": null,
		"nivelPermissao": {
			"id": 2,
			"nome": "Administrador",
			"descricao": "Usuário com permissão master"
		}
	},
	"habilidades": [
		{
			"id": 1,
			"nome": "Experiência com Banco de Dados Oracle SQL"
		}
	]
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Vaga não cadastrada"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/talentScope/vagas/{id}</summary>

<br/>

### Atualizar vaga

### Requisição:


```json
{
	"nome": "Analista de Dados II",
	"descricaoCargo": "Analista de dados Pleno",
	"descricaoVaga": "Estamos em busca de um Analista de Dados talentoso e apaixonado por números para se juntar à nossa equipe. O candidato ideal será responsável por coletar, analisar e interpretar dados, transformando-os em informações valiosas para orientar a tomada de decisões estratégicas da empresa. Você trabalhará em estreita colaboração com outras equipes para identificar tendências, padrões e insights que impulsionarão nosso negócio.",
	"dtAbertura": "2023-10-15 15:00:00",
	"dtEncerramento": "2023-12-22 17:00:00",
	"usuario":{
		"id": 1
	},
	"habilidades": [
		{
		"id": 1
		}
	]
}	"usuario":{
		"id": 2
	},
	"habilidades": [
		{
		"id": 1
		}
	]
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 2,
	"nome": "Analista de Dados II",
	"descricaoCargo": "Analista de dados Pleno",
	"descricaoVaga": "Estamos em busca de um Analista de Dados talentoso e apaixonado por números para se juntar à nossa equipe. O candidato ideal será responsável por coletar, analisar e interpretar dados, transformando-os em informações valiosas para orientar a tomada de decisões estratégicas da empresa. Você trabalhará em estreita colaboração com outras equipes para identificar tendências, padrões e insights que impulsionarão nosso negócio.",
	"dtAbertura": "2023-10-15 15:00:00",
	"dtEncerramento": "2023-12-22 17:00:00",
	"usuario": {
		"id": 1,
		"nome": null,
		"email": null,
		"senha": null,
		"status": null,
		"dtCriacao": null,
		"dtAlteracao": null,
		"nivelPermissao": null
	},
	"habilidades": [
		{
			"id": 1,
			"nome": null
		}
	]
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "Vaga não cadastrada"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/talentScope/vaga/{id}</summary>

<br/>

### Apagar vaga

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Vaga apagada com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Vaga não cadastrada"
}
```

</details>

<br/><br/>

# Campos de Requisição

|         campo       |   tipo        | obrigatório | descrição |
| :-----------------: | :-----------: | :---------: | ---------------------------------------- |
|          id         |  numeric(10)  |     sim     | Id da vaga                               |
|         nome        |  varchar(80)  |     sim     | Nome da vaga                             |
|       descricaoCargo     |    varchar    |     sim     | Descrição do cargo                       |
|       descricaoVaga     |    varchar    |     sim     | Descrição da vaga                      |
|     dtAbertura   |   Datetime    |     sim     | Data da abertura da vaga                 |
|  dtEncerramento  |   Datetime    |     sim     | Data do encerramento da vaga             |
|       usuarios      |  fk_usuario   |     sim     | Um usuario pode ter varias vagas         |
|      habilidades    | fk_habilidade |     sim     | Uma vaga pode ter várias habilidades     |

</details>

<details>
<summary>Curriculo</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /talentScope/feedback/{feedbackId}/curriculos</summary>

<br/>

### Cadastrar curriculo

<br/>

### Requisição:

```json
{
	"arquivo": "curriculo-ritacassia.pdf",
	"dtEnvioCurriculo": "2023-05-03 10:08:02",
	"nomeCandidato": "Rita de Cassia",
	"email": "rita.cassia@email.com",
	"vaga": {
		"id": 1
	}
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>
```json
{
	"id": 1,
	"arquivo": "curriculo-ritacassia.pdf",
	"dtEnvioCurriculo": "2023-05-03 10:08:02",
	"nomeCandidato": "Rita de Cassia",
	"email": "rita.cassia@email.com",
	"vaga": {
		"id": 1,
		"nome": null,
		"descricaoCargo": null,
		"salario": null,
		"dtAbertura": null,
		"dtEncerramento": null,
		"dtProgEnvioFeedback": null,
		"usuario": null,
		"habilidades": null
	},
	"feedback": {
		"id": 1,
		"feedback": "Parabéns! Você passou para a proxima fase!",
		"aprovado": true,
		"dtAnalise": "2023-05-03 10:08:02",
		"envioFeedback": true,
		"dtEnvioFeedback": "2023-05-03 12:00:00"
	}
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/curriculos</summary>

<br/>

### Listar curriculos

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"arquivo": "curriculo-ritacassia.pdf",
		"dtEnvioCurriculo": "2023-05-03 10:08:02",
		"nomeCandidato": "Rita de Cassia",
		"email": "rita.cassia@email.com",
		"vaga": {
			"id": 1,
			"nome": "Desenvolvedor Java",
			"descricaoCargo": "Programação orientada a objetos, uso de frameworks Spring, experiência em testes, trabalho em equipe, aplicações web e bancos de dados.",
			"salario": 6000.00,
			"dtAbertura": "2023-05-03 12:00:00",
			"dtEncerramento": "2023-07-03 12:00:00",
			"dtProgEnvioFeedback": "2023-05-20 16:00:00",
			"usuario": {
				"id": 1,
				"nome": "Isabelle Souza Santos",
				"email": "isabelle.souza@plusofit.com",
				"senha": "123456",
				"status": true,
				"dtCriacao": "2023-05-03 10:08:02",
				"dtAlteracao": null,
				"nivelPermissao": {
					"id": 1,
					"nome": "Administrador",
					"descricao": "Permissão total."
				}
			},
			"habilidades": [
				{
					"id": 1,
					"nome": "Experiencia de 2 anos"
				},
				{
					"id": 2,
					"nome": "2 anos de experiência em Java com spring, JPA Hibernate"
				}
			]
		},
		"feedback": {
			"id": 1,
			"feedback": "Parabéns! Você passou para a proxima fase!",
			"aprovado": true,
			"dtAnalise": "2023-05-03 10:08:02",
			"envioFeedback": true,
			"dtEnvioFeedback": "2023-05-03 12:00:00"
		}
	},
	{
		"id": 2,
		"arquivo": "rafael-cv.pdf",
		"dtEnvioCurriculo": "2023-05-05 12:03:04",
		"nomeCandidato": "Rafael Ferreira",
		"email": "rafaelFerreira@email.com",
		"vaga": {
			"id": 1,
			"nome": "Desenvolvedor Java",
			"descricaoCargo": "Programação orientada a objetos, uso de frameworks Spring, experiência em testes, trabalho em equipe, aplicações web e bancos de dados.",
			"salario": 6000.00,
			"dtAbertura": "2023-05-03 12:00:00",
			"dtEncerramento": "2023-07-03 12:00:00",
			"dtProgEnvioFeedback": "2023-05-20 16:00:00",
			"usuario": {
				"id": 1,
				"nome": "Isabelle Souza Santos",
				"email": "isabelle.souza@plusofit.com",
				"senha": "123456",
				"status": true,
				"dtCriacao": "2023-05-03 10:08:02",
				"dtAlteracao": null,
				"nivelPermissao": {
					"id": 1,
					"nome": "Administrador",
					"descricao": "Permissão total."
				}
			},
			"habilidades": [
				{
					"id": 1,
					"nome": "Experiencia de 2 anos"
				},
				{
					"id": 2,
					"nome": "2 anos de experiência em Java com spring, JPA Hibernate"
				}
			]
		},
		"feedback": {
			"id": 1,
			"feedback": "Parabéns! Você passou para a proxima fase!",
			"aprovado": true,
			"dtAnalise": "2023-05-03 10:08:02",
			"envioFeedback": true,
			"dtEnvioFeedback": "2023-05-03 12:00:00"
		}
	}
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há curriculos para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/curriculos/{id}</summary>

### Detalhes um curriculo

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"arquivo": "curriculo-ritacassia.pdf",
	"dtEnvioCurriculo": "2023-05-03 10:08:02",
	"nomeCandidato": "Rita de Cassia",
	"email": "rita.cassia@email.com",
	"vaga": {
		"id": 1,
		"nome": "Desenvolvedor Java",
		"descricaoCargo": "Programação orientada a objetos, uso de frameworks Spring, experiência em testes, trabalho em equipe, aplicações web e bancos de dados.",
		"salario": 6000.00,
		"dtAbertura": "2023-05-03 12:00:00",
		"dtEncerramento": "2023-07-03 12:00:00",
		"dtProgEnvioFeedback": "2023-05-20 16:00:00",
		"usuario": {
			"id": 1,
			"nome": "Isabelle Souza Santos",
			"email": "isabelle.souza@plusofit.com",
			"senha": "123456",
			"status": true,
			"dtCriacao": "2023-05-03 10:08:02",
			"dtAlteracao": null,
			"nivelPermissao": {
				"id": 1,
				"nome": "Administrador",
				"descricao": "Permissão total."
			}
		},
		"habilidades": [
			{
				"id": 1,
				"nome": "Experiencia de 2 anos"
			},
			{
				"id": 2,
				"nome": "2 anos de experiência em Java com spring, JPA Hibernate"
			}
		]
	},
	"feedback": {
		"id": 1,
		"feedback": "Parabéns! Você passou para a proxima fase!",
		"aprovado": true,
		"dtAnalise": "2023-05-03 10:08:02",
		"envioFeedback": true,
		"dtEnvioFeedback": "2023-05-03 12:00:00"
	}
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Curriculo não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b> /talentScope/feedback/{feedbackId}/curriculos/{id}</summary>

<br/>

### Atualizar curriculo

### Requisição:


```json
{
	"arquivo": "rafael-cv.pdf",
	"dtEnvioCurriculo": "2023-05-05 12:03:04",
	"nomeCandidato": "Rafael Ferreira",
	"email": "rafaelFerreira@email.com",
	"vaga": {
		"id": 1
	}
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
  "id": 1,
  "arquivo": "Igor.pdf",
  "data_envio": "08/04/2023 - 09:04:35",
  "nome_candidato": "Igor Oliveira",
  "email_candidato": "igor@gmail.com",
  "vaga":
    {
      "nome": "Desenvolvedor Java"
    },
  "feedback":
    {
      "id": 1,
      "descricao": "Parabéns! Você foi aprovado",
      "resultado": true,
      "data_analise": "08/04/2023 - 09:10:35",
      "envio": true,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback": "15/04/2023 - 18:00:00"
    }
},
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negócio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/talentScope/curriculo/{id}</summary>

<br/>

### Apagar curriculo

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Curriculo apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Curriculo não cadastrado"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/extract</summary>

<br/>

### Extrair curriculo

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```
"Extração do currículo em PDF concluída com sucesso!"
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```
"Extração não realizada"
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório | descrição                                 |
| :---------------: | :---------: | :---------: | ------------------------------------------|
|        id         |     int     |     sim     | Id do curriculo                           |
|      arquivo      |    blob     |     sim     | Curriculo anexado                         |
|    dtEnvioCurriculo     |    Date     |     sim     | Data do envio do currículo                |
|  nomeCandidato   | varchar(50) |     sim     | Nome do candidato                         |
|  email  | varchar(80) |     sim     | Email do candidato                        |
|       vaga        |   fk_vaga   |     sim     | Vaga em que o curriculo esta relacionado                              |
|     feedback      | fk_feedback |     sim     | Feedback do curriculo |


</details>

<details>
<summary>Feedback</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /talentScope/feedback</summary>

<br/>

### Cadastrar feedback

<br/>

### Requisição:

```json
{
	"feedback": "Parabéns! Você passou para a proxima fase!",
	"aprovado": true,
	"dtAnalise": "2023-05-03 10:08:02",
	"envioFeedback": true,
	"dtEnvioFeedback": "2023-05-03 12:00:00"
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>
```json
{
	"id": 1,
	"feedback": "Parabéns! Você passou para a proxima fase!",
	"aprovado": true,
	"dtAnalise": "2023-05-03 10:08:02",
	"envioFeedback": true,
	"dtEnvioFeedback": "2023-05-03 12:00:00"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/feedback</summary>

<br/>

### Listar feedbacks

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"feedback": "Parabéns! Você passou para a proxima fase!",
		"aprovado": true,
		"dtAnalise": "2023-05-03 10:08:02",
		"envioFeedback": true,
		"dtEnvioFeedback": "2023-05-03 12:00:00"
	},
	{
		"id": 2,
		"feedback": "Infelizmente você não foi selecionado para a proxima fase devido não ter a experiencia necessária que a vaga necessita. Não desista, você está no caminho certo.",
		"aprovado": false,
		"dtAnalise": "2023-05-15 10:08:02",
		"envioFeedback": true,
		"dtEnvioFeedback": "2023-05-03 12:00:00"
	}
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há feedbacks para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/talentScope/feedback/{id}</summary>

### Detalhes um feedback

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"feedback": "Parabéns! Você passou para a proxima fase!",
	"aprovado": true,
	"dtAnalise": "2023-05-03 10:08:02",
	"envioFeedback": true,
	"dtEnvioFeedback": "2023-05-03 12:00:00"
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Feedback não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b> /talentScope/feedback/{id}</summary>

<br/>

### Atualizar feedback

### Requisição:


```json
{
	"feedback": "Parabéns! Você foi aprovada para a próxima fase",
	"aprovado": true,
	"dtAnalise": "2023-05-03 10:08:02",
	"envioFeedback": true,
	"dtEnvioFeedback": "2023-05-20 16:00:00"
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 1,
	"feedback": "Parabéns! Você foi aprovada para a próxima fase",
	"aprovado": true,
	"dtAnalise": "2023-05-03 10:08:02",
	"envioFeedback": true,
	"dtEnvioFeedback": "2023-05-20 16:00:00"
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negócio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/talentScope/feedback/{id}</summary>

<br/>

### Apagar feedback

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Feedback apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Feedback não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório | descrição                                 |
| :---------------: | :---------: | :---------: | ------------------------------------------|
|        id         |     int     |     sim     | Id do feedback                         |
|      feedback      |    clob     |     sim     | Descrição do feedback que será enviado ao candidato                      |
|    dtAnalise     |    Date     |     sim     | Data da análise do curriculo                |
|  envioFeedback   | boolean |     sim     | Indica se o feedback foi enviado ou não                       |
|  dtEnvioFeedback  | Date |     não     | Data em que o feedback foi enviado                        |

</details>

<details>
<summary>Chat GPT</summary>

<br>

<summary> <b style="color:green">POST</b>/talentScope/chatgpt/text</summary>

<br/>

### Criar consulta ChatGPT

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"texto": "Ana Cristina Ferreira ana.cristina.ferreira@email.com.br (XX) 99999-9999 linkedin.com/in/acferreira Programadora ousada com conhecimentos de C#, C++ e Python. Recém formada em TI na Universidade X com média 9,5, trabalhei como programadora em C# voluntário no Vídeo Game X. Nosso projeto recebeu o prêmio de melhor jogo independente brasileiro. Busco combinar o que aprendi na indústria do vídeo game com o que aprendi na faculdade para criar código inovadores para os clientes da Empresa X. Experiência como voluntária Programadora em C# Vídeo Game X (de janeiro de 2019 até fevereiro de 2020) Implementei as mecânicas do jogo no motor gráfico Unity 3D; Programei a inteligência artificial dos inimigos do jogo; Importei diversos tipos de arquivos como áudio, texturas e objetos 3D no jogo. Colaborei com designers e artistas. Principal conquista: Recebemos análises positivas de 95% dos jogadores. Formação acadêmica Bacharelado em TI Universidade X (fevereiro de 2020) Presidente do clube de estudos de design de jogos; Aula favorita: Modelagem de dados. Fiz aulas de inteligência artificial como atividade extracurricular. Principais conquistas: Me formei como orador da turma; Tirei nota 10 no meu TCC. Competências e habilidades Trabalho em equipe, adquirida após trabalhar como voluntário no Vídeo Game X; Design de sistemas, adquirida após fazer um curso na Escola X; Gamificação, adquirida após colaborar com o game designer do Vídeo Game X; Inglês avançado, adquirida após me formar no Curso de Inglês X; Espanhol intermediário, adquirido ao fazer aulas no Curso de Espanhol X. Informações adicionais Vencedora do Game Jam 2019 da Universidade X; Apaixonada por arte e criatividade. Anaisando o curriculo acima para uma vaga que tem essa descrição: A vaga de desenvolvedor Java requer habilidades em programação orientada a objetos, uso de frameworks como Spring e Hibernate, experiência em testes e depuração de código, trabalho em equipe e conhecimentos em tecnologias relacionadas a aplicações web e bancos de dados. E requer essas habilidades: Banco de dados Oracle, 2 anos de experiência em Java com spring, JPA Hibernate. Com base na vaga e habilidades, analisando o curriculo, em um ranking de 1 a 5, qual é a posição desse candidato para essa vaga? Retorne também o nome do candidato e o e-mail. Retorne o ranking, o nome e o e-mail do candidato exatamente nessa ordem, e exatamente como no exemplo: ranking:5|nome:joao|email:joao@email"
}
```

<br/>
<hr>


### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
[
	{
		"text": ".com.\n\nRanking:2|Nome:Ana Cristina Ferreira|Email:ana.cristina.ferreira@email.com.br",
		"index": 0,
		"logprobs": null,
		"finish_reason": "stop"
	}
]
```

`status code: 400`

#### Body: <b>Application/json</b>

```
Incorrect API key provided: sk-NytsI***************************************o1M0. You can find your API key at https://platform.openai.com/account/api-keys.
```

```
You exceeded your current quota, please check your plan and billing details.
```


<br/><br/>

# Campo de Requisição

|       campo       |     tipo    | obrigatório | descrição                                 |
| :---------------: | :---------: | :---------: | ------------------------------------------|
|        texto         |     string     |     sim     | Texto que vai na consulta para o Chat GPT |

</details>

<details>
<summary>DevOps</summary>

## Benefícios
- [Veja os benefícios da aplicação em nuvem](https://www.canva.com/design/DAFuRHPwQGQ/1K0VD-khZl63pLQ9myj2tw/view?utm_content=DAFuRHPwQGQ&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink)


## Pré-requisitos para rodar a aplicação

Antes de começar, certifique-se de ter o seguinte instalado e configurado:

- [Portal Azure](https://portal.azure.com/)
- [Azure DevOps](https://dev.azure.com)
- [Oracle Database](https://www.oracle.com/br/database/)

## Deploy

1. Acesse a organização no Azure DevOps para realizar o deploy
- [DevOps](https://dev.azure.com/RM95838/DevOps/_build)
  
2. No portal do Azure, vá no Web App para abrir o link da aplicação
- [Web App](https://dev.azure.com/RM95838/DevOps/_build](https://portal.azure.com/#@fiap.com.br/resource/subscriptions/6d446799-52c2-4fad-8eef-4f99ee9014c0/resourceGroups/rg_TalentScopeWebapp/providers/Microsoft.Web/sites/TalentScope-webapp/appServices)https://portal.azure.com/#@fiap.com.br/resource/subscriptions/6d446799-52c2-4fad-8eef-4f99ee9014c0/resourceGroups/rg_TalentScopeWebapp/providers/Microsoft.Web/sites/TalentScope-webapp/appServices)

3. Copie e cole o link abaixo no navegador da internet
talentscope-webapp.azurewebsites.net 

5. Para testar a aplicação, insira o json no Insomnia para realizar o crud da aplicação

6. Verifique as gravações no Banco de Dado Oracle
    

</details>
