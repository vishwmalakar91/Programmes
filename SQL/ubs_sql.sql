create table U_Employee
(Emp_ID int not null, 
Emp_Name char (50),
Dept_ID char(50),
Primary Key (Emp_ID));

insert into U_Employee 
values
(100, "Vishwa","Tech"),
(200, "Pranab","Tech"),
(300, "Bhavana","Non-Tech"),
(2, "Nikhil","Tech"),
(3, "Own","Tech");

create table U_Relaion
(Emp_ID int not null, 
Manager_ID int not null,
Primary Key (Emp_ID));

insert into U_Relaion 
values
(100,2),
(200,2),
(300,3),
(2,2),
(3,3);
select * from u_employee;
select * from u_relaion;

select a.Emp_Name ,a.Emp_Id,a.Dept_Id,r.manager_Id 
from u_employee a,u_relaion r
where r.Emp_Id=a.EMp_ID;

select x.Emp_Name ,x.Dept_id ,y.Emp_name as manager_Name
from(select a.Emp_Name ,a.Emp_Id,a.Dept_Id,r.manager_Id from u_employee a,u_relaion r where r.Emp_Id=a.EMp_ID) x,
	(select a.Emp_Name ,a.Emp_Id,a.Dept_Id,r.manager_Id from u_employee a,u_relaion r where r.Emp_Id=a.EMp_ID) y
where x.manager_id=y.Emp_id;