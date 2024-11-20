-- liquibase formatted sql

-- changeset ggainullin:1

CREATE TABLE ad
(
  id INTEGER PRIMARY KEY,
  image TEXT,
  price INTEGER NOT NULL,
  title TEXT NOT NULL,
  description TEXT,
  user_id INTEGER,
  FOREIGN KEY (user_id) REFERENCES users(id)
)
