-- Exercise -2
/* 
1) select the film name and length for all the films with a length greater than the avergae film length)
2)select the maximum number and minimum number of screenings for a particular table
3) select each film name and the number of screenings for that film
*/

-- Q1
select name as film_name,length_min as film_length from films
where length_min > (select avg(length_min) from films);

-- Q2
select f.name as film_name,max(s.id),min(s.id) from screenings s
inner join films f on s.film_id=f.id
group by f.name;

-- Q3
select f.name as film_name,count(s.id) as No_of_screening from screenings s
inner join films f on s.film_id=f.id
group by s.film_id;