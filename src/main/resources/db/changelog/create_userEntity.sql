-- liquibase formatted sql

-- changeset ggainullin:1

CREATE TABLE users
(
  id INTEGER PRIMARY KEY,
  first_name TEXT,
  last_name TEXT,
  email TEXT UNIQUE,
  phone TEXT,
  role TEXT,
  image TEXT,
  password TEXT
)