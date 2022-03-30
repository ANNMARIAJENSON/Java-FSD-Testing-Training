-- 1) from customers table, select distinct last names and order alphabetically from a-z.
-- 2) from orders table , select the first 3 orders placed by customer with id 1, in february 2017.
-- 3) from the products table, select the name , price and coffee_origin but rename the price to retail_price in the result set.alter.

-- Q1

select last_name from customers
order by last_name asc;

-- Q2
select * from orders
where order_time between '2017-02-01' and '2017-02-28'
and customer_id=1
order by order_time asc
limit 3;

-- Q3
select name,price as retail_price,coffee_origin from products;
