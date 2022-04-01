show databases;
-- ------------------------------creating the database--------------------------------------------------------------
-- question 1
create database project_movie_data;
use project_movie_data;
-- --------------------------------creating the tables-----------------------------------------------------------------
-- question 2
create table actor(
act_id int auto_increment primary key,
act_fname char(20),
act_lname char(20),
act_gender char(1));

create table director(
dir_id int auto_increment primary key,
dir_fname char(20),
dir_lname char(20));

create table movie(
mov_id int auto_increment primary key,
mov_title char(50),
mov_year int,
mov_time int,
mov_lang char(50),
mov_dt_rel date,
mov_rel_country char(5));

create table genres(
gen_id int auto_increment primary key,
gen_title char(20));

create table reviewer(
rev_id int auto_increment primary key,
rev_name char(30));

create table movie_cast(
act_id int ,
mov_id int,
role char(30));

alter table movie_cast
add constraint fk_act_id
foreign key(act_id) references actor(act_id);

alter table movie_cast
add constraint fk_mov_id
foreign key(mov_id) references movie(mov_id);

desc movie_cast;
drop table movie_cast;

create table movie_genres(
mov_id int,
gen_id int,
foreign key(mov_id) references movie(mov_id),
foreign key(gen_id) references genres(gen_id));

create table rating(
mov_id int,
rev_id int,
rev_stars int,
num_o_ratings int,
foreign key (mov_id)references movie(mov_id),
foreign key(rev_id) references reviewer(rev_id));

create table movie_direction(
dir_id int,
mov_id int,
foreign key (dir_id)references director(dir_id),
foreign key(mov_id) references movie(mov_id));
-- ---------------------------------------------------------------------------------------------------------------------------------------
show tables;
use project_movie_data;
-- ----------------------------------------inserting values to tables-------------------------------------------------------------------------
insert into actor(act_id,act_fname,act_lname,act_gender)
values(101,'James','Stewart','M');
insert into actor(act_fname,act_lname,act_gender)
values('Deborah','Kerr','F');
insert into actor(act_fname,act_lname,act_gender)
values('Peter','OToole','M'),('Robert','De Niro','M'),('F.Murray','Abraham','M'),
('Harrison','Ford','M'),('Nicole','Kidman','F'),('Stephen','Baldwin','M'),
('Jack','Nicholson','M'),('Mark','Wahlberg','M'),('Woody','Allen','M'),
('Claire','Danes','F'),('Tim','Robbins','M'),('Kevin','Spacey','M'),
('Kate','Winslet','F'),('Robin','Williams','M'),('Jon','Voight','M'),
('Ewan','McGregor','M'),('Christian','Bale','M'),('Maggie','Gyllenhaal','F'),
('Dev','Patel','M'),('Sigourney','Weaver','F'),('David','Aston','M'),
('Ali','Astin','F');

select*from actor;
-- *******************************
insert into director(dir_id,dir_fname,dir_lname)
values(201,'Alfred','Hitchcock');
insert into director(dir_fname,dir_lname)
values('Jack','Clayton'),('David','Lean'),('Michael','Cimino'),
('Milos','Forman'),('Ridley','Scott'),('Stanley','Kubrick'),
('Bryan','Singer'),('Roman','Polanski'),('Paul','Thomas Anderson'),
('Woody','Allen'),('Hayo','Miyazaki'),('Frank','Darabont'),
('Sam','Mendes'),('James','Cameron'),('Gus','Van Sant'),
('John','Boorman'),('Danny','Boyle'),('Christopher','Nolan'),
('Richard','Kelly'),('Kevin','Spacey'),('Andrei','Tarkovsky'),
('Peter','Jackson');

select* from director;
-- *********************************
insert into genres(gen_id,gen_title)
values(1001,'Action');
insert into genres(gen_title)
values('Adventure'),('Animation'),('Biography'),('Comedy'),
('Crime'),('Drama'),('Horro'),('Music'),
('Mystery'),('Romance'),('Thriller'),('War');

