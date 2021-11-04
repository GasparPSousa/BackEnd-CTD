CREATE TABLE IF NOT EXISTS medicamentos(
id int auto_increment primary key,
nome varchar(64),
laboratorio varchar(64),
quantidade int,
preco double);