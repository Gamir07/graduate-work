-- liquibase formatted sql

-- changeset ggainullin:1

CREATE TABLE avatar
(
  id INTEGER,
  file_path TEXT,
  file_size BIGINT,
  media_type TEXT,
  data oid,
  FOREIGN KEY (id) REFERENCES users(id)
)