select* from genres;
-- *********************************
insert into movie(mov_id,mov_title,mov_year,mov_time,mov_lang,mov_dt_rel,mov_rel_country)
values(901,'Vertigo',1958,128,'English','1958-08-24','UK');
insert into movie(mov_title,mov_year,mov_time,mov_lang,mov_dt_rel,mov_rel_country)
values('The Innocents',1961,100,'English','1962-02-19','SW'),
('Lawrence of Arabia',1962,216,'English','1962-12-11','UK'),
('The Deer Hunter',1978,183,'English','1979-03-08','UK'),
('Amadeus',1984,160,'English','1985-01-07','UK'),
('Blade Runner',1982,117,'English','1982-09-09','UK'),
('Eyes Wide Shut',1999,159,'English',null,'UK'),
('The Usual Suspects',1995,106,'English','1995-08-25','UK'),
('Chinatown',1974,130,'English','1974-08-09','UK'),
('Boogie Nights',1997,155,'English','1998-02-16','UK'),
('Annie Hall',1977,93,'English','1977-04-20','USA'),
('Princess Mononoke',1997,134,'Japanese','2001-10-19','UK'),
('The Shawshank Redemption',1994,142,'English','1995-02-17','UK'),
('American Beauty',1999,122,'English',null,'UK'),
('Titanic',1997,194,'English','1998-01-23','UK'),
('Good Will Hunting',1997,126,'English','1998-06-03','UK'),
('Deliverance',1972,109,'English','1982-10-05','UK'),
('Trainspotting',1996,94,'English','1996-02-23','UK'),
('The Prestige',2006,130,'English','2006-11-10','UK'),
('Donnie Darko',2001,113,'English',null,'UK'),
('Slumdog Millionaire',2008,120,'English','2009-01-09','UK'),
('Aliens',1986,137,'English','1986-08-29','UK'),
('Beyond the Sea',2004,118,'English','2004-11-26','UK'),
('Avatar',2009,162,'English','2009-12-17','UK');
insert into movie(mov_id,mov_title,mov_year,mov_time,mov_lang,mov_dt_rel,mov_rel_country)
values(926,'Seven Samurai',1954,207,'Japanese','1954-04-26','JP'),
(927,'Spirited Away',2001,125,'Japanese','2003-09-12','UK'),
(928,'Back to Future',1985,116,'English','1985-12-04','UK'),
(925,'Braveheart',1995,178,'English','1995-09-08','UK');

select*from movie;
-- ****************************************************
insert into movie_cast
values(101,901,'John Scottie Ferguson');
insert into movie_cast(act_id,mov_id,role)
values (102,902,'Miss Giddens');
/*(103,903,'T E Lawrence'),(104,904,'Michael'),(105,905,'Antonio Salieri'),
(106,906,'Rick Deckard');('Alice Harford'),
('McManus'),('Eddie Adams'),('Alvy Singer'),
('San'),('Andy Dufresne'),('Lester Burnham'),
('Rose Dewitt Bukater'),('Sean Maguire'),
('Ed'),('Renton'),('Elizabeth Darko'),
('Older Jamal'),('Ripley'),('Bobby Darin'),
('J.J Gittes'),('Alfred Borden');*/

select*from movie_cast;
desc movie_cast;
desc movie;
desc actor;
truncate movie_cast;
-- **************************************************************
insert into reviewer(rev_id,rev_name)
values(9001,'Righty Sock');
insert into reviewer(rev_name)
values('Jack Malvern'),('Flagrant Baronessa'),('Alec Shaw'),
(null),('Victor Woeltjen'),('Simon Wright'),('Neal Wruck'),
('Paul Monks'),('Mike Salvati'),(null),('Wesley S.Walker'),
('Sasha Goldshtein'),('Josh Cates'),('Krug Stillo'),
('Scott LeBrun'),('Hannah Steele'),('Vincent Cadena'),
('Brandt Sponseller'),('Richard Adams');

select*from reviewer;
-- ***************************************************************
