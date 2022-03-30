-- ASSIGNMENT
-- 1) select first_name and phone_number of all the females who have a last name bluth
-- 2)from products table select the name of all the products wiht price greater than 3.00 or coffee_origin of SriLanka
-- 3)how many male customers dont have a phone_number entered into the table

-- Q1

select first_name,last_name,phone_number 
from customers
where gender='F' and last_name="Bluth";

-- Q2

select name
from products
where price > 3.00 or coffee_origin="Sri Lanka";

-- Q3

select * from customers
where gender='M' and  phone_number is null;

select count(id) from customers
where gender='M' and  phone_number is null;
