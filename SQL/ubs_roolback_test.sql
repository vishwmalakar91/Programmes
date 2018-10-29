drop table ubs_interview;

SET autocommit = 1;

create table ubs_interview
(
Employee_ID int NOT NULL,
Employee_Name char(50) NOT NULL,
Employee_Email char(50) NOT NULL,
Manager_ID int NOT null,
PRIMARY KEY (Employee_ID)
);

insert into ubs_interview
values(12,"Vishwa","test@gmail.com",100);

commit;

select * from ubs_interview;

rollback;

SAVEPOINT before_delet;

delete from ubs_interview where Employee_ID='12';

rollback;

select * from ubs_interview;