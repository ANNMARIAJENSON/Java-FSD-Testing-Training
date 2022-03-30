-- 1) from products table, select the name and price of all the products with a coffee origin equal to columbia or Indonesia. Ordered by name from A-Z
-- 2) from orders table, select all the orders from february 2017 for customers with id's of 2,4,6 or 8.
-- 3)from the customers table, select the first_name and phone_number of all the customers who's last name contains the pattern 'ar'.

-- q1

select name , price 
from products
where coffee_origin in('Columbia','Indonesia')
order by name asc;

-- q2

select * from orders 
where order_time between '2017-02-01' and '2017-02-28'
and customer_id in(2,4,6,8);

-- q3

select first_name,phone_number
from customers
where last_name like '%ar%';