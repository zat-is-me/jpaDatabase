/*create table Person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
*/
INSERT INTO PERSON (ID, NAME,LOCATION, BIRTH_DATE)
VALUES(10001, 'Tatek', 'Baltimore', sysdate());
INSERT INTO PERSON (ID, NAME,LOCATION, BIRTH_DATE)
VALUES(10002, 'Tagle', 'Wolkite', sysdate());
INSERT INTO PERSON (ID, NAME,LOCATION, BIRTH_DATE)
VALUES(10003, 'sega', 'Dilla', sysdate());
INSERT INTO PERSON (ID, NAME,LOCATION, BIRTH_DATE)
VALUES(10004, 'kal', 'Dilla', sysdate());
