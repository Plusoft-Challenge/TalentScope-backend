# TalentTracker

## Uma api para automatização de leitura de currículo

- > <h2>Usuario</h2>
  - [Cadastrar](#cadastrar-um-usuario)
  - [Listar todos](#listar-todos-usuarios)
  - [Mostrar detalhes](#mostrar-detalhes-de-um-usuario)
  - [Atualizar](#atualização-usuario)
  - [Apagar](#apagar-usuario)

<br/>

<details>
<summary>Usuario</summary>

<br>

<details>
<summary> <b style="color:green">POST</b> /talentTracker/api/usuario</summary>

<br/>

# Cadastrar um usuario

<br/>

### Requisição:

```json
{
    
}
```

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
   
}
```

<br/>
<hr>

`status code: 400`

#### Tipo do body: <b>Application/json</b>

```json
{
  "retorno": "{Mensagem de erro...}"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b> /talentTracker/api/usuario</summary>

<br/>

# Listar todos usuarios

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json


```

<br/>
<hr>

`status code: 204`

#### Tipo do body: <b>Application/json</b>

```json
{
  "retorno": "Não há usuarios para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Tipo do body: <b>Application/json</b>

```json
{
  "retorno": "{Mensagem de erro...}"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b> /talentTracker/api/usuario/${ID}</summary>

# Mostrar detalhes de um usuario

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{

}
```

<br/>
<hr>

`status code: 204`

#### Tipo do body: <b>Application/json</b>

```json
{
  "retorno": "usuario inexistente"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "{Mensagem de erro...}"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b> /talentTracker/api/usuario</summary>

<br/>

# Atualização usuario

### Requisição:


```json
{

}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{

}
```
<br/>
<hr>

`status code: 400`

#### Tipo do body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro...}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b> /talentTracker/api/usuario/${id}</summary>

<br/>

# Apagar usuario

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
  "retorno": "Usuario apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Tipo do body: <b>Application/json</b>

```json
{
  "retorno": "{Mensagem de erro...}"
}
```

</details>

<br/><br/>

# Tabela banco de dados

|  campo  |      tipo       | obrigatório | descrição                                                     |
| :-----: | :-------------: | :---------: | ------------------------------------------------------------- |
|id               |int       |     sim     | Id da conta com auto-incremento|
|nome             |varchar() |     sim     | Nome do usuario|
|email            |varchar() |     sim     | Email do usuario|
|senha            |varchar   |     sim     | Senha do usuario. Senha deve conter de 8 a 15 caracteres, no min. 1 letra maiuscula e 1 caractere especial|
|nivelPermissao   |varchar() |     sim     | Nivel de permissão para utilizar a plataforma |
|ativo            |boolean   |     sim     | Flag para informar se o usuario esta ativo na plataforma passando |
|data_criacao     |Date      |     sim     | Data da criação do usuario |
|data_atualizacao |Date      |     nao     | Data da criação do usuario |
