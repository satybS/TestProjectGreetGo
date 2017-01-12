DELETE FROM stars;
DELETE FROM star_type;
DELETE FROM discoverer;

ALTER SEQUENCE global_seq RESTART WITH 100000;
ALTER SEQUENCE discoverer_seq RESTART WITH 1;


INSERT INTO discoverer (discoverer_name) VALUES
  ('Вова'),
  ('Петя'),
  ('Вася'),
  ('Оля'),
  ('Нина'),
  ('Гриша');
-- stars
INSERT INTO stars (star_name, coordinate1, coordinate2, star_type_id, discoverer_id) VALUES
  ('Moon','1245','1244','1',1),
  ('Mars','1675','1688','2',1),
  ('Pluton','1245','1244','3',1);


-- star_types
INSERT INTO star_type (star_type, star_type_id) VALUES
  ('Blue', 1),
  ('WhiteBlue', 2),
  ('White', 3),
  ('YellowWhite', 4),
  ('Yellow', 5),
  ('Orange', 6),
  ('Red', 7);


