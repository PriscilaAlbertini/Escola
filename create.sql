CREATE TABLE periodo (
	id SERIAL NOT NULL,
	descricao VARCHAR NOT NULL,
	CONSTRAINT pk_periodo PRIMARY KEY (id)
);

INSERT INTO periodo (id, descricao) VALUES (1, 'MATUTINO');
INSERT INTO periodo (id, descricao) VALUES (2, 'VESPERTINO');
INSERT INTO periodo (id, descricao) VALUES (3, 'NOTURNO');
INSERT INTO periodo (id, descricao) VALUES (4, 'INTEGRAL');

CREATE TABLE curso (
	id SERIAL NOT NULL,
	descricao VARCHAR(50) NOT NULL,
	duracao INTEGER NOT NULL,
	id_periodo INTEGER NOT NULL,
	quantidadealunos INTEGER NOT NULL,
	cargahoraria INTEGER NOT NULL,
	CONSTRAINT pk_curso PRIMARY KEY (id),
	CONSTRAINT fk_periodo FOREIGN KEY (id_periodo) REFERENCES periodo (id)
);

CREATE TABLE titulo (
	id SERIAL NOT NULL,
	descricao VARCHAR(100),
	CONSTRAINT pk_titulo PRIMARY KEY (id)
);

INSERT INTO titulo (id, descricao) VALUES (1, 'DOUTOR');
INSERT INTO titulo (id, descricao) VALUES (2, 'MESTRE');
INSERT INTO titulo (id, descricao) VALUES (3, 'ESPECIALISTA');
INSERT INTO titulo (id, descricao) VALUES (4, 'GRADUADO');

CREATE TABLE professor (
	id SERIAL NOT NULL,
	nome VARCHAR(100),
	rg NUMERIC(9, 0),
	cpf NUMERIC(11, 0),
	id_titulo INTEGER NOT NULL,
	CONSTRAINT pk_professor PRIMARY KEY (id),
	CONSTRAINT fk_titulo FOREIGN KEY (id_titulo) REFERENCES titulo (id)
);

CREATE TABLE diasemana (
	id SERIAL NOT NULL,
	descricao VARCHAR(20),
	CONSTRAINT pk_diasemana PRIMARY KEY (id)
);

INSERT INTO diasemana (id, descricao) VALUES (1, 'SEGUNDA-FEIRA');
INSERT INTO diasemana (id, descricao) VALUES (2, 'TERÇA-FEIRA');
INSERT INTO diasemana (id, descricao) VALUES (3, 'QUARTA-FEIRA');
INSERT INTO diasemana (id, descricao) VALUES (4, 'QUINTA-FEIRA');
INSERT INTO diasemana (id, descricao) VALUES (5, 'SEXTA-FEIRA');
INSERT INTO diasemana (id, descricao) VALUES (6, 'SÁBADO');


CREATE TABLE disciplina (
	id SERIAL NOT NULL,
	descricao VARCHAR(50),
	ementa TEXT,
	limite INTEGER NOT NULL,
	id_professor INTEGER NOT NULL,
	id_diasemana INTEGER NOT NULL,
	cargahoraria INTEGER NOT NULL,
	CONSTRAINT pk_disciplina PRIMARY KEY (id),
	CONSTRAINT fk_professor FOREIGN KEY (id_professor) REFERENCES professor (id),	
	CONSTRAINT fk_diasemana FOREIGN KEY (id_diasemana) REFERENCES diasemana (id)
);

CREATE TABLE aluno (
	id SERIAL NOT NULL,
	matricula INTEGER NOT NULL,
	nome VARCHAR(100),
	rg NUMERIC (9, 0),
	cpf NUMERIC (11, 0),
	CONSTRAINT pk_aluno PRIMARY KEY (id)
);

CREATE TABLE cursodisciplina (
	id SERIAL NOT NULL,
	id_curso INTEGER NOT NULL,
	id_disciplina INTEGER NOT NULL,
	CONSTRAINT pk_cursodisciplina PRIMARY KEY (id),
	CONSTRAINT fk_curso FOREIGN KEY (id_curso) REFERENCES curso (id),
	CONSTRAINT fk_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina (id),
	CONSTRAINT fk_diasemana FOREIGN KEY (id_diasemana) REFERENCES diasemana (id),
	CONSTRAINT fk_periodo FOREIGN KEY (id_periodo) REFERENCES periodo (id)
);

CREATE TABLE alunodisciplina (
	id SERIAL NOT NULL,
	id_aluno INTEGER NOT NULL,
	id_disciplina INTEGER NOT NULL,
	id_periodo INTEGER NOT NULL,
	CONSTRAINT pk_alunodisciplina PRIMARY KEY (id),
	CONSTRAINT fk_aluno FOREIGN KEY (id_aluno) REFERENCES aluno (id),
	CONSTRAINT fk_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina (id),
	CONSTRAINT fk_periodo FOREIGN KEY (id_periodo) REFERENCES periodo (id)
);

CREATE TABLE diasemanadisciplina (
	id SERIAL NOT NULL,
	id_diasemana INTEGER NOT NULL,
	id_disciplina INTEGER NOT NULL,
	CONSTRAINT pk_diasemanadisciplina PRIMARY KEY (id),
	CONSTRAINT fk_diasemana FOREIGN KEY (id_diasemana) REFERENCES diasemana (id),
	CONSTRAINT fk_disciplina FOREIGN KEY (id_disciplina) REFERENCES disciplina (id)
);

