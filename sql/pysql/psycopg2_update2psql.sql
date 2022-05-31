-- Actualiza la tabla
UPDATE prueba.persona_psycopg2 SET
    edad = edad + 1
    WHERE nombre = 'Juan';