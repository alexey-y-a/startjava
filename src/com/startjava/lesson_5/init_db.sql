\c robots;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id          SERIAL        PRIMARY KEY,
    model_name  VARCHAR(50)   NOT NULL,
    mark        VARCHAR(50)   NOT NULL,
    height      NUMERIC(5, 2) NOT NULL,
    weight      NUMERIC(6, 2) NOT NULL,
    status      VARCHAR(20)   NOT NULL,
    origin      VARCHAR(50)   NOT NULL,
    launch      DATE          NOT NULL,
    kaiju_kill  INT           NOT NULL
);

\i populate.sql
\i queries.sql