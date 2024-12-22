CREATE TABLE IF NOT EXISTS  produto
(
    id             INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    descricao      VARCHAR(50)    NOT NULL,
    valor_unitario NUMERIC(10, 2) NOT NULL
);
