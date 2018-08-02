DROP DATABASE IF EXISTS exemplo_web_01;
CREATE DATABASE IF NOT EXISTS exemplo_web_01;
USE exemplo_web_01;

CREATE TABLE alimentos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100),
	preco DOUBLE,
	quantidade SMALLINT,
	descricao VARCHAR(100)
);
INSERT INTO alimentos(nome, preco, quantidade) VALUES
("maçã", 3, 10),
("calabresa", 30, 1),
("suco", 1.50,2),
("sopa", 15,1);
