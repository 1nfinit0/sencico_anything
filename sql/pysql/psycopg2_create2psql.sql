-- Crea la tabla:
DROP TABLE IF EXISTS prueba.persona_psycopg2;
CREATE TABLE prueba.persona_psycopg2 (
    id serial PRIMARY KEY,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    edad integer NOT NULL
);
-- Rellena la tabla:
INSERT INTO prueba.persona_psycopg2 (nombre, apellido, edad) VALUES
('Juan', 'Perez', 25),
('Pedro', 'Perez', 30),
('Maria', 'Perez', 35),
('Juana', 'Perez', 40),
('Jose', 'Perez', 45),
('Jorge', 'Perez', 50),
('Javier', 'Perez', 55),
('Juan', 'Gomez', 25),
('Pedro', 'Gomez', 30),
('Maria', 'Gomez', 35),
('Juana', 'Gomez', 40),
('Jose', 'Gomez', 45),
('Jorge', 'Gomez', 50),
('Javier', 'Gomez', 55);
