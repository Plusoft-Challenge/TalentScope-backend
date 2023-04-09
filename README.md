# TalentTracker

## Uma api para automatização de leitura de currículo

- > <h2>Usuario</h2>
  - [Cadastrar](#cadastrar-usuario)
  - [Listar todos](#listar-usuarios)
  - [Mostrar detalhes](#detalhar-um-usuario)
  - [Atualizar](#atualizar-usuario)
  - [Apagar](#apagar-usuario)

<br/>

- > <h2>Vaga</h2>
  - [Cadastrar](#cadastrar-vaga)
  - [Listar todas](#listar-vagas)
  - [Mostrar detalhes](#detalhar-um-vaga)
  - [Atualizar](#atualizar-vaga)
  - [Apagar](#apagar-vaga)

<br/>

- > <h2>Curriculo</h2>
  - [Cadastrar](#cadastrar-curriculo)
  - [Listar todos](#listar-curriculos)
  - [Mostrar detalhes](#detalhar-um-curriculo)
  - [Atualizar](#atualizar-curriculo)
  - [Apagar](#apagar-curriculo)

<br/>

<details>
<summary>Usuario</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /api/talentTracker/usuario</summary>

<br/>

### Cadastrar usuario

<br/>

### Requisição:

```json
{
  "nome": "Luiza Sachi",
  "email": "luiza@gmail.com",
  "senha": "Ol@mundo123",
  "nivelPermissao": "administrador",
  "ativo": true,
  "data_criacao": "08/04/2023 - 09:04:35",
  "data_atualizacao":
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id": 1,
  "nome": "Luiza Sachi",
  "email": "luiza@gmail.com",
  "senha": "Ol@mundo123",
  "nivelPermissao": "administrador",
  "ativo": true,
  "data_criacao": "08/04/2023 - 09:04:35",
  "data_atualizacao":
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/usuario</summary>

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
    "nome": "Luiza Sachi",
    "email": "luiza@gmail.com",
    "senha": "Ol@mundo123",
    "nivelPermissao": "administrador",
    "ativo": true,
    "data_criacao": "02/03/2023 - 09:04:35",
    "data_atualizacao":
  },
  {
    "id": 2,
    "nome": "Nicolas Almeida",
    "email": "nicolas@gmail.com",
    "senha": "nialmeida*10",
    "nivelPermissao": "administrador",
    "ativo": true,
    "data_criacao": "10/04/2023 - 15:25:20",
    "data_atualizacao":
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/usuario/{id}</summary>

<br/>

### Detalhar um usuario

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id": 1,
  "nome": "Luiza Sachi",
  "email": "luiza@gmail.com",
  "senha": "Ol@mundo123",
  "nivelPermissao": "administrador",
  "ativo": true,
  "data_criacao": "02/03/2023 - 09:04:35",
  "data_atualizacao":
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
<summary> <b style="color:orange">UPDATE</b> /api/talentTracker/usuario/{id}</summary>

<br/>

### Atualizar usuario

### Requisição:


```json
{
  "id": 1,
  "nome": "Luiza Sachi",
  "email": "luiza.sachi@gmail.com",
  "senha": "Ol@mundo123",
  "nivelPermissao": "administrador",
  "ativo": true,
  "data_criacao": "02/03/2023 - 09:04:35",
  "data_atualizacao": "05/04/2023 - 14:45:10"
},
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
  "id": 1,
  "nome": "Luiza Sachi",
  "email": "luiza.sachi@gmail.com",
  "senha": "Ol@mundo123",
  "nivel_permissao": "administrador",
  "ativo": true,
  "data_criacao": "02/03/2023 - 09:04:35",
  "data_atualizacao": "05/04/2023 - 14:45:10"
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
<summary> <b style="color:red">DELETE</b> /api/talentTracker/usuario/{id}</summary>

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
|        id         | numeric(10) |     sim     | Id da conta                                                                                                |
|       nome        | varchar(80) |     sim     | Nome do usuario                                                                                            |
|       email       | varchar(80) |     sim     | Email do usuario                                                                                           |
|       senha       | varchar(15) |     sim     | Senha do usuario. Senha deve conter de 8 a 15 caracteres, no min. 1 letra maiuscula e 1 caractere especial |
|  nivel_permissao  | varchar(20) |     sim     | Nivel de permissão para utilizar a plataforma                                                              |
|       ativo       | Boolean(1)  |     sim     | Flag para informar se o usuario esta ativo na plataforma                                                   |
|   data_criacao    |  Datetime   |     sim     | Data da criação do usuario                                                                                 |
| data_atualizacao  |  Datetime   |     nao     | Data da atualização do usuario                                                                             |

</details>

<details>
<summary>Vaga</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /api/talentTracker/vaga</summary>

<br/>

### Cadastrar vaga

<br/>

### Requisição:

```json
{
  "nome": "Desenvolvedor Java",
  "cargo": "Analista Pleno",
  "descricao": "Conhecimentos Sólidos em Java e microserviços",
  "habilidades": [
    {
      "id": 1,
      "habilidade": "Java",
      "descricao": "Saber programar em Java"
    }
    {
      "id":2,
      "habilidade": "ActiveMQ",
      "descricao": "Saber manipular objetos com mensageria"
    }
  ],
  "salario": 8000.00,
  "data_abertura": "08/04/2023 - 13:00:00",
  "data_encerramento": "08/07/2023 - 17:00:00",
  "data_envio_feedback": "15/04/2023 - 17:00:00",
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao":
    }
  ],
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "nome": "Desenvolvedor Java",
  "cargo": "Analista Pleno",
  "descricao": "Conhecimentos Sólidos em Java e microserviços",
  "habilidades": [
    {
      "id": 1,
      "habilidade": "Java",
      "descricao": "Saber programar em Java"
    }
    {
      "id":2,
      "habilidade": "ActiveMQ",
      "descricao": "Saber manipular objetos com mensageria"
    }
  ],
  "salario": 8000.00,
  "data_abertura": "08/04/2023 - 13:00:00",
  "data_encerramento": "08/07/2023 - 17:00:00",
  "data_envio_feedback": "15/04/2023 - 17:00:00",
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao":
    }
  ],
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/vaga</summary>

<br/>

### Listar vagas

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
  {
    "id:": 1,
    "nome": "Desenvolvedor Java",
    "cargo": "Analista Pleno",
    "descricao": "Conhecimentos Sólidos em Java e microserviços",
    "habilidades": [
      {
        "id": 1,
        "habilidade": "Java",
        "descricao": "Saber programar em Java"
      }
      {
        "id":2,
        "habilidade": "ActiveMQ"
        "descricao": "Saber manipular objetos com mensageria"
      }
    ],
    "salario": 8000.00,
    "data_abertura": "08/04/2023 - 13:00:00",
    "data_encerramento": "08/07/2023 - 17:00:00",
    "data_envio_feedback": "15/04/2023 - 17:00:00",
    "usuario": [
      {
        "id": 1,
        "nome": "Luiza Sachi",
        "email": "luiza@gmail.com",
        "senha": "Ol@mundo123",
        "nivelPermissao": "administrador",
        "ativo": true,
        "data_criacao": "02/03/2023 - 09:04:35",
        "data_atualizacao":
      }
    ],
  }
  {
    "id": 2,
    "nome": "Analista de Dados",
    "cargo": "Analista de Dados Junior",
    "descricao": "Tomada de ações mais rápida e eficaz com serviços personalizados em analytics",
    "habilidades": [
      {
        "id": 1,
        "habilidade": "Python",
        "descricao": "Saber programar em Python"
      }
      {
        "id":2,
        "habilidade": "SQL"
        "descricao": "Saber manipular objetos com SQL"
      }
    ],
    "salario": 4000.00,
    "data_abertura": "15/04/2023 - 11:00:00",
    "data_encerramento": "15/07/2023 - 17:00:00",
    "data_envio_feedback": "15/04/2023 - 17:00:00",
    {
      "id": 2,
      "nome": "Nicolas Almeida",
      "email": "nicolas@gmail.com",
      "senha": "nialmeida*10",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "10/04/2023 - 15:25:20",
      "data_atualizacao":
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/vaga/{id}</summary>
<br/>

### Detalhar uma vaga

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
  "id:": 1,
  "nome": "Desenvolvedor Java",
  "cargo": "Analista Pleno",
  "descricao": "Conhecimentos Sólidos em Java e microserviços",
  "habilidades": [
    {
      "id": 1,
      "habilidade": "Java",
      "descricao": "Saber programar em Java"
    }
    {
      "id":2,
      "habilidade": "ActiveMQ"
      "descricao": "Saber manipular objetos com mensageria"
    }
  ],
  "salario": 8000.00,
  "data_abertura": "08/04/2023 - 13:00:00",
  "data_encerramento": "08/07/2023 - 17:00:00",
  "data_envio_feedback": "15/04/2023 - 17:00:00",
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao":
    }
  ],
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
<summary> <b style="color:orange">UPDATE</b> /api/talentTracker/vaga/{id}</summary>

<br/>

### Atualizar vaga

### Requisição:


```json
{
  "id:": 1,
  "nome": "Desenvolvedor Java",
  "cargo": "Analista Pleno",
  "descricao": "Conhecimentos Sólidos em Java e microserviços",
  "habilidades": [
    {
      "id": 1,
      "habilidade": "Java",
      "descricao": "Saber programar em Java"
    }
    {
      "id": 2,
      "habilidade": "ActiveMQ"
      "descricao": "Saber manipular objetos com mensageria"
    }
    {
      "id": 3,
      "habilidade": "SQL"
      "descricao": "Saber manipular objetos com SQL"
    }
  ],
  "salario": 8000.00,
  "data_abertura": "08/04/2023 - 13:00:00",
  "data_encerramento": "08/07/2023 - 17:00:00",
  "data_envio_feedback": "15/04/2023 - 17:00:00",
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao":
    }
  ],
 }
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id:": 1,
  "nome": "Desenvolvedor Java",
  "cargo": "Analista Pleno",
  "descricao": "Conhecimentos Sólidos em Java e microserviços",
  "habilidades": [
    {
      "id": 1,
      "habilidade": "Java",
      "descricao": "Saber programar em Java"
    }
    {
      "id": 2,
      "habilidade": "ActiveMQ",
      "descricao": "Saber manipular objetos com mensageria"
    }
    {
      "id": 3,
      "habilidade": "SQL"
      "descricao": "Saber manipular objetos com SQL"
    }
  ],
  "salario": 8000.00,
  "data_abertura": "08/04/2023 - 13:00:00",
  "data_encerramento": "08/07/2023 - 17:00:00",
  "data_envio_feedback": "15/04/2023 - 17:00:00",
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao":
    }
  ],
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
<summary> <b style="color:red">DELETE</b> /api/talentTracker/vaga/{id}</summary>

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
|         cargo       |    varchar    |     sim     | Nomde do cargo                           |
|       descricao     |    varchar    |     sim     | descrição do cargo                       |
|      habilidades    | fk_habilidade |     sim     | Uma vaga pode ter várias habilidades     |
|        salario      |  double(6,2)  |     sim     | Valor do salário                         |
|     data_abertura   |   Datetime    |     sim     | Data da abertura da vaga                 |
|  data_encerramento  |   Datetime    |     sim     | Data do encerramento da vaga             |
| data_envio_feedback |   Datetime    |     sim     | Data programada para o envio do feedback |
|       usuarios      |  fk_usuario   |     sim     | Um usuario pode ter varias vagas         |

</details>

<details>
<summary>Curriculo</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /api/talentTracker/curriculo</summary>

<br/>

### Cadastrar curriculo

<br/>

### Requisição:

```json
{
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
      "envio": false,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback":
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
  "arquivo": "Igor.pdf",
  "data_envio": "08/04/2023 - 09:04:35",
  "nome_candidato": "Igor Oliveira",
  "email_candidato": "igor@gmail.com",
  "vaga":
    {
      "nome": "Desenvolvedor Java"
    }
  "feedback":
    {
      "id": 1,
      "descricao": "Parabéns! Você foi aprovado",
      "resultado": true,
      "data_analise": "08/04/2023 - 09:10:35",
      "envio": false,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback":
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/curriculo</summary>

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
        "envio": false,
        "data_programada": "15/04/2023 - 18:00:00",
        "data_envio_feedback":
      }
  },
  {
    "id": 2,
    "arquivo": "noah.pdf",
    "data_envio": "20/05/2023 - 14:00:45",
    "nome_candidato": "Noah Abreu",
    "email_candidato": "noah@gmail.com",
    "vaga":
      {
        "nome": "Analista de Dados"
      },
    "feedback":
      {
        "id": 2,
        "descricao": "Sinto muito! Infelizmente você não foi aprovado.",
        "resultado": false,
        "data_analise": "08/04/2023 - 09:10:35",
        "envio": true,
        "data_programada": "15/04/2023 - 18:00:00",
        "data_envio_feedback": "15/04/2023 - 18:00:00"
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/curriculo/{id}</summary>

### Detalhes um curriculo

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

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
      "envio": false,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback":
    }
},
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
<summary> <b style="color:orange">UPDATE</b> /api/talentTracker/curriculo/{id}</summary>

<br/>

### Atualizar curriculo

### Requisição:


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
<summary> <b style="color:red">DELETE</b> /api/talentTracker/curriculo/{id}</summary>

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
|    data_envio     |    Date     |     sim     | Data do envio do currículo                |
|  nome_candidato   | varchar(50) |     sim     | Nome do candidato                         |
|  email_candidato  | varchar(80) |     sim     | Email do candidato                        |
|       vaga        |   varchar   |     sim     | Nome da vaga                              |
|     feedback      | fk_feedback |     sim     | Verifica se o feedback foi enviado ou não |


</details>