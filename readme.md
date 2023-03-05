## API de CRUD de Pessoa
Esta é uma API de CRUD, desenvolvida com o uso de tecnologias como:

<code>Spring Boot 3.0.4</code>,<br> 
<code>Spring Boot Data JPA</code>, <br>
<code>Spring Boot Validation</code>,<br>
<code>PostgreSQL</code>, <br>
<code>Lombok</code>,<br>
<code>Flyway Core 9.15.1</code>.

## Funcionalidades

* Cadastro de uma nova pessoa
* Atualização dos dados de uma pessoa já cadastrada
* Exclusão de uma pessoa
* Listagem de todas as pessoas cadastradas
* Consulta de uma pessoa específica

## Instalação

Para rodar a API em sua máquina, siga os seguintes passos:

Faça o download do repositório
Configure o banco de dados PostgreSQL em sua máquina.
No arquivo <code>application.properties</code>, configure as informações de acesso ao seu banco de dados
Execute o comando <code>mvn spring-boot:run</code> para rodar a aplicação.
Acesse a API através do endereço <code>http://localhost:8080</code>

## Endpoints

* GET /pessoas: lista todas as pessoas cadastradas

```json
{
  "name": "Bruno Camargo",
  "cpf": "54267890800",
  "birthDate": "1994-06-27"
}
```


* GET /pessoas/{id}: consulta uma pessoa específica pelo seu ID
* POST /pessoas: cadastra uma nova pessoa
* PUT /pessoas/{id}: atualiza os dados de uma pessoa já cadastrada
* DELETE /pessoas/{id}: exclui uma pessoa pelo seu ID
