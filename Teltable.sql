drop table TelTable;
 
create table TelTable ( 
name varchar2(30),
tel varchar2(20)

); 
 insert into TelTable values  ('babo','010-777-8888');
 
 insert into TelTable values ('kongjoo','010-234-5678');
 
 commit;
 
 select * from TELTABLE;
 
 create table teltable55 (
   id    number(5),
   name  varchar2(20),
   tel   varchar2(20)
   );
   
   
   insert into teltable55
   values (1,'ondal', '010-7878-3215');
   
    insert into teltable55
   values (2,'kongjoo', '010-3333-7777');
   
   commit;
   
   select * from teltable55;
   update teltable55 set name = 'doyoung' where tel is null;
   update teltable55 set name= 'leedonghyuk' where name = '�̵���';
   rollback;
--   
SELECT * FROM TAB;
SELECT * FROM TELTABLE55_MEMBER;

DROP TABLE TELTABLE55_MEMBER;

CREATE TABLE TELTABLE55_MEMBER(
    ID VARCHAR2(50),
    PW VARCHAR2(50)
); 
commit;
   
   