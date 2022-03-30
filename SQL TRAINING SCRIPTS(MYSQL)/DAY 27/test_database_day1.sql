show databases;
create database test;
use test;
show tables;
drop database test;
create database coffee_store;
use coffee_store;

show databases;
drop database coffee_store;
-----------------------------------------------------------------------------------------

create database example;
use example;


create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);

show tables;

-- Query to alter table to add primary key-

alter table addresses
add primary key(id);

describe addresses;

create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int);

alter table people
add primary key(id);

describe people;

create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int);

alter table pets
add primary key(id);

describe pets;

-- Query to drop primary key of a table

alter table pets
drop primary key;

describe pets;

-- Query to alter a column name

alter table addresses
change id address_id int;

describe addresses;

-- Query to add a column to a table

alter table people
add address_id int;

describe people;

-- Query to add a foreign key to a table

alter table people
add constraint fk_address_id
foreign key (address_id) references addresses(address_id);

describe people;

-- Query to delete a foreign key

alter table people
drop foreign key fk_address_id;

describe people;

-- Query to see properties of a table

show create table people;

-- Query to change datatype of a column

alter table people
modify id varchar(20);

describe people;

alter table people
modify id int;

-- Query to add a unique constraint

alter table people
add unique(first_name);

describe people;

-- Query to delete a unique constraint

alter table people
drop index first_name;

describe people;







