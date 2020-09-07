-- create authors table
CREATE TABLE IF NOT EXISTS authors
(
  id           SERIAL PRIMARY KEY,
  salutation   VARCHAR,
  name         VARCHAR NOT NULL,
  age          SMALLINT,
  is_deleted   BOOLEAN,
  created_date TIMESTAMP DEFAULT NOW(),
  updated_date TIMESTAMP DEFAULT NOW()
);

-- create books table
CREATE TABLE IF NOT EXISTS books
(
  id           serial PRIMARY KEY,
  author_id    INTEGER        NOT NULL,
  title        VARCHAR UNIQUE NOT NULL,
  description  VARCHAR,
  is_deleted   BOOLEAN,
  created_date TIMESTAMP DEFAULT NOW(),
  updated_date TIMESTAMP DEFAULT NOW(),
  FOREIGN KEY (author_id) REFERENCES authors (id)

);

