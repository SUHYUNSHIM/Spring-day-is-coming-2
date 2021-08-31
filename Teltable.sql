drop table TelTable;
 
create table TelTable ( 
name varchar2(30),
tel varchar2(20)

); 
 insert into TelTable values  ('babo','010-777-8888');
 
 insert into TelTable values ('kongjoo','010-234-5678');
 
 commit;
 
 select * from TELTABLE;