/* exercise-1
1) select the customer id and count the number of reserved seats grouped by customer for october 2017.
2) select the film name and count the number of screenings for each film that is over 2 hours long.
*/

select * from bookings;
select * from reserved_seat;
select * from seats;
select * from customers;
select * from films;
select * from rooms;
select * from screenings;
show tables;

-- Q1
select customer_id,count(customer_id) from bookings
where screening_id in
( select id from screenings where start_time between '2017-10-01 00:00:00' and '207-10-31 00:00:00');

-- Q2
select id, start_time,count(film_id) from screenings
where film_id in
	(select id from films
    where length_min>120);
