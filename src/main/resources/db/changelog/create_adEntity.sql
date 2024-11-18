-- liquibase formatted sql

-- changeset ggainullin:1

CREATE TABLE ad
(
  id INTEGER PRIMARY KEY,
  image TEXT,
  price INTEGER,
  title TEXT,
  description TEXT,
  user_id INTEGER,
  FOREIGN KEY (user_id) REFERENCES users(id)
)
