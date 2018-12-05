drop table employee;
drop table project;
drop table u_employee;
drop table u_relaion;
commit;

create table Employee
(
Emp_ID int not null, 
Emp_Name char (50),
Dept_ID char(50),
Primary Key (Emp_ID)
);

insert into Employee
values
(100, "Vishwa","Tech"),
(200, "Pranab","Tech"),
(350, "Bhavana","Non-Tech"),
(250, "Swati","Non-Tech"),
(600, "Nikhil","Tech"),
(399, "Neha","HR"),
(299, "Priya","HR");

select * from Employee;

update Employee
Set Dept_ID=1
where Dept_ID="Tech"; 

select * from Employee;
 
update Employee
set Dept_ID = 
CASE 
when Dept_ID = 'Tech' then '1' 
when Dept_ID = 'Non-Tech' then '2'
when Dept_ID = 'HR' then '3'
ELSE "Not find"
END
where Dept_ID in ('Tech', 'Non-Tech','HR');

select * from Employee;

create table Dept
( 
Dept_ID char(50),
Dept_Name char(50),
Primary Key (Dept_ID)
);

select * from Dept;

insert into Dept 
values
(1, "Tech"),
(2, "Non-Tech"),
(3, "HR");

select * from dept;

Select Emp_ID,Emp_Name,Dept_Name
from Employee,Dept
where Employee.Dept_ID=Dept.Dept_ID;


Select Emp_ID,Emp_Name,Dept_Name
from Employee
Join Dept
On Employee.Dept_ID=Dept.Dept_ID;


Select Emp_ID,Emp_Name,Dept_Name
from Employee
inner Join Dept
On Employee.Dept_ID=Dept.Dept_ID;

Select Emp_ID,Emp_Name,Dept_Name
from Employee
left Join Dept
On Employee.Dept_ID=Dept.Dept_ID;


Select Emp_ID,Emp_Name,Dept_Name
from Employee
right Join Dept
On Employee.Dept_ID=Dept.Dept_ID;





