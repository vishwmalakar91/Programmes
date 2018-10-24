create table Employee
(
Employee_ID int NOT NULL,
Employee_Name char(50) NOT NULL,
Employee_Email char(50) NOT NULL,
Manager_ID int NOT null,
PRIMARY KEY (Employee_ID)
);

insert into Employee values
 (103509,"Vishwanath Malakar","vmalakar@amdocs.com",100);
 
 insert into Employee values
 (103511,"Deepak Vemula","deepakv@amdocs.com",300),
 (103508,"Pranab Pradhan","pranabp@amdocs.com",100);
 
 insert into Employee values
 (100,"Nikhil D","nikhild@amdocs.com",10),
 (300,"Joseph Jude","jude@amdocs.com",10),
 (10,"Prashant BEniwal","prashantb@amdocs.com",1);
 
 
update Employee 
Set Employee_Name="Prashant Beniwal"
where Employee_ID=10;
    
create table Project
(
Employee_ID int NOT NULL,
Project_ID char(50) NOT NULL,
Project_Name char(50) NOT NULL,
PRIMARY KEY (Employee_ID)
);


 insert into Project values
(103508,"HALO","ATT HALO"),
(103509,"HALO","ATT HALO"),
(100,"HALO","ATT HALO"),
(300,"IPAG","IPAG"),
(10,"HI","ATT HALO, ATT IPAG");
    

select * from Employee;
select * from Project;

select * from Employee where Employee_Name like '%pak%' ;
select distinct Manager_ID from Employee;

select distinct a.Manager_ID ,b.Employee_Name as Manager_Name ,b.Employee_Email as Manager_Email
from Employee a,Employee b
where a.Manager_ID = b.Employee_ID;

-- Self Join
select a.Employee_ID, a.Employee_Name ,a.Employee_Email,
b.Employee_Name as Manager_Name ,b.Employee_Email as Manager_Email 
from Employee a,Employee b where a.Manager_ID=b.Employee_ID; 