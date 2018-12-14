show tables;
drop table dept,employee;

-- left table

create table customer
(
customer_id int not null,
first_name char(50),
last_name char(50),
email char(50),
address char(50),
city char(50),
state char(5),
zipcode int(6),
primary key(customer_id)
);

truncate customer;
truncate orders;

insert into customer
values
(1,	"George","Washington","gwashington@usa.gov","3200 Mt Vernon Hwy","Mount Vernon","VA",22121),
(2,	"John","Adams","jadams@usa.gov","1250 Hancock St","Quincyn","MA",02169),
(3,	"Thomas","Adams","tjefferson@usa.gov","931 Thomas Jefferson Pkwy","Charlottesville","VA",22902),
(4,	"James","Madison","jmadison@usa.gov","11350 Constitution Hwy","Orange","VA",22960),
(5,	"George","Monroe","jmonroe@usa.gov","2050 James Monroe Parkway","Charlottesville","VA",22902);

select * from customer;

-- right table 

create table orders(
order_id int not null,
order_date date,
amount float,
customer_id int not null,
primary key (order_id)
);

insert into orders
values
(1,'1776-12-01',234,1),
(2,'1770-12-02',56.9,3),
(3,'1774-12-03',124.22,2),
(4,'1774-11-04',64.56,3),
(5,'1774-12-05',14.56,10),
(6,'1776-12-06',234.56,9);

select * from orders;
select * from customer;

-- get a list of those customers who placed an order and the details of the order they placed
-- inner join  

################### INNER JOIN #############################

select first_name,last_name,order_date,amount
from customer,orders
where customer.customer_id=orders.customer_id;

-- same can be written as

SELECT 
    first_name, last_name, order_date, amount
FROM
    customer c
        INNER JOIN
    orders o ON c.customer_id = o.customer_id;

##########################  LEFT JOIN  ######################

-- If we wanted to simply append information about orders to our customers table, 
-- regardless of whether a customer placed an order or not, we would use a left join


select first_name, last_name, order_id,order_date, amount
from customer c
left join orders o
on c.customer_id = o.customer_id;

-- a list of all customers who have not placed an order

select first_name, last_name, order_date, amount
from customer c
left join orders o
on c.customer_id = o.customer_id
where order_date is NULL;

##########################  RIGHT JOIN  ######################

--  get a list of all orders, appended with customer information.

select first_name, last_name, order_date, amount
from  customer c
right join orders o
on c.customer_id = o.customer_id;

-- Simply adding a “where first_name is NULL” line to our SQL query returns a list of all orders fo
-- which we failed to record information about the customers who placed them:

select first_name, last_name, order_date, amount
from customer c
right join orders o
on c.customer_id = o.customer_id
where first_name is NULL;

##########################  FULL JOIN  ######################

-- join is by default full join

select c.first_name, c.last_name, o.order_date,o.amount
from customer c
full join orders o
on c.customer_id = o.customer_id;