# TalentTracker

## Uma api para automatização de leitura de currículo

- > <h2>Usuario</h2>
  - [Cadastrar](#cadastrar-um-usuario)
  - [Listar todos](#listar-todos-usuarios)
  - [Mostrar detalhes](#mostrar-detalhes-de-um-usuario)
  - [Atualizar](#atualização-usuario)
  - [Apagar](#apagar-usuario)

<br/>

- > <h2>Vaga</h2>
  - [Cadastrar](#cadastrar-uma-vaga)
  - [Listar todas](#listar-todas-vagas)
  - [Mostrar detalhes](#mostrar-detalhes-de-uma-vaga)
  - [Atualizar](#atualização-vaga)
  - [Apagar](#apagar-vaga)

<br/>

- > <h2>Curriculo</h2>
  - [Cadastrar](#cadastrar-um-curriculo)
  - [Listar todos](#listar-todos-curriculos)
  - [Mostrar detalhes](#mostrar-detalhes-de-um-curriculo)
  - [Atualizar](#atualização-curriculo)
  - [Apagar](#apagar-curriculo)

<br/>

<details>
<summary>Usuario</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /api/talentTracker/usuario</summary>

<br/>

# Cadastrar um usuario

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
    "data_atualizacao": ;
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
  "data_atualizacao": ;
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

# Listar todos usuarios

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
    "data_atualizacao": ;
  },
  {
    "id": 2,
    "nome": "Nicolas Almeida",
    "email": "nicolas@gmail.com",
    "senha": "nialmeida*10",
    "nivelPermissao": "administrador",
    "ativo": true,
    "data_criacao": "10/04/2023 - 15:25:20",
    "data_atualizacao": ;
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

# Mostrar detalhes de um usuario

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
  "data_atualizacao": ;
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

# Atualização usuario

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
  "data_atualizacao": "05/04/2023 - 14:45:10";
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
  "nivelPermissao": "administrador",
  "ativo": true,
  "data_criacao": "02/03/2023 - 09:04:35",
  "data_atualizacao": "05/04/2023 - 14:45:10";
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro...}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b> /api/talentTracker/usuario/{id}</summary>

<br/>

# Apagar usuario

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
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<br/><br/>

# Tabela banco de dados

|      campo       |   tipo    | obrigatório | descrição                                                                                                  |
| :--------------: | :-------: | :---------: | ---------------------------------------------------------------------------------------------------------- |
|        id        |    int    |     sim     | Id da conta com auto-incremento                                                                            |
|       nome       | varchar() |     sim     | Nome do usuario                                                                                            |
|      email       | varchar() |     sim     | Email do usuario                                                                                           |
|      senha       |  varchar  |     sim     | Senha do usuario. Senha deve conter de 8 a 15 caracteres, no min. 1 letra maiuscula e 1 caractere especial |
|  nivelPermissao  | varchar() |     sim     | Nivel de permissão para utilizar a plataforma                                                              |
|      ativo       |  boolean  |     sim     | Flag para informar se o usuario esta ativo na plataforma                                                   |
|   data_criacao   |   Date    |     sim     | Data da criação do usuario                                                                                 |
| data_atualizacao |   Date    |     nao     | Data da atualização do usuario                                                                             |

</details>

<details>
<summary>Vaga</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /api/talentTracker/vaga</summary>

<br/>

# Cadastrar uma vaga

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
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao": ;
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
      "habilidade": "ActiveMQ"
      "descricao": "Saber manipular objetos com mensageria"
    }
  ],
  "salario": 8000.00,
  "data_abertura": "08/04/2023 - 13:00:00",
  "data_encerramento": "08/07/2023 - 17:00:00",
  "usuario": [
    {
      "id": 1,
      "nome": "Luiza Sachi",
      "email": "luiza@gmail.com",
      "senha": "Ol@mundo123",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "02/03/2023 - 09:04:35",
      "data_atualizacao": ;
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

# Listar todas as vagas

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
    "usuario": [
      {
        "id": 1,
        "nome": "Luiza Sachi",
        "email": "luiza@gmail.com",
        "senha": "Ol@mundo123",
        "nivelPermissao": "administrador",
        "ativo": true,
        "data_criacao": "02/03/2023 - 09:04:35",
        "data_atualizacao": ;
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
    "data_encerramento": "15/07/2023 - 17:00:00";
    {
      "id": 2,
      "nome": "Nicolas Almeida",
      "email": "nicolas@gmail.com",
      "senha": "nialmeida*10",
      "nivelPermissao": "administrador",
      "ativo": true,
      "data_criacao": "10/04/2023 - 15:25:20",
      "data_atualizacao": ;
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/usuario/{id}</summary>
<br/>

# mostrar detalhes de uma vaga

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
    "usuario": [
      {
        "id": 1,
        "nome": "Luiza Sachi",
        "email": "luiza@gmail.com",
        "senha": "Ol@mundo123",
        "nivelPermissao": "administrador",
        "ativo": true,
        "data_criacao": "02/03/2023 - 09:04:35",
        "data_atualizacao": ;
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

# Atualização vaga

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
    "usuario": [
      {
        "id": 1,
        "nome": "Luiza Sachi",
        "email": "luiza@gmail.com",
        "senha": "Ol@mundo123",
        "nivelPermissao": "administrador",
        "ativo": true,
        "data_criacao": "02/03/2023 - 09:04:35",
        "data_atualizacao": ;
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
    "usuario": [
      {
        "id": 1,
        "nome": "Luiza Sachi",
        "email": "luiza@gmail.com",
        "senha": "Ol@mundo123",
        "nivelPermissao": "administrador",
        "ativo": true,
        "data_criacao": "02/03/2023 - 09:04:35",
        "data_atualizacao": ;
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

# Apagar vaga

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
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<br/><br/>

# Tabela banco de dados

|      campo       |   tipo    | obrigatório | descrição |
| :--------------: | :-------: | :---------: | ----------- |
|        id        |    int    |     sim     | Id da vaga com auto-incremento |
|       nome       | varchar() |     sim     | Nome da vaga |
|      cargo       | varchar() |     sim     | Nomde do cargo |
|      descricao       |  varchar  |     sim     | descrição do cargo |
|  requisitos  | varchar() |     sim     | Lista de requisitos obrigatórios para a vaga |
|      salario       |  double  |     sim     | Valor do salário |
|   data_abertura   |   Date    |     sim     | Data da abertura da vaga |
| data_encerramento |   Date    |     sim     | Data do encerramento da vaga |

</details>

<details>
<summary>Curriculo</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /api/talentTracker/curriculo</summary>

<br/>

# Cadastrar um curriculo

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
    }
  "feedback":
    {
      "id": 1,
      "descricao": "Parabéns! Você foi aprovado",
      "resultado": true,
      "data_analise": "08/04/2023 - 09:10:35",
      "envio": false,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback": ""
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
      "data_envio_feedback": ""
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/usuario</summary>

<br/>

# Listar todos os curriculos

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
    }
  "feedback":
    {
      "id": 1,
      "descricao": "Parabéns! Você foi aprovado",
      "resultado": true,
      "data_analise": "08/04/2023 - 09:10:35",
      "envio": false,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback": ""
    }
  }
  {
   "id": 2,
  "arquivo": "noah.pdf",
  "data_envio": "20/05/2023 - 14:00:45",
  "nome_candidato": "Noah Abreu",
  "email_candidato": "noah@gmail.com",
  "vaga":
    {
      "nome": "Analista de Dados"
    }
  "feedback":
    {
      "id": 1,
      "descricao": "Parabéns! Você foi aprovado",
      "resultado": true,
      "data_analise": "08/04/2023 - 09:10:35",
      "envio": false,
      "data_programada": "15/04/2023 - 18:00:00",
      "data_envio_feedback": ""
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
<summary> <b style="color:cyan">GET</b> /api/talentTracker/usuario/{id}</summary>

# Mostrar detalhes de um usuario

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
  "data_atualizacao": ;
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

# Atualização usuario

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
  "data_atualizacao": "05/04/2023 - 14:45:10";
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
  "nivelPermissao": "administrador",
  "ativo": true,
  "data_criacao": "02/03/2023 - 09:04:35",
  "data_atualizacao": "05/04/2023 - 14:45:10";
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro...}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b> /api/talentTracker/usuario/{id}</summary>

<br/>

# Apagar usuario

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
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<br/><br/>

# Tabela banco de dados

|      campo       |   tipo    | obrigatório | descrição                                                                                                  |
| :--------------: | :-------: | :---------: | ---------------------------------------------------------------------------------------------------------- |
|        id        |    int    |     sim     | Id da conta com auto-incremento                                                                            |
|       nome       | varchar() |     sim     | Nome do usuario                                                                                            |
|      email       | varchar() |     sim     | Email do usuario                                                                                           |
|      senha       |  varchar  |     sim     | Senha do usuario. Senha deve conter de 8 a 15 caracteres, no min. 1 letra maiuscula e 1 caractere especial |
|  nivelPermissao  | varchar() |     sim     | Nivel de permissão para utilizar a plataforma                                                              |
|      ativo       |  boolean  |     sim     | Flag para informar se o usuario esta ativo na plataforma                                                   |
|   data_criacao   |   Date    |     sim     | Data da criação do usuario                                                                                 |
| data_atualizacao |   Date    |     nao     | Data da atualização do usuario                                                                             |

</details>