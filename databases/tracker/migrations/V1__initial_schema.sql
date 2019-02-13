CREATE TABLE time_entries (
  id         BIGINT(25) NOT NULL AUTO_INCREMENT,
  project_id BIGINT(25),
  user_id    BIGINT(25),
  date       DATE,
  hours      INT,
  PRIMARY KEY (id)
)
  ENGINE = innodb
  DEFAULT CHARSET = utf8;