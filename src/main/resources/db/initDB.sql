DROP TABLE IF EXISTS stars;
DROP TABLE IF EXISTS star_type;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;


CREATE TABLE stars
(
  star_id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  star_name     VARCHAR NOT NULL,
  coordinate1   VARCHAR NOT NULL,
  coordinate2   VARCHAR NOT NULL,
  star_type     VARCHAR NOT NULL,
  discoverer    VARCHAR NOT NULL
);

CREATE TABLE star_type
(
  star_type_id INTEGER PRIMARY KEY NOT NULL,
  star_type    VARCHAR NOT NULL,
  CONSTRAINT star_type_idx UNIQUE (star_type, star_type_id)
);