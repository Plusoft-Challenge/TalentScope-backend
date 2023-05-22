# TalentScope

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

<br/>

- > <h2>Feedback</h2>
  - [Cadastrar](#cadastrar-feedback)
  - [Listar todos](#listar-feedback)
  - [Mostrar detalhes](#detalhar-um-feedback)
  - [Atualizar](#atualizar-feedback)
  - [Apagar](#apagar-feedback)

<br/>


<details>
<summary>Usuario</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/talentScope/usuario</summary>

<br/>

### Cadastrar usuario

<br/>

### Requisição:

```json
{
  "nome": "Isabelle Souza Santos",
  "email": "isabelle.souza@plusofit.com",
  "senha": "123456",
	"status": true,
	"dtCriacao": "2023-05-03 10:08:02",
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
	"nome": "Isabelle Souza Santos",
	"email": "isabelle.souza@plusofit.com",
	"senha": "123456",
	"status": true,
	"dtCriacao": "2023-05-03 10:08:02",
	"dtAlteracao": null,
	"nivelPermissao": {
		"id": 1,
		"nome": "Administrador",
		"descricao": "Tem permissão total"
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
<summary> <b style="color:cyan">GET</b>/talentScope/usuario</summary>

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
		"nome": "Isabelle Souza Santos",
		"email": "isabelle.souza@plusofit.com",
		"senha": "123456",
		"status": true,
		"dtCriacao": "2023-05-03 10:08:02",
		"dtAlteracao": null,
		"nivelPermissao": {
			"id": 1,
			"nome": "Administrador",
			"descricao": "Tem permissão total"
		}
	},
	{
		"id": 2,
		"nome": "Rafael Souza",
		"email": "rafael@plusofit.com",
		"senha": "789456",
		"status": true,
		"dtCriacao": "2023-05-03 10:08:02",
		"dtAlteracao": null,
		"nivelPermissao": {
			"id": 2,
			"nome": "Consultor",
			"descricao": "Tem permissão somente a consultas"
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
<summary> <b style="color:cyan">GET</b>/talentScope/usuario/{id}</summary>

<br/>

### Detalhar um usuario

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
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
		"descricao": "Tem permissão total"
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
<summary> <b style="color:orange">UPDATE</b>/talentScope/usuario/{id}</summary>

<br/>

### Atualizar usuario

### Requisição:


```json
{
  "nome": "Isabelle Souza Santos",
  "email": "isabelle.ss@plusofit.com",
  "senha": "123456",
	"status": true,
	"dtCriacao": "2023-05-03 10:08:02",
	"dtAlteracao": "2023-05-10 10:08:02",
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
	"id": 2,
	"nome": "Isabelle Souza Santos",
	"email": "isabelle.ss@plusofit.com",
	"senha": "123456",
	"status": true,
	"dtCriacao": "2023-05-03 10:08:02",
	"dtAlteracao": "2023-05-10 10:08:02",
	"nivelPermissao": {
		"id": 2,
		"nome": "Consultor",
		"descricao": "Tem permissão somente a consultas"
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
<summary> <b style="color:red">DELETE</b>/talentScope/usuario/{id}</summary>

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
		"nome": "Administrador",
		"descricao": "Tem permissão total"
	},
	{
		"id": 2,
		"nome": "Consultor",
		"descricao": "Tem permissão somente a consultas"
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
  "nome": "Administrador",
  "descricao": "Usuário com permissão master"
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
	"nome": "Administrador",
	"descricao": "Permissão total."
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
	"nome": "Administrador",
	"descricao": "Permissão total."
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
<summary> <b style="color:green">POST</b>/talentScope/habilidade</summary>

<br/>

### Cadastrar habilidade

<br/>

### Requisição:

```json
{
	"nome": "Experiencia de 2 anos"
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Experiencia de 2 anos"
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
<summary> <b style="color:cyan">GET</b>/talentScope/habilidade</summary>

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
		"nome": "Experiencia de 2 anos"
	},
	{
		"id": 2,
		"nome": "2 anos de experiência em Java com spring"
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
<summary> <b style="color:cyan">GET</b>/talentScope/habilidade/{id}</summary>

<br/>

### Detalhar uma habilidade
<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 2,
	"nome": "2 anos de experiência em Java com spring"
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Habilidade não cadastrada"
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
<summary> <b style="color:orange">UPDATE</b>/talentScope/habilidade/{id}</summary>

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
<summary> <b style="color:green">POST</b>/talentScope/vaga</summary>

<br/>

### Cadastrar vaga

<br/>

### Requisição:

```json
{
	"nome": "Desenvolvedor Java",
	"descricaoCargo": "Programação orientada a objetos, uso de frameworks Spring, experiência em testes, trabalho em equipe, aplicações web e bancos de dados.",
	"salario": 6000.00,
	"dtAbertura": "2023-05-03 12:00:00",
	"dtEncerramento": "2023-07-03 12:00:00",
	"dtProgEnvioFeedback": "2023-05-20 16:00:00",
	"usuario":{
		"id": 1
	},
	"habilidades": [
		{
		"id": 1
		},
		{
		"id": 2
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
	"nome": "Desenvolvedor Java",
	"descricaoCargo": "Programação orientada a objetos, uso de frameworks Spring, experiência em testes, trabalho em equipe, aplicações web e bancos de dados.",
	"salario": 6000.00,
	"dtAbertura": "2023-05-03 12:00:00",
	"dtEncerramento": "2023-07-03 12:00:00",
	"dtProgEnvioFeedback": "2023-05-20 16:00:00",
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
		},
		{
			"id": 2,
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
<summary> <b style="color:cyan">GET</b>/talentScope/vaga</summary>

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
	{
		"id": 2,
		"nome": "Analista de Sistemas I",
		"descricaoCargo": "Desenvolver sistemas em Java",
		"salario": 5000.00,
		"dtAbertura": "2023-05-15 14:00:00",
		"dtEncerramento": "2023-07-22 17:00:00",
		"dtProgEnvioFeedback": "2023-05-23 16:00:00",
		"usuario": {
			"id": 2,
			"nome": "Isabelle Souza Santos",
			"email": "isabelle.ss@plusofit.com",
			"senha": "123456",
			"status": true,
			"dtCriacao": "2023-05-03 10:08:02",
			"dtAlteracao": "2023-05-10 10:08:02",
			"nivelPermissao": {
				"id": 2,
				"nome": "Consultor",
				"descricao": "Tem permissão somente a consultas"
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
<summary> <b style="color:cyan">GET</b>/talentScope/vaga/{id}</summary>
<br/>

### Detalhar uma vaga

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
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
<summary> <b style="color:orange">UPDATE</b>/talentScope/vaga/{id}</summary>

<br/>

### Atualizar vaga

### Requisição:


```json
{
	"nome": "Analista de Sistemas I",
	"descricaoCargo": "Desenvolver sistema de negociação de investimentos",
	"salario": 5000.00,
	"dtAbertura": "2023-05-15 14:00:00",
	"dtEncerramento": "2023-07-22 17:00:00",
	"dtProgEnvioFeedback": "2023-05-23 16:00:00",
	"usuario":{
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
	"nome": "Analista de Sistemas I",
	"descricaoCargo": "Desenvolver sistema de negociação de investimentos",
	"salario": 5000.00,
	"dtAbertura": "2023-05-15 14:00:00",
	"dtEncerramento": "2023-07-22 17:00:00",
	"dtProgEnvioFeedback": "2023-05-23 16:00:00",
	"usuario": {
		"id": 2,
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
|        salario      |  double(6,2)  |     sim     | Valor do salário                         |
|     dtAbertura   |   Datetime    |     sim     | Data da abertura da vaga                 |
|  dtEncerramento  |   Datetime    |     sim     | Data do encerramento da vaga             |
| dtProgEnvioFeedback |   Datetime    |     sim     | Data programada para o envio do feedback |
|       usuarios      |  fk_usuario   |     sim     | Um usuario pode ter varias vagas         |
|      habilidades    | fk_habilidade |     sim     | Uma vaga pode ter várias habilidades     |

</details>

<details>
<summary>Curriculo</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /talentScope/feedback/{feedbackId}/curriculo</summary>

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
<summary> <b style="color:cyan">GET</b>/talentScope/curriculo</summary>

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
<summary> <b style="color:cyan">GET</b>/talentScope/curriculo/{id}</summary>

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
<summary> <b style="color:orange">UPDATE</b> /talentScope/feedback/{feedbackId}/curriculo/{id}</summary>

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