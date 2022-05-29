DROP TABLE IF EXISTS sample01;

CREATE TABLE sample01(
    id INTEGER PRIMARY KEY,
    content VARCHAR(32)
);

INSERT INTO sample01(id, content) VALUES(1, 'aaa');
INSERT INTO sample01(id, content) VALUES(2, 'bbb');
INSERT INTO sample01(id, content) VALUES(3, 'ccc');
