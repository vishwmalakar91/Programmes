create table Orders
(Customer_ID int NOT NULL,
Order_Id int NOT NULL,
Order_Date date NOT NULL,
primary key(Customer_ID)
);

insert into Orders
values
(2,10308,1996-09-18),
(37,10309,1998-09-18),
(77,10310,1993-09-18);

