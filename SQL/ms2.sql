drop table orders;
drop table Employee;

create table Employee
(
Employee_ID int NOT NULL,
Employee_Name char(50) NOT NULL,
Employee_Email char(50) NOT NULL,
Manager_ID int NOT null,
PRIMARY KEY (Employee_ID)
);

select * from Employee;


################  Adding extra column #######################


ALTER TABLE Employee
ADD COLUMN Employee_Address char(20) After Employee_Email;

select * from Employee;

ALTER TABLE Employee
ADD Employee_Project_ID char(20) first;

select * from Employee;

################  removing some column #######################


ALTER TABLE Employee
DROP COLUMN Manager_ID;

select * from Employee;

ALTER TABLE Employee
DROP Employee_Address;

Select * from Employee;

################  CALL Stored Procedure #######################

Call create_Employee_Table();
Select * from Employee;



