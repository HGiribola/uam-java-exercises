CREATE TABLE musica(
	codigo_musica INTEGER PRIMARY KEY NOT NULL,
	nome_musica CHAR(100) NOT NULL,
	duracao_musica TIME NOT NULL
);

CREATE TABLE cd_categoria(
	codigo_categoria INTEGER PRIMARY KEY NOT NULL,
    menor_preco DECIMAL NOT NULL,
    maior_preco DECIMAL NOT NULL
);

CREATE TABLE faixa(
    codigo_musica INTEGER PRIMARY KEY NOT NULL,
    codigo_cd INTEGER NOT NULL,
	numero_faixa INTEGER NOT NULL
);

CREATE TABLE musica_autor(
	codigo_musica INTEGER PRIMARY KEY NOT NULL,
    codigo_autor INTEGER NOT NULL
);

CREATE TABLE autor(
	codigo_autor INTEGER PRIMARY KEY NOT NULL,
    nome_autor CHAR(50)
);

USE meubanco;
