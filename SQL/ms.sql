-- Create employee table with some coloumn

drop table employee;
drop table Project;
commit;

create table Employee
(
Employee_ID int NOT NULL,
Employee_Name char(50) NOT NULL,
Employee_Email char(50) NOT NULL,
Manager_ID int NOT null,
PRIMARY KEY (Employee_ID)
);

-- inserting single row with some value in employee table

insert into Employee values
 (3509,"Vishwanath Malakar","vmalakar@test.com",100);
 
 -- inserting multiple value in employee table
 
 insert into Employee values
 (3511,"Deepak Vemula","deepak@test.com",300),
 (3508,"Pranab Pradhan","pranab@test.com",100);
 
 insert into Employee values
 (100,"Nikhil D","nikhil@test.com",10),
 (300,"Joseph Jude","jude@test.com",10),
 (10,"Prashant BEniwal","prashant@test.com",1);
 
-- updating some wronge types value in employee table
 
update Employee 
Set Employee_Name="Prashant Beniwal"
where Employee_ID=10;
  
  
update Employee 
Set Manager_ID="10"
where Employee_ID=10;

  -- Create Project table with some coloumn
  
create table Project
(
Employee_ID int NOT NULL,
Project_ID char(50) NOT NULL,
Project_Name char(50) NOT NULL,
PRIMARY KEY (Employee_ID)
);

-- inserting  rows with some value in project table

 insert into Project values
(3508,"Hello","Hello"),
(3509,"Hello","Hello"),
(100,"Hello","Hello"),
(300,"1Peg","1Peg"),
(10,"Hello 1Peg","1Peg,Hello");
    

select * from Employee;
select * from Project;

select * from Employee where Employee_Name like '%pak%' ;
select distinct Manager_ID from Employee;

select * from Employee where Manager_ID=100;


-- Self Join , get Employee name from Managers Name 

select a.Employee_ID, a.Employee_Name, b.Employee_Name as Manager_Name ,b.Employee_Email as Manager_Email
from Employee a,Employee b 
where a.Manager_ID=b.Employee_ID
and b.Employee_name like '%Nikhil%'; 

-- Self Join , get Managers Name and email

select distinct a.Manager_ID ,b.Employee_Name as Manager_Name ,b.Employee_Email as Manager_Email
from Employee a,Employee b
where a.Manager_ID = b.Employee_ID;

-- Self Join , get Employee name with Managers Name and email

select a.Employee_ID, a.Employee_Name ,a.Employee_Email, b.Employee_Name as Manager_Name ,b.Employee_Email as Manager_Email 
from Employee a,Employee b 
where a.Manager_ID=b.Employee_ID; 

-- Join , get Employee name with Managers Name and email
select * from Employee a, project b where a.Employee_ID=b.Employee_ID;


--  Join , get Employee having Projects
select Employee_ID,Employee_Name from Employee where Employee_ID in (select employee_id from Project);

--  Join , get Employee NOT having Projects

select Employee_ID,Employee_Name , Employee_Email from Employee where Employee_ID not in (select employee_id from Project);

--  Join , get Employee and managers details having Projects

select a.Employee_ID, a.Employee_Name, a.Employee_Email , b.Employee_Name as Manager_Name, b.Employee_Email as Manager_Email , c.Project_ID, c.project_Name
from Employee a, Employee b , Project c
where a.manager_ID=b.Employee_ID
and a.Employee_ID=c.Employee_ID;  


--  Join , get Employee and managers details NOT having Projects
select distinct a.Employee_ID, a.Employee_Name, a.Employee_Email , b.Employee_Name as Manager_Name, b.Employee_Email as Manager_Email
from Employee a, Employee b , Project c
where a.manager_ID=b.Employee_ID
and a.Employee_ID not in (select Employee_ID from Project); 

--  inner Join , get Employee name having projects
select Employee.Employee_ID, Employee_Name,Employee_Email
from Employee
inner join Project
on Employee.Employee_ID=Project.Employee_ID ;

--  inner Join , get Employee name having projects
select Employee.Employee_ID, Employee_Name,Employee_Email
from Employee
left join Project
on Employee.Employee_ID=Project.Employee_ID ;
