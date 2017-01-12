DROP TABLE IF EXISTS star_type;
DROP TABLE IF EXISTS stars;
DROP TABLE IF EXISTS discoverer;
DROP SEQUENCE IF EXISTS global_seq;
DROP SEQUENCE IF EXISTS discoverer_seq;

CREATE SEQUENCE global_seq START 100000;
CREATE SEQUENCE discoverer_seq START 1;

CREATE TABLE stars
(
  star_id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  star_name     VARCHAR NOT NULL,
  coordinate1   VARCHAR NOT NULL,
  coordinate2   VARCHAR NOT NULL,
  star_type_id  INTEGER NOT NULL,
  discoverer_id INTEGER NOT NULL
);

CREATE TABLE star_type
(
  star_type_id INTEGER PRIMARY KEY NOT NULL,
  star_type    VARCHAR NOT NULL,
  CONSTRAINT star_type_idx UNIQUE (star_type, star_type_id)
);

CREATE TABLE discoverer (
  discoverer_id       INTEGER PRIMARY KEY DEFAULT nextval('discoverer_seq'),
  discoverer_name     VARCHAR NOT NULL
);
ALTER TABLE stars ADD CONSTRAINT discoverer FOREIGN KEY (discoverer_id) REFERENCES discoverer (discoverer_id)
ON DELETE CASCADE
ON UPDATE CASCADE