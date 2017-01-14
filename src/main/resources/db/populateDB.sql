DELETE FROM stars;
DELETE from star_type;

ALTER SEQUENCE global_seq RESTART WITH 100000;


-- stars
INSERT INTO stars (star_name, coordinate1, coordinate2, star_type, discoverer) VALUES
  ('Moon','1245','1244','Blue','Вова'),
  ('Mars','1675','1688','White','Петя'),
  ('Pluton','1245','1244','Yellow','Саня');


-- star_types
INSERT INTO star_type (star_type, star_type_id) VALUES
  ('Blue', 0),
  ('WhiteBlue', 1),
  ('White', 2),
  ('YellowWhite', 3),
  ('Yellow', 4),
  ('Orange', 5),
  ('Red', 6);


