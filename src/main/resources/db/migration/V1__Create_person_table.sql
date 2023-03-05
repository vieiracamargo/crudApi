CREATE TABLE pessoa(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf CHAR(11) NOT NULL,
    data_nascimento TIMESTAMP NOT NULL
);