-- liquibase formatted sql

-- changeset ggainullin:1

CREATE TABLE comment
(
  id INTEGER PRIMARY KEY,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  text TEXT,
  ad_id INTEGER,
  user_id INTEGER,
  FOREIGN KEY (ad_id) REFERENCES ad(id),
  FOREIGN KEY (user_id) REFERENCES users(id)
)
