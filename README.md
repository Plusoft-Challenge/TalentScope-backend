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
[Up{"_type":"export","__export_format":4,"__export_date":"2023-11-11T22:15:45.034Z","__export_source":"insomnia.desktop.app:v8.4.0","resources":[{"_id":"req_5a52e51ab8994803a11a36deec8e53ce","parentId":"fld_7d69a6c0584349a699411c84372cf309","modified":1697412399602,"created":1697412371118,"url":"localhost:8080/talentScope/chatgpt/text","name":"GET-RESULT","description":"","method":"GET","body":{},"parameters":[],"headers":[{"name":"User-Agent","value":"insomnia/8.2.0"}],"authentication":{},"metaSortKey":-1697412371118,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_7d69a6c0584349a699411c84372cf309","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1684636955831,"created":1684636955831,"name":"ChatGPT","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1684636955831,"_type":"request_group"},{"_id":"wrk_a8c236253c774b3594881ef373ec5888","parentId":null,"modified":1682907232949,"created":1682907232949,"name":"TaletScope","description":"","scope":"collection","_type":"workspace"},{"_id":"req_575b19995e534dbd8fd1932b755a1972","parentId":"fld_7d69a6c0584349a699411c84372cf309","modified":1699707885179,"created":1684636961164,"url":"localhost:8080/talentScope/chatgpt/text","name":"CHAT-GPT","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n\t\"texto\": \"Considerando uma vaga que tenha como pre requisitos habilidades em Java Spring Boot, e a descrição da vaga seja: Estamos em busca de um Analista de Dados talentoso e apaixonado por números para se juntar à nossa equipe. O candidato ideal será responsável por coletar, analisar e interpretar dados, transformando-os em informações valiosas para orientar a tomada de decisões estratégicas da empresa. Você trabalhará em estreita colaboração com outras equipes para identificar tendências, padrões e insights que impulsionarão nosso negócio. Com essas informações, analise se o seguinte curriculo é compativel com a vaga em um ranking de 1 a 5: Profissional de TI experiente com expertise em Spring Boot, focado no desenvolvimento de aplicações de alta qualidade e escaláveis.Experiência: Desenvolvedor Sênior na Desenvolvedor Júnior na [Empresa de Tecnologia] Educação: Bacharelado em Ciência da Computação - [Universidade Tal] Habilidades Técnicas: Spring Boot Java, Kotlin Banco de Dados: MySQL, PostgreSQL, MongoDB Ferramentas: IntelliJ IDEA, Eclipse, Git. Metodologias: Desenvolvimento Ágil. Certificações: Spring Professional, Java Programmer. Referências disponíveis mediante solicitação. Aqui acaba o currículo. Agora retorne o ranking, o nome do candidato e o e-mail exatamente como esse exemplo e separado por pipe, exemplo: ranking:5|nome:Jose|email:jose@email\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1684636961164,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_9af59db2ba2044aa836c300c9f389d66","parentId":"fld_f5f3f7720191420eb8206066495fc367","modified":1694713104345,"created":1683503098040,"url":"localhost:8080/talentScope/habilidades/3","name":"UPDATE","description":"","method":"PUT","body":{"mimeType":"application/json","text":"{\n\t\"nome\": \"4 anos de experiência em Java com spring, JPA Hibernate\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683503098040,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_f5f3f7720191420eb8206066495fc367","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1683502018108,"created":1683502018108,"name":"Habilidade","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1683502018108,"_type":"request_group"},{"_id":"req_b8fc6ef998d14b0482b9326bdd4a003d","parentId":"fld_f5f3f7720191420eb8206066495fc367","modified":1694875719158,"created":1683503021940,"url":"localhost:8080/talentScope/habilidades/1","name":"DELETE","description":"","method":"DELETE","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683503021940,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_3dc93639f9ef491fa4635d5af891f267","parentId":"fld_f5f3f7720191420eb8206066495fc367","modified":1694535665156,"created":1683502999777,"url":"localhost:8080/talentScope/habilidades/1","name":"GET-BY-ID","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683502999777,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_b4a11f2f7069478b872176a1b8b935b5","parentId":"fld_f5f3f7720191420eb8206066495fc367","modified":1699709570360,"created":1683502152579,"url":"localhost:8080/talentScope/habilidades","name":"CREATE","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n\t\"nome\": \"Java Spring Boot\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683502152579,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_c94e2b4ff2774e848b8a6b6f1a62ebe0","parentId":"fld_f5f3f7720191420eb8206066495fc367","modified":1694915168817,"created":1683502088281,"url":"localhost:8080/talentScope/habilidades","name":"GET-ALL","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683502088281,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_c5abfb74df74451bb60513ceeba403ce","parentId":"fld_491936f29b2442928f35fd13dabf765f","modified":1699740830749,"created":1683500430408,"url":"localhost:8080/talentScope/vagas/1","name":"UPDATE","description":"","method":"PUT","body":{"mimeType":"application/json","text":"{\n\t\"nome\": \"Analista de Dados Pleno\",\n\t\"descricaoCargo\": \"Analista de dados Pleno\",\n\t\"descricaoVaga\": \"Estamos em busca de um Analista de Dados talentoso e apaixonado por números para se juntar à nossa equipe. O candidato ideal será responsável por coletar, analisar e interpretar dados, transformando-os em informações valiosas para orientar a tomada de decisões estratégicas da empresa. Você trabalhará em estreita colaboração com outras equipes para identificar tendências, padrões e insights que impulsionarão nosso negócio.\",\n\t\"dtAbertura\": \"2023-10-15 15:00:00\",\n\t\"dtEncerramento\": \"2023-12-22 17:00:00\",\n\t\"usuario\":{\n\t\t\"id\": 1\n\t},\n\t\"habilidades\": [\n\t\t{\n\t\t\"id\": 1\n\t\t}\n\t]\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683500430408,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_491936f29b2442928f35fd13dabf765f","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1699740868512,"created":1683500421493,"name":"Vaga","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1683500421493,"_type":"request_group"},{"_id":"req_b7e95c98a9ed4d939704e0501d37eba5","parentId":"fld_491936f29b2442928f35fd13dabf765f","modified":1694467107268,"created":1683500426903,"url":"localhost:8080/talentScope/vagas/3","name":"DELETE","description":"","method":"DELETE","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683500426903,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_ef6b8fae461345baba0414a0b94e100d","parentId":"fld_491936f29b2442928f35fd13dabf765f","modified":1699740870143,"created":1683500425981,"url":"localhost:8080/talentScope/vagas","name":"CREATE","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n\t\"nome\": \"Analista de Dados\",\n\t\"descricaoCargo\": \"Analista de dados Senior\",\n\t\"descricaoVaga\": \"Estamos em busca de um Analista de Dados talentoso e apaixonado por números para se juntar à nossa equipe. O candidato ideal será responsável por coletar, analisar e interpretar dados, transformando-os em informações valiosas para orientar a tomada de decisões estratégicas da empresa. Você trabalhará em estreita colaboração com outras equipes para identificar tendências, padrões e insights que impulsionarão nosso negócio.\",\n\t\"dtAbertura\": \"2023-10-15 15:00:00\",\n\t\"dtEncerramento\": \"2023-12-22 17:00:00\",\n\t\"usuario\":{\n\t\t\"id\": 1\n\t},\n\t\"habilidades\": [\n\t\t{\n\t\t\"id\": 1\n\t\t}\n\t]\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683500425981,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_be5a4b355576415aa4459b9d9d9c9b3f","parentId":"fld_491936f29b2442928f35fd13dabf765f","modified":1694473733404,"created":1683500424735,"url":"localhost:8080/talentScope/vagas/1","name":"GET-BY-ID","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683500424735,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_f0117ee1cac74e66ade81fa5e13d938f","parentId":"fld_491936f29b2442928f35fd13dabf765f","modified":1694886201951,"created":1683500423575,"url":"localhost:8080/talentScope/vagas","name":"GET-ALL","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683500423575,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_f1d0d236ebfc4c9ca656a44a127fe0cc","parentId":"fld_e4d49467a47c4b759a0271aab6e959cf","modified":1695051174061,"created":1683499096895,"url":"localhost:8080/talentScope/nivelPermissao/1","name":"UPDATE","description":"","method":"PUT","body":{"mimeType":"application/json","text":"{\n\t\"nome\": \"Acesso-1\",\n\t\"descricao\": \"Tem permissão somente para leitura dos curriculos e vagas\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683499096895,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_e4d49467a47c4b759a0271aab6e959cf","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1683498878201,"created":1683498878201,"name":"Nivel Permissao","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1683498878201,"_type":"request_group"},{"_id":"req_703157431e2e4446bd8b93a13d125879","parentId":"fld_e4d49467a47c4b759a0271aab6e959cf","modified":1699707567756,"created":1683499022052,"url":"localhost:8080/talentScope/nivelPermissao","name":"CREATE","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n\t\"nome\": \"Administrador\",\n\t\"descricao\": \"Tem permissão full\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683499022052,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_3630a990e70e42eeb5215cdcff21aaee","parentId":"fld_e4d49467a47c4b759a0271aab6e959cf","modified":1683499012501,"created":1683498997106,"url":"localhost:8080/talentScope/nivelPermissao/1","name":"GET-BY-ID","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683498997106,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_3a1a185342a44099b86fd5f7ddd0b405","parentId":"fld_e4d49467a47c4b759a0271aab6e959cf","modified":1694889104251,"created":1683498961763,"url":"localhost:8080/talentScope/nivelPermissao/1","name":"DELETE","description":"","method":"DELETE","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683498961763,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_2fed552fb82a4cd19b169f87e54a2bb3","parentId":"fld_e4d49467a47c4b759a0271aab6e959cf","modified":1694911128142,"created":1683498880053,"url":"localhost:8080/talentScope/nivelPermissao","name":"GET-ALL","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683498880053,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_d6b820528584441d9c8ee44e6f475106","parentId":"fld_75aba5e4a7e24a7788edb863906dc43e","modified":1684625946957,"created":1683498089960,"url":"localhost:8080/talentScope/feedback/1","name":"New Request","description":"","method":"PUT","body":{"mimeType":"application/json","text":"{\n\t\"feedback\": \"Parabéns! Você foi aprovada para a próxima fase\",\n\t\"aprovado\": true,\n\t\"dtAnalise\": \"2023-05-03 10:08:02\",\n\t\"envioFeedback\": true,\n\t\"dtEnvioFeedback\": \"2023-05-20 16:00:00\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683498089960,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_75aba5e4a7e24a7788edb863906dc43e","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1683496882360,"created":1683496882360,"name":"Feedback","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1683496882360,"_type":"request_group"},{"_id":"req_49f1f0f811974a6786fc79eace9983b7","parentId":"fld_75aba5e4a7e24a7788edb863906dc43e","modified":1683498064236,"created":1683498041845,"url":"localhost:8080/talentScope/feedback/1","name":"DELETE","description":"","method":"DELETE","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683498041845,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_1517497d8707418b9b68ab8c634d81c1","parentId":"fld_75aba5e4a7e24a7788edb863906dc43e","modified":1683498039441,"created":1683498014430,"url":"localhost:8080/talentScope/feedback/1","name":"GET-BY-ID","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683498014430,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_3ebf2ac7b2e14919a486c9637f33b2d2","parentId":"fld_75aba5e4a7e24a7788edb863906dc43e","modified":1684625815185,"created":1683497799400,"url":"localhost:8080/talentScope/feedback","name":"CREATE","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n\t\"feedback\": \"Infelizmente você não foi selecionado para a proxima fase devido não ter a experiencia necessária que a vaga necessita. Não desista, você está no caminho certo.\",\n\t\"aprovado\": false,\n\t\"dtAnalise\": \"2023-05-15 10:08:02\",\n\t\"envioFeedback\": true,\n\t\"dtEnvioFeedback\": \"2023-05-03 12:00:00\"\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683497799400,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_82ca578e807d44859e237d1b2a858135","parentId":"fld_75aba5e4a7e24a7788edb863906dc43e","modified":1683496926295,"created":1683496898820,"url":"localhost:8080/talentScope/feedback","name":"GET-ALL","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683496898820,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_a10caac43c6d4cb985bf3ce0521145f2","parentId":"fld_89f2b281b16948618d8025113705813e","modified":1699711878905,"created":1693783365797,"url":"localhost:8080/talentScope/extract","name":"EXTRACT-CURRICULO","description":"","method":"GET","body":{},"parameters":[],"headers":[{"name":"User-Agent","value":"Insomnia/2023.5.7"}],"authentication":{},"metaSortKey":-1693783365797,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_89f2b281b16948618d8025113705813e","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1683408861644,"created":1683408861644,"name":"Curriculo","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1683408861644,"_type":"request_group"},{"_id":"req_01a6f4d409774f52b0a631dcc6bb2aac","parentId":"fld_89f2b281b16948618d8025113705813e","modified":1684625380007,"created":1683495768192,"url":"localhost:8080/talentScope/feedback/2/curriculo/2","name":"UPDATE","description":"","method":"PUT","body":{"mimeType":"application/json","text":"{\n\t\"arquivo\": \"rafael-cv.pdf\",\n\t\"dtEnvioCurriculo\": \"2023-05-05 12:03:04\",\n\t\"nomeCandidato\": \"Rafael Ferreira\",\n\t\"email\": \"rafaelFerreira@email.com\",\n\t\"vaga\": {\n\t\t\"id\": 1\n\t}\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683495768192,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_79183f4d4fca4369b077d99504282f54","parentId":"fld_89f2b281b16948618d8025113705813e","modified":1683495613000,"created":1683495569900,"url":"localhost:8080/talentScope/curriculos/1","name":"DELETE","description":"","method":"DELETE","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683495569900,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_b0438d0fca7e4e8bbc031b8bb075c406","parentId":"fld_89f2b281b16948618d8025113705813e","modified":1684621944202,"created":1683495417953,"url":"localhost:8080/talentScope/curriculos/1","name":"GET-BY-ID","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683495417953,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_c4142025a5e34d31a9916fdc5bf46cdf","parentId":"fld_89f2b281b16948618d8025113705813e","modified":1694371793600,"created":1683494163008,"url":"localhost:8080/talentScope/feedback/1/curriculo","name":"CREATE","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n\t\"arquivo\": \"IsaMaryKusukiYabiku.pdf\",\n\t\"dtEnvioCurriculo\": \"2023-05-05 12:03:04\",\n\t\"nomeCandidato\": \"Rafael Ferreira\",\n\t\"email\": \"rafaelFerreira@email.com\",\n\t\"vaga\": {\n\t\t\"id\": 1\n\t}\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683494163008,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_2b477bf3144843409ba67c361f07c2bc","parentId":"fld_89f2b281b16948618d8025113705813e","modified":1683408906435,"created":1683408868292,"url":"localhost:8080/talentScope/curriculos","name":"GET-ALL","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683408868292,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_341545f33b1b4dec9c948fd032d4744d","parentId":"fld_f8ec22abe45a4eba8d497cbaad6a819c","modified":1694538132889,"created":1683403550518,"url":"localhost:8080/talentScope/usuarios/1","name":"UPDATE","description":"","method":"PUT","body":{"mimeType":"application/json","text":"{\n  \"nome\": \"Rafael Ferreira dos Santos\",\n  \"email\": \"rafael.santos@plusofit.com\",\n  \"senha\": \"7894562\",\n\t\"status\": true,\n\t\"dtCriacao\": \"2023-05-15 10:08:02\",\n\t\"dtAlteracao\": \"\",\n\t\"nivelPermissao\": {\n\t\t\"id\": 1\n\t}\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1683403550518,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"fld_f8ec22abe45a4eba8d497cbaad6a819c","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1682907250670,"created":1682907250670,"name":"Usuario","description":"","environment":{},"environmentPropertyOrder":null,"metaSortKey":-1682907250670,"_type":"request_group"},{"_id":"req_f209071050794512ba5f6c23710720e1","parentId":"fld_f8ec22abe45a4eba8d497cbaad6a819c","modified":1694473352250,"created":1683403278581,"url":"localhost:8080/talentScope/usuarios/2","name":"DELETE","description":"","method":"DELETE","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683403278581,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_cf51032b4260480287e31b3ed5cd9b4a","parentId":"fld_f8ec22abe45a4eba8d497cbaad6a819c","modified":1694376992945,"created":1683402339768,"url":"localhost:8080/talentScope/usuarios/1","name":"GET-BY-ID","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1683402339768,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_72118a8b9fc343a88106cfb586b82331","parentId":"fld_f8ec22abe45a4eba8d497cbaad6a819c","modified":1699740858922,"created":1682911763463,"url":"localhost:8080/talentScope/usuarios","name":"CREATE","description":"","method":"POST","body":{"mimeType":"application/json","text":"{\n  \"nome\": \"Rafael Ferreira\",\n  \"email\": \"rafael@plusofit.com\",\n  \"senha\": \"7894562\",\n\t\"status\": true,\n\t\"dtCriacao\": \"2023-05-15 10:08:02\",\n\t\"dtAlteracao\": \"\",\n\t\"nivelPermissao\": {\n\t\t\"id\": 1\n\t}\n}"},"parameters":[],"headers":[{"name":"Content-Type","value":"application/json"}],"authentication":{},"metaSortKey":-1682911763463,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"req_a40d3de278ab42b5877e887328da9404","parentId":"fld_f8ec22abe45a4eba8d497cbaad6a819c","modified":1682908258671,"created":1682907243015,"url":"localhost:8080/talentScope/usuarios","name":"GET-ALL","description":"","method":"GET","body":{},"parameters":[],"headers":[],"authentication":{},"metaSortKey":-1682907246842.5,"isPrivate":false,"settingStoreCookies":true,"settingSendCookies":true,"settingDisableRenderRequestBody":false,"settingEncodeUrl":true,"settingRebuildPath":true,"settingFollowRedirects":"global","_type":"request"},{"_id":"env_da8475de3cd6463cb962bdca5c2714fda1b80dc0","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1682907232953,"created":1682907232953,"name":"Base Environment","data":{},"dataPropertyOrder":null,"color":null,"isPrivate":false,"metaSortKey":1682907232953,"_type":"environment"},{"_id":"jar_da8475de3cd6463cb962bdca5c2714fda1b80dc0","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1683152217116,"created":1682907232955,"name":"Default Jar","cookies":[{"key":"JSESSIONID","value":"71409BC38A577DE4F9B7F42E5D688FBA","domain":"localhost","path":"/","httpOnly":true,"hostOnly":true,"creation":"2023-05-01T02:30:51.202Z","lastAccessed":"2023-05-03T22:16:57.103Z","id":"06489005035756712"}],"_type":"cookie_jar"},{"_id":"spc_535954fb5cd44bcdb1a95af3f07a94f1","parentId":"wrk_a8c236253c774b3594881ef373ec5888","modified":1682907232950,"created":1682907232950,"fileName":"TaletScope","contents":"","contentType":"yaml","_type":"api_spec"}]}loading Insomnia-arquivo.json…]()


6. Verifique as gravações no Banco de Dado Oracle
    

</details>